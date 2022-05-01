package com.gmail.dimavovk688.lessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTestActivity extends AppCompatActivity {

    TextView tText, tName, tPhone, tNumber, tEmail, tPass;
    EditText eText, eName, ePhone, eNumber, eEmail, ePass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_test);
        init();
        addListeners();
    }

    private void init(){
        tName = findViewById(R.id.textView2);
        tText = findViewById(R.id.textView3);
        tPhone = findViewById(R.id.textView4);
        tNumber = findViewById(R.id.textView5);
        tEmail = findViewById(R.id.textView6);
        tPass = findViewById(R.id.textView7);

        eName = findViewById(R.id.name);
        eText = findViewById(R.id.text_in);
        ePhone = findViewById(R.id.phone);
        eNumber = findViewById(R.id.number);
        eEmail = findViewById(R.id.email);
        ePass = findViewById(R.id.password);
    }

    private void addListeners(){
        eName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tName.setText(eName.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        eText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tText.setText(eText.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        ePhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tPhone.setText(ePhone.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        eNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tNumber.setText(eNumber.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        eEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tEmail.setText(eEmail.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        ePass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tPass.setText(ePass.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}