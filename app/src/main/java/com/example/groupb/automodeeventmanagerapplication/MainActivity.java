package com.example.groupb.automodeeventmanagerapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnScanQrcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnScanQrcode = findViewById(R.id.btnScanBarcode);
        btnScanQrcode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ScanningQRCodeActivity.class));
    }
}
