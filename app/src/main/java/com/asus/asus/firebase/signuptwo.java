package com.asus.asus.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class signuptwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuptwo);
    }
    public void signup(View v){
        EditText em=findViewById(R.id.email);
        EditText ps=findViewById(R.id.password);
        String email=em.getText().toString();
        String password=ps.getText().toString();
        FirebaseAuth f_auth=FirebaseAuth.getInstance();
        f_auth.createUserWithEmailAndPassword(email,password);

    }
}
