package com.rakesh.dalalstreetdev;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Objects;

public class MainActivity extends Activity {

    TextView tresponse;
    EditText addr;
    EditText prt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tresponse = (TextView)findViewById(R.id.textView2);
        addr = (EditText)findViewById(R.id.editText);
        prt = (EditText)findViewById(R.id.editText2);
        Button go = (Button) findViewById(R.id.button);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                asyncTask asyncTask = new asyncTask(addr.getText().toString(), Integer.parseInt(prt.getText().toString()));
                asyncTask.execute();
            }
        });

    }
    public class asyncTask extends AsyncTask<Void, Void, Void> {

        private String mAddress;
        private int mPort;
        private String response = "";

        asyncTask(String addr, int port){
            mAddress = addr;
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
            tresponse.setText(response);
            super.onPostExecute(result);
        }

    }

}
