package com.test.giaodienprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    EditText edtUser, edtPassword;
    CheckBox cbNhoMK;
    Button btnLogin, btnSignUp;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = (EditText)findViewById(R.id.editTextUser);
        edtPassword = (EditText)findViewById(R.id.editTextPassword);
        cbNhoMK = (CheckBox)findViewById(R.id.checkBoxNhoMK);
        btnLogin = (Button)findViewById(R.id.button_login);
        btnSignUp = (Button)findViewById(R.id.buttonSignUp);

        sharedPreferences = getSharedPreferences("dataLogin", MODE_PRIVATE);

        edtUser.setText(sharedPreferences.getString("taikhoan",""));
        edtPassword.setText(sharedPreferences.getString("matkhau",""));
        cbNhoMK.setChecked(sharedPreferences.getBoolean("checked", false));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUser.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (username.equals("admin") && password.equals("12345")) {
                    Toast.makeText(Login_Activity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    if (cbNhoMK.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", username);
                        editor.putString("matkhau", password);
                        editor.putBoolean("checked", true);
                        editor.commit();
                    }
                    else{
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("checked");
                        editor.commit();
                    }

                    Intent myIntent = new Intent(Login_Activity.this, Home_Activity.class);
                    startActivity(myIntent);

                } else {
                    Toast.makeText(Login_Activity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();

                }
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent myIntent = new Intent(Login_Activity.this, SignUp_Activity.class);
                    startActivity(myIntent);
            }
        });
    }
}