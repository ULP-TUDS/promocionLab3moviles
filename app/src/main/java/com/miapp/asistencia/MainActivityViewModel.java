package com.miapp.asistencia;

import android.app.Application;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;


import com.miapp.asistencia.request.Apicliente;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends AndroidViewModel {


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public void logueo(String usuario, String clave,String rol) {

        Apicliente.init(getApplication());

        Apicliente.MisEndPoints api = Apicliente.getEndPoints();

        Call<String> call = api.login(usuario, clave,rol);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    String token = response.body();
                    Apicliente.saveToken(token);
                    Intent intent = new Intent(getApplication(), MainActivity2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getApplication().startActivity(intent);
                } else {
                    Toast.makeText(getApplication(), "Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(getApplication(), "Error en la conexión", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
