package com.example.walletappui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RedeemActivity extends AppCompatActivity {

    EditText codeText;
    Button proceedButton;
    Button backButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);

        codeText = findViewById(R.id.codeText);
        proceedButton = findViewById(R.id.proceedButton);
        backButton = findViewById(R.id.backButton);
    }

    @SuppressLint("SetTextI18n")
    public void reedemCoins(View view){

        if (codeText.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter any Code", Toast.LENGTH_SHORT).show();
        }
        else{

            Toast.makeText(this, "2 Coins added in your Wallet!", Toast.LENGTH_SHORT).show();
        }
    }

    public void back(View view){

        Intent intent = new Intent(this, BalanceActivity.class);
        startActivity(intent);
    }
}