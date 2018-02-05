package com.example.alexgato.amasdesconnect.sampledata;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alexgato.amasdesconnect.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrarmeActivity extends AppCompatActivity implements View.OnClickListener {

    Button bregistrarme;
    EditText createemail,createpass,createpassrep;
    Intent intent;



    FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarme);

        bregistrarme= findViewById(R.id.butonRegistrar);


        createemail = findViewById(R.id.editEmail);
        createpass = findViewById(R.id.editPass);
        createpassrep = findViewById(R.id.editPass);

        bregistrarme.setOnClickListener(this);


    }


    private void registrar(String email , String pass){

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Log.i("SESION", "Usuario Creado");

                }else {
                    Log.e("SESION", task.getException().getMessage()+"");
                }

            }
        });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.butonRegistrar:
                String emailReg = createemail.getText().toString();
                String passReg = createpass.getText().toString();
                String passRegRep = createpassrep.getText().toString();


                if (passReg != passRegRep){

                    registrar(emailReg, passReg);
                    Log.i("Creacion", "Creación"+ passReg + emailReg);
                    intent = new Intent(RegistrarmeActivity.this, Main2Activity.class);
                    startActivity(intent);

                }else {
                    Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
                    Log.i("Creacion", "WrongCreation"+ passReg + emailReg);


                }


                break;
        }
    }


}
