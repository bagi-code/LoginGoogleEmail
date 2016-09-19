package com.bagicode.www.logingoogleemail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sUsername = String.valueOf(username.getText());
                String sPassword = String.valueOf(password.getText());

                if (sUsername.equals("")) {
                    Toast.makeText(MainActivity.this, "Silahkan masukkan username", Toast.LENGTH_SHORT).show();
                } else if (sPassword.equals("")) {
                    Toast.makeText(MainActivity.this, "Silahkan masukkan password", Toast.LENGTH_SHORT).show();
                } else if (sUsername.equals("admin") && sPassword.equals("admin")){
                    Toast.makeText(MainActivity.this, "User dan password benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "User dan password  salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
