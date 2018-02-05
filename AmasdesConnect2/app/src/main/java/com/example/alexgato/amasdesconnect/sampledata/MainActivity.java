package com.example.alexgato.amasdesconnect.sampledata;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alexgato.amasdesconnect.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bentrar,bregistrarme;
    EditText editpass,editemail;
    FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bentrar = (Button) findViewById(R.id.butonEntrar);
        bregistrarme = (Button) findViewById(R.id.butonRegistrar);

        editemail = (EditText) findViewById(R.id.insertEmail);
        editpass = (EditText) findViewById(R.id.insertpass);

        bregistrarme.setOnClickListener(this);
        bentrar.setOnClickListener(this);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null){

                    Log.i("SESION", "Sesion iniciada "+ user.getEmail());



                }else {

                    Log.i("SESION", "Sesion cerrada ");

                }


            }
        };

    }

    private void iniciarSesion(String editemail , String editpass){

        FirebaseAuth.getInstance().signInWithEmailAndPassword(editemail,editpass);


    }


    public void onClick(View view){
        Intent intent;

        switch (view.getId()){
            case R.id.butonEntrar:
                String emailInicio = editemail.getText().toString();
                String passInicio = editpass.getText().toString();
                iniciarSesion(emailInicio,passInicio);
                intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

                break;

            case R.id.butonRegistrar:

                intent = new Intent(MainActivity.this, RegistrarmeActivity.class);
                startActivity(intent);



        }

    }
    protected void onStart(){
        super.onStart();
        FirebaseAuth.getInstance().addAuthStateListener(mAuthStateListener);
    }
    protected void onStop(){
        super.onStop();
        FirebaseAuth.getInstance().removeAuthStateListener(mAuthStateListener);
    }


}
