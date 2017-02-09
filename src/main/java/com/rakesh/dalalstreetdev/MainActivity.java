package com.rakesh.dalalstreetdev;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.protobuf.InvalidProtocolBufferException;
import com.koushikdutta.async.ByteBufferList;
import com.koushikdutta.async.DataEmitter;
import com.koushikdutta.async.callback.CompletedCallback;
import com.koushikdutta.async.callback.DataCallback;
import com.koushikdutta.async.http.AsyncHttpClient;
import com.koushikdutta.async.http.WebSocket;

import dalalstreet.socketapi.DalalMessageOuterClass;
import dalalstreet.socketapi.actions.Login;

public class MainActivity extends Activity {

    private EditText mAddr;
    private EditText mPrt;
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAddr = (EditText)findViewById(R.id.editText);
        mPrt = (EditText)findViewById(R.id.editText2);
        Button go = (Button) findViewById(R.id.button);

        final AsyncHttpClient.WebSocketConnectCallback mWebSocketConnectCallback = new AsyncHttpClient.WebSocketConnectCallback() {
            @Override
            public void onCompleted(Exception ex, WebSocket webSocket) {
                Log.e(TAG, "onConnected");
                if (ex != null) {
                    ex.printStackTrace();
                    return;
                }
                DalalMessageOuterClass.DalalMessage dalalMess = DalalMessageOuterClass.DalalMessage.newBuilder().
                        setRequestWrapper(DalalMessageOuterClass.RequestWrapper.newBuilder().
                                setLoginRequest(Login.LoginRequest.newBuilder().setEmail("106115092@nitt.edu").
                                        setPassword("Mymail@27").build()).build()).build();

                String s = dalalMess.toString();
                Log.e(TAG, "Sent Message : " + s);

                webSocket.send(dalalMess.toByteArray());
                webSocket.setStringCallback(new WebSocket.StringCallback() {
                    @Override
                    public void onStringAvailable(String s) {
                        Log.e(TAG, s);
                        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                    }
                });
                webSocket.setDataCallback(new DataCallback() {
                    public void onDataAvailable(DataEmitter emitter, ByteBufferList byteBufferList) {
                        try {
                            DalalMessageOuterClass.DalalMessage dalalMessage =
                                    DalalMessageOuterClass.DalalMessage.parseFrom(byteBufferList.getAllByteArray());

                            //String s = dalalMessage.getMessageTypeCase().toString();
                            String s = dalalMessage.toString();
                            Log.e(TAG, "Received Message : " + s);
                            //Toast.makeText(getApplicationContext(), "Message type = " + s, Toast.LENGTH_SHORT).show();
                        } catch (InvalidProtocolBufferException e) {
                            e.printStackTrace();
                        }
                        byteBufferList.recycle();
                    }
                });
                webSocket.setClosedCallback(new CompletedCallback() {
                    @Override
                    public void onCompleted(Exception ex) {
                        if(ex != null) throw new RuntimeException(ex);
                        Log.e(TAG, "Successfully closed connection");
                    }
                });

                webSocket.setEndCallback(new CompletedCallback() {
                    @Override
                    public void onCompleted(Exception ex) {
                        if(ex != null) throw new RuntimeException(ex);
                        Log.e(TAG, "Successfully ended connection");
                    }
                });
            }
        };
        final AsyncHttpClient mAsyncHttpClient = AsyncHttpClient.getDefaultInstance();

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hostAddress = "http://" + mAddr.getText().toString() + ":" + Integer.parseInt(mPrt.getText().toString()) + "/ws";
                Toast.makeText(getApplicationContext(), "Connecting to : " + hostAddress, Toast.LENGTH_SHORT).show();
                mAsyncHttpClient.websocket(hostAddress, null, mWebSocketConnectCallback);
            }
        });

    }
    /*public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }*/
/*    public class asyncTask extends AsyncTask<Void, Void, Void> {

        private String mAddress;
        private int mPort;
        private String response = "";

        asyncTask(String mAddr, int port){
            mAddress = mAddr;
            mPort = port;
        }

        @Override
        protected Void doInBackground(Void... arg0) {

            Socket socket = null;

            try {
                socket = new Socket(mAddress, mPort);

                ByteArrayOutputStream byteArrayOutputStream =
                        new ByteArrayOutputStream(1024);
                byte[] buffer = new byte[1024];

                int bytesRead;
                InputStream inputStream = socket.getInputStream();

                while ((bytesRead = inputStream.read(buffer)) != -1){
                    byteArrayOutputStream.write(buffer, 0, bytesRead);
                    response += byteArrayOutputStream.toString("UTF-8");
                    if (Objects.equals(response, ""))
                        response = "Success!";
                }

            } catch (UnknownHostException e) {
                e.printStackTrace();
                response = "UnknownHostException: " + e.toString();
            } catch (IOException e) {
                e.printStackTrace();
                response = "IOException: " + e.toString();
            } finally{
                if(socket != null){
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            mResponse.setText(response);
            super.onPostExecute(result);
        }

    }
*/
}
