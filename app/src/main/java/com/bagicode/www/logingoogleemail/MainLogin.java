package com.bagicode.www.logingoogleemail;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainLogin extends AppCompatActivity {

    private EditText email,password;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        alertDialogBuilder = new AlertDialog.Builder(this);

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

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
//        Toast.makeText(MainLogin.this, "Anda menekan back", Toast.LENGTH_SHORT).show();

        alertDialogBuilder.setTitle("Tutup Aplikasi");
        alertDialogBuilder
            .setMessage("Apakah Anda yakin ingin menutup aplikasi?")
            .setCancelable(false)
            .setPositiveButton("YA",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int id) {
                        //YA
                        Toast.makeText(MainLogin.this, "Anda menekan YA", Toast.LENGTH_SHORT).show();

                    }
                })
            .setNegativeButton("TIDAK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int id) {

                        //TIDAK
                        dialog.cancel();
                        Toast.makeText(MainLogin.this, "Anda menekan TIDAK", Toast.LENGTH_SHORT).show();
                    }
                }).create().show();
    }

//    @Override
//    public boolean onKeyUp(int keyCode, KeyEvent event) {
//        // filter keyCode, apabila back button yang di click, maka berikan
//        // action untuk menampikan alert dialog
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            if (alertDialogBuilder == null) {
//                alertDialogBuilder = new AlertDialog.Builder(this);
//            }
//
//            alertDialogBuilder.setTitle("Tutup Aplikasi");
//            alertDialogBuilder
//                    .setMessage("Apakah Anda yakin ingin menutup aplikasi?")
//                    .setCancelable(false)
//                    .setPositiveButton("YA",
//                            new DialogInterface.OnClickListener() {
//                                public void onClick(DialogInterface dialog,
//                                                    int id) {
//                                    //YA
//                                    dialog.cancel();
//                                    Toast.makeText(MainLogin.this, "Anda menekan YA", Toast.LENGTH_SHORT).show();
//
//                                }
//                            })
//                    .setNegativeButton("TIDAK",
//                            new DialogInterface.OnClickListener() {
//                                public void onClick(DialogInterface dialog,
//                                                    int id) {
//
//                                    //TIDAK
//                                    dialog.cancel();
//                                    Toast.makeText(MainLogin.this, "Anda menekan TIDAK", Toast.LENGTH_SHORT).show();
//                                }
//                            }).create().show();
//
//        }
//        return false;
//    }
}
