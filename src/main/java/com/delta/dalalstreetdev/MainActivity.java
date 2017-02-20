package com.delta.dalalstreetdev;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.protobuf.InvalidProtocolBufferException;
import com.koushikdutta.async.ByteBufferList;
import com.koushikdutta.async.DataEmitter;
import com.koushikdutta.async.callback.CompletedCallback;
import com.koushikdutta.async.callback.DataCallback;
import com.koushikdutta.async.http.AsyncHttpClient;
import com.koushikdutta.async.http.WebSocket;

import dalalstreet.socketapi.DalalMessageOuterClass;
import dalalstreet.socketapi.actions.BuyStocksFromExchange;
import dalalstreet.socketapi.actions.CancelAskOrder;
import dalalstreet.socketapi.actions.CancelBidOrder;
import dalalstreet.socketapi.actions.GetCompanyProfile;
import dalalstreet.socketapi.actions.GetLeaderboard;
import dalalstreet.socketapi.actions.GetMarketEvents;
import dalalstreet.socketapi.actions.GetMortgageDetails;
import dalalstreet.socketapi.actions.GetMyAsks;
import dalalstreet.socketapi.actions.GetMyBids;
import dalalstreet.socketapi.actions.GetNotifications;
import dalalstreet.socketapi.actions.GetTransactions;
import dalalstreet.socketapi.actions.Login;
import dalalstreet.socketapi.actions.Logout;
import dalalstreet.socketapi.actions.MortgageStocks;
import dalalstreet.socketapi.actions.PlaceAskOrder;
import dalalstreet.socketapi.actions.PlaceBidOrder;
import dalalstreet.socketapi.actions.RetrieveMortgageStocks;
import dalalstreet.socketapi.actions.Subscribe;
import dalalstreet.socketapi.actions.Unsubscribe;

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

                //TODO Send Req Wrappers here
                //Default Login req wrapper
                Login.LoginRequest loginRequest = Login.LoginRequest.
                        newBuilder().setEmail("106115092@nitt.edu").
                        setPassword("password").build();
                final DalalMessageOuterClass.DalalMessage dalalMess = DalalMessageOuterClass.DalalMessage.newBuilder().
                        setRequestWrapper(DalalMessageOuterClass.RequestWrapper.newBuilder().
                                setLoginRequest(loginRequest).build()).build();

                webSocket.send(dalalMess.toByteArray());
                Log.e(TAG, "Sent Message : " + dalalMess.toString());

                //Callback Handling
                webSocket.setDataCallback(new DataCallback() {
                    public void onDataAvailable(DataEmitter emitter, ByteBufferList byteBufferList) {
                        try {
                            DalalMessageOuterClass.DalalMessage dalalMessage =
                                    DalalMessageOuterClass.DalalMessage.parseFrom(byteBufferList.getAllByteArray());
                            Log.e(TAG, "Received Message : " + dalalMessage.toString());

                            //If Response wrapper
                            if(dalalMessage.getMessageTypeCase().getNumber()==2) {
                                parseResponseWrapper(dalalMessage.getResponseWrapper());
                            }

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
                mAsyncHttpClient.websocket(hostAddress, null, mWebSocketConnectCallback);
            }
        });

    }

    void parseResponseWrapper(DalalMessageOuterClass.ResponseWrapper responseWrapper) {
        switch (responseWrapper.getResponseCase().getNumber()) {
            case 0: break; //Response not set
            case 3:
                buy_stocks_from_exchange_response(responseWrapper.getBuyStocksFromExchangeResponse());
                break;
            case 4:
                cancel_ask_order_response(responseWrapper.getCancelAskOrderResponse());
                break;
            case 5:
                cancel_bid_order_response(responseWrapper.getCancelBidOrderResponse());
                break;
            case 6:
                login_response(responseWrapper.getLoginResponse());
                break;
            case 7:
                logout_response(responseWrapper.getLogoutResponse());
                break;
            case 8:
                mortgage_stocks_response(responseWrapper.getMortgageStocksResponse());
                break;
            case 9:
                place_ask_order_response(responseWrapper.getPlaceAskOrderResponse());
                break;
            case 10:
                place_bid_order_response(responseWrapper.getPlaceBidOrderResponse());
                break;
            case 11:
                retrieve_mortgage_stocks_response(responseWrapper.getRetrieveMortgageStocksResponse());
                break;
            case 12:
                subscribe_response(responseWrapper.getSubscribeResponse());
                break;
            case 13:
                unsubscribe_response(responseWrapper.getUnsubscribeResponse());
                break;
            case 14:
                get_company_profile(responseWrapper.getGetCompanyProfileResponse());
                break;
            case 15:
                get_market_events(responseWrapper.getGetMarketEventsResponse());
                break;
            case 16:
                get_my_asks(responseWrapper.getGetMyAsksResponse());
                break;
            case 17:
                get_my_bids(responseWrapper.getGetMyBidsResponse());
                break;
            case 18:
                get_notifications(responseWrapper.getGetNotificationsResponse());
                break;
            case 19:
                get_transactions(responseWrapper.getGetTransactionsResponse());
                break;
            case 20:
                get_mortgage_details(responseWrapper.getGetMortgageDetailsResponse());
                break;
            case 21:
                get_leaderboard(responseWrapper.getGetLeaderboardResponse());
                break;
            default: break;
        }
    }

    //Implementation of the Response functions
    //To be implemented in models

    private void get_leaderboard(GetLeaderboard.GetLeaderboardResponse getLeaderboardResponse) {
        switch(getLeaderboardResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getLeaderboardResponse.getResult().getMyRank()
                    + getLeaderboardResponse.getResult().getRankListCount() + getLeaderboardResponse.getResult().getRankListMap());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getLeaderboardResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getLeaderboardResponse.getInternalServerError().getReason());
        }
    }

    private void get_mortgage_details(GetMortgageDetails.GetMortgageDetailsResponse getMortgageDetailsResponse) {
        switch(getMortgageDetailsResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getMortgageDetailsResponse.getResult().getMortgageMapCount()
                    + getMortgageDetailsResponse.getResult().getMortgageMapCount());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getMortgageDetailsResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getMortgageDetailsResponse.getInternalServerError().getReason());
        }
    }

    private void get_transactions(GetTransactions.GetTransactionsResponse getTransactionsResponse) {
        switch(getTransactionsResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getTransactionsResponse.getResult().getMoreExists()
                    + getTransactionsResponse.getResult().getTransactionsMapCount());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getTransactionsResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getTransactionsResponse.getInternalServerError().getReason());
        }
    }

    private void get_notifications(GetNotifications.GetNotificationsResponse getNotificationsResponse) {
        switch(getNotificationsResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getNotificationsResponse.getResult().getMoreExists()
                    + getNotificationsResponse.getResult().getNotificationsCount()
                    + getNotificationsResponse.getResult().getNotificationsMap());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getNotificationsResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getNotificationsResponse.getInternalServerError().getReason());
        }
    }

    private void get_my_bids(GetMyBids.GetMyBidsResponse getMyBidsResponse) {
        switch(getMyBidsResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getMyBidsResponse.getResult().getMoreExists()
                    + getMyBidsResponse.getResult().getClosedBidOrdersCount()
                    + getMyBidsResponse.getResult().getOpenBidOrdersCount());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getMyBidsResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getMyBidsResponse.getInternalServerError().getReason());
        }
    }

    private void get_my_asks(GetMyAsks.GetMyAsksResponse getMyAsksResponse) {
        switch(getMyAsksResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getMyAsksResponse.getResult().getMoreExists()
                    + getMyAsksResponse.getResult().getClosedAskOrdersCount()
                    + getMyAsksResponse.getResult().getClosedAskOrdersMap());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getMyAsksResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getMyAsksResponse.getInternalServerError().getReason());
        }
    }

    private void get_market_events(GetMarketEvents.GetMarketEventsResponse getMarketEventsResponse) {
        switch(getMarketEventsResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getMarketEventsResponse.getResult().getMarketEventsCount()
                    + getMarketEventsResponse.getResult().getMarketEventsMap());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getMarketEventsResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getMarketEventsResponse.getInternalServerError().getReason());
        }
    }

    void get_company_profile(GetCompanyProfile.GetCompanyProfileResponse getCompanyProfileResponse) {
        switch(getCompanyProfileResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Got Company profile : " + getCompanyProfileResponse.getResult().getStockDetails()
                    + getCompanyProfileResponse.getResult().getStockHistoryMapCount());
            case 2:
                Log.e(TAG, "Bad Request Error : " + getCompanyProfileResponse.getBadRequestError().getReason());
            case 3:
                Log.e(TAG, "Internal Server Error : " + getCompanyProfileResponse.getInternalServerError().getReason());
        }
    }

    void buy_stocks_from_exchange_response(BuyStocksFromExchange.BuyStocksFromExchangeResponse buyStocksFromExchangeResponse) {
        switch (buyStocksFromExchangeResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Buy Success, Trading Price : " + buyStocksFromExchangeResponse.getResult().getTransaction());
            case 2: Log.e(TAG, "Not Enough Cash Error : " + buyStocksFromExchangeResponse.getNotEnoughCashError().getReason());
            case 3: Log.e(TAG, "Buy Limit Exceeded Error : " + buyStocksFromExchangeResponse.getBuyLimitExceededError().getReason());
            case 4: Log.e(TAG, "Bad Request Error : " + buyStocksFromExchangeResponse.getBadRequestError().getReason());
            case 5: Log.e(TAG, "Internal Server Error : " + buyStocksFromExchangeResponse.getInternalServerError().getReason());
        }
    }

    void cancel_ask_order_response(CancelAskOrder.CancelAskOrderResponse cancelAskOrderResponse) {
        switch (cancelAskOrderResponse.getResponseCase().getNumber()) {
            case 1: if (cancelAskOrderResponse.getResult().getSuccess())
                        Log.e(TAG, "Cancel Ask Order Success");
            case 2: Log.e(TAG, "Invalid Ask Id Error : " + cancelAskOrderResponse.getInvalidAskIdError().getReason());
            case 3: Log.e(TAG, "Bad Request Error : " + cancelAskOrderResponse.getBadRequestError().getReason());
            case 4: Log.e(TAG, "Internal Server Error : " + cancelAskOrderResponse.getInternalServerError().getReason());
        }
    }

    void cancel_bid_order_response(CancelBidOrder.CancelBidOrderResponse cancelBidOrderResponse) {
        switch (cancelBidOrderResponse.getResponseCase().getNumber()) {
            case 1: if (cancelBidOrderResponse.getResult().getSuccess())
                Log.e(TAG, "Cancel Ask Order Success");
            case 2: Log.e(TAG, "Invalid Bid Id Error : " + cancelBidOrderResponse.getInvalidBidIdError().getReason());
            case 3: Log.e(TAG, "Bad Request Error : " + cancelBidOrderResponse.getBadRequestError().getReason());
            case 4: Log.e(TAG, "Internal Server Error : " + cancelBidOrderResponse.getInternalServerError().getReason());
        }
    }

    void login_response(Login.LoginResponse loginResponse) {
        switch (loginResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Login Success, Session Id : " + loginResponse.getResult().getSessionId());
            case 2: Log.e(TAG, "Invalid Credentials Error : " + loginResponse.getInvalidCredentialsError().getReason());
            case 3: Log.e(TAG, "Bad Request Error : " + loginResponse.getBadRequestError().getReason());
            case 4: Log.e(TAG, "Internal Server Error : " + loginResponse.getInternalServerError().getReason());
        }
    }

    void logout_response(Logout.LogoutResponse logoutResponse) {
        switch (logoutResponse.getResponseCase().getNumber()) {
            case 1: if (logoutResponse.getResult().getSuccess())
                Log.e(TAG, "Logout Success");
            case 2: Log.e(TAG, "Bad Request Error : " + logoutResponse.getBadRequestError().getReason());
            case 3: Log.e(TAG, "Internal Server Error : " + logoutResponse.getInternalServerError().getReason());
        }
    }

    void mortgage_stocks_response(MortgageStocks.MortgageStocksResponse mortgageStocksResponse) {
        switch (mortgageStocksResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Mortgage Stocks Success, Trading Price : " + mortgageStocksResponse.getResult().getTransaction());
            case 2: Log.e(TAG, "Not Enough Stocks Error : " + mortgageStocksResponse.getNotEnoughStocksError().getReason());
            case 3: Log.e(TAG, "Bad Request Error : " + mortgageStocksResponse.getBadRequestError().getReason());
            case 4: Log.e(TAG, "Internal Server Error : " + mortgageStocksResponse.getInternalServerError().getReason());
        }
    }

    void place_ask_order_response(PlaceAskOrder.PlaceAskOrderResponse placeAskOrderResponse) {
        switch (placeAskOrderResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Ask Order Success, Ask id : " + placeAskOrderResponse.getResult().getAskId());
            case 2: Log.e(TAG, "Ask Limit Exceeded Error : " + placeAskOrderResponse.getAskLimitExceededError().getReason());
            case 3: Log.e(TAG, "Not Enough Stocks Error : " + placeAskOrderResponse.getNotEnoughStocksError().getReason());
            case 4: Log.e(TAG, "Bad Request Error : " + placeAskOrderResponse.getBadRequestError().getReason());
            case 5: Log.e(TAG, "Internal Server Error : " + placeAskOrderResponse.getInternalServerError().getReason());
        }
    }

    void place_bid_order_response(PlaceBidOrder.PlaceBidOrderResponse placeBidOrderResponse) {
        switch (placeBidOrderResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Bid Order Success, Ask id : " + placeBidOrderResponse.getResult().getBidId());
            case 2: Log.e(TAG, "Bid Limit Exceeded Error : " + placeBidOrderResponse.getBidLimitExceededError().getReason());
            case 3: Log.e(TAG, "Not Enough Cash Error : " + placeBidOrderResponse.getNotEnoughCashError().getReason());
            case 4: Log.e(TAG, "Bad Request Error : " + placeBidOrderResponse.getBadRequestError().getReason());
            case 5: Log.e(TAG, "Internal Server Error : " + placeBidOrderResponse.getInternalServerError().getReason());
        }
    }

    void retrieve_mortgage_stocks_response(RetrieveMortgageStocks.RetrieveMortgageStocksResponse retrieveMortgageStocksResponse) {
        switch (retrieveMortgageStocksResponse.getResponseCase().getNumber()) {
            case 1: Log.e(TAG, "Mortgage Stocks Success, Trading Price : " + retrieveMortgageStocksResponse.getResult().getTransaction());
            case 2: Log.e(TAG, "Not Enough Stocks Error : " + retrieveMortgageStocksResponse.getNotEnoughStocksError().getReason());
            case 3: Log.e(TAG, "Not Enough Cash Error : " + retrieveMortgageStocksResponse.getNotEnoughCashError().getReason());
            case 4: Log.e(TAG, "Bad Request Error : " + retrieveMortgageStocksResponse.getBadRequestError().getReason());
            case 5: Log.e(TAG, "Internal Server Error : " + retrieveMortgageStocksResponse.getInternalServerError().getReason());
        }
    }

    void subscribe_response(Subscribe.SubscribeResponse subscribeResponse) {
        switch (subscribeResponse.getResponseCase().getNumber()) {
            case 1: if (subscribeResponse.getResult().getSuccess())
                Log.e(TAG, "Subscribe Success");
            case 2: Log.e(TAG, "Bad Request Error : " + subscribeResponse.getBadRequestError().getReason());
            case 3: Log.e(TAG, "Internal Server Error : " + subscribeResponse.getInternalServerError().getReason());
        }
    }

    void unsubscribe_response(Unsubscribe.UnsubscribeResponse unsubscribeResponse) {
        switch (unsubscribeResponse.getResponseCase().getNumber()) {
            case 1: if (unsubscribeResponse.getResult().getSuccess())
                Log.e(TAG, "Unsubscribe Success");
            case 2: Log.e(TAG, "Bad Request Error : " + unsubscribeResponse.getBadRequestError().getReason());
            case 3: Log.e(TAG, "Internal Server Error : " + unsubscribeResponse.getInternalServerError().getReason());
        }
    }

}
