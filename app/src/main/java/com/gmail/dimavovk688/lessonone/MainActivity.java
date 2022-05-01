package com.gmail.dimavovk688.lessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textOut;
    private EditText textIn;
    private Switch change;
    private CheckBox click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListeners();
    }

    private void init(){
        textOut = findViewById(R.id.textView);
        textIn = findViewById(R.id.editText);
        change = findViewById(R.id.switch1);
        click = findViewById(R.id.checkBox);
    }

    private void addListeners(){

        textIn.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textOut.setText(textIn.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        change.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Switch works", Toast.LENGTH_SHORT).show();
                textOut.setText("Check: " + isChecked);
            }
        });

        click.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Click works", Toast.LENGTH_SHORT).show();
                textOut.setText("Click: " + isChecked);
            }
        });
    }

    public void goToEditTextPage(View view){
        Intent intent = new Intent();
        startActivity(intent);
    }
}