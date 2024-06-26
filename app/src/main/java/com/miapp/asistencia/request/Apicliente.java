package com.miapp.asistencia.request;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;


public class Apicliente {
    public static final String URL = "http://192.168.0.103:5000/";
    private static SharedPreferences sharedPreferences;

    private static MisEndPoints mep;

    public static void init(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        }
    }

    public static void saveToken(String token) {
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("token", "Bearer " + token);
            editor.apply(); // O use commit() para una operación sincrónica
        }
    }

    public static String getToken() {
        if (sharedPreferences != null) {
            return sharedPreferences.getString("token", "");
        }
        return null;
    }

    public static MisEndPoints getEndPoints(){
        Gson gson = new GsonBuilder().setLenient().create();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        mep = retrofit.create(MisEndPoints.class);
        return mep;
    }

    public interface MisEndPoints {
        @FormUrlEncoded
        @POST("api/Usuario/login")
        Call<String> login(@Field("Usuario") String u, @Field("Clave") String c,@Field("Rol") String r);


    }

}
