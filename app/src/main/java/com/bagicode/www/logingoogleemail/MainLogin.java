package com.bagicode.www.logingoogleemail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainLogin extends AppCompatActivity {

    private EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sEmail = String.valueOf(email.getText());
                String sPass = String.valueOf(password.getText());

                if (sEmail.equals("")){
                    Toast.makeText(MainLogin.this, "Silahkan isi email Anda", Toast.LENGTH_SHORT).show();
                } else if (sPass.equals("")) {
                    Toast.makeText(MainLogin.this, "Silahkan isi password Anda", Toast.LENGTH_SHORT).show();
                } else if (sEmail.equals("admin") && sPass.equals("admin")){
                    Toast.makeText(MainLogin.this, "Email dan password benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainLogin.this, "Email dan password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
