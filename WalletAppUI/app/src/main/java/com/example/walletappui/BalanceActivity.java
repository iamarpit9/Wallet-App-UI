package com.example.walletappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BalanceActivity extends AppCompatActivity {

    Button addMoney;
    Button coins;
   static TextView textView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        addMoney = findViewById(R.id.addMoney);
        coins = findViewById(R.id.coins);
        textView = findViewById(R.id.textView9);
        backButton = findViewById(R.id.backButton2);




    }

    public void clickCoins(View view){

        Toast.makeText(this, "Click on Redeem Coins Button", Toast.LENGTH_SHORT).show();
    }

    public void redeemScreen(View view){

        Intent intent = new Intent(this, RedeemActivity.class);
        startActivity(intent);
    }

    public void back(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}