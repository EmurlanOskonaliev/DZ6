package com.example.dz6;

import static com.example.dz6.R.color.orange;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    private TextView password2, click, welcome, welcome1, next1;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @SuppressLint("ResourceAsColor")
            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().length() > 0) {
                    next.setBackgroundColor(orange);
                } else {
                    next.setBackgroundColor(Color.GRAY);

                }
            }
        });
        logic();


        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @SuppressLint("ResourceAsColor")
            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().length() > 0) {
                    next.setBackgroundColor(orange);
                } else {
                    next.setBackgroundColor(Color.GRAY);

                }

            }
        });

    }

    private void logic() {
        next.setOnClickListener(new View.OnClickListener() {
            String tetx = "Не правильно ввели логин и пароль";

            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin")) {
                    password2.setVisibility(View.INVISIBLE);
                    click.setVisibility(View.INVISIBLE);
                    welcome.setVisibility(View.INVISIBLE);
                    next.setVisibility(View.INVISIBLE);
                    next1.setVisibility(View.INVISIBLE);
                    email.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), tetx, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initView() {
        email = findViewById(R.id.name);
        password = findViewById(R.id.password);
        password2 = findViewById(R.id.password2);
        click = findViewById(R.id.click);
        welcome = findViewById(R.id.welcome);
        welcome1 = findViewById(R.id.welcome1);
        next1 = findViewById(R.id.next1);
        next = findViewById(R.id.next);
    }
}