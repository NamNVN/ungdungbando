package com.example.myapplication.retrofit;

import com.example.myapplication.model.NotiReponse;
import com.example.myapplication.model.NotiSendData;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiPushNofication {
    @Headers(
            {
                    "content-type: application/json",
                    "authorization: key=AAAA2bLytTY:APA91bHDcL6X0BS6hfHiI5vH2bTo3k4SgMBafZeQ9F8L1VBCIwA7wpuxAh4Miuw-S5-QHg0pZ_qJOw9kOTitGx0Nuyuj78cDiZ-hC8s87xk_yzprrFKn9KJO6Jm7Hf-HLjS8ZRzRHhNE"
            }
    )
    @POST("fcm/send")
    Observable<NotiReponse> sendNotification(@Body NotiSendData data);


}
