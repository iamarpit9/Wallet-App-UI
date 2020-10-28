package com.example.walletappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton pay;
    ImageButton wallet;
    ImageButton passbook;
    ImageButton scan;
    ImageButton offers;
    ImageButton shopping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pay = findViewById(R.id.pay);
        wallet = findViewById(R.id.wallet);
        passbook = findViewById(R.id.passbook);
        scan = findViewById(R.id.scan);
        offers = findViewById(R.id.offers);
        shopping = findViewById(R.id.shopping);

    }

    public void clickWallet(View view){

        Toast.makeText(this, "Click on Wallet Button", Toast.LENGTH_SHORT).show();
    }

    public void balanceScreen(View view){

        Intent intent = new Intent(this, BalanceActivity.class);
        startActivity(intent);
    }



}