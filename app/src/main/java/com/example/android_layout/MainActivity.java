package com.example.android_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText input_text;
    private TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);
        input_text = (EditText) findViewById(R.id.input_text);
        final CheckBox user = (CheckBox) findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText(user.getText());
            }
        });
        final CheckBox admin =  (CheckBox) findViewById(R.id.admin);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText(admin.getText());
            }
        });
        Button button = (Button) findViewById(R.id.send_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_text.setText(title.getText());
                Toast.makeText(MainActivity.this, input_text.getText(), Toast.LENGTH_LONG).show();
            }
        });
        final RadioButton man = (RadioButton) findViewById(R.id.man);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText(man.getText());
            }
        });
        final RadioButton women = (RadioButton) findViewById(R.id.women);
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText(women.getText());
            }
        });
    }
}
