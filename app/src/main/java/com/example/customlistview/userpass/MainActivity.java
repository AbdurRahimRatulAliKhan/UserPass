package com.example.customlistview.userpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etUser;
    EditText etPassword;
    Button btLongIn;
    TextView tvResult;
    String userName = "khadiza";
    String password = "hell32";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.userNameId);
        etPassword = findViewById(R.id.passwordId);
        btLongIn = findViewById(R.id.LonInId);
        tvResult = findViewById(R.id.resultId);

        btLongIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = etUser.getText().toString();
                String s1 =  etPassword.getText().toString();

                if(s.equals(userName)&& s1.equals( password)){

                    tvResult.setText("Log in successfull");
                }
                else
                {
                    tvResult.setText( "Log in failed");
                }
            }
        });





    }
}
