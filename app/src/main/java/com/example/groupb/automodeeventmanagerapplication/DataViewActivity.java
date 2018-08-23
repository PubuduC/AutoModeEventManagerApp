package com.example.groupb.automodeeventmanagerapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.android.volley.RequestQueue;

public class DataViewActivity extends AppCompatActivity {

    RequestQueue requestQueue;  // This is our requests queue to process our HTTP requests.

    String baseUrl = "https://api.github.com/users/";  // This is the API base URL (GitHub API)
    String url;
    TextView qrDataValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_view);

        initViews();
    }

    private void initViews() {
        qrDataValue = findViewById(R.id.ReturnDataValue);
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayDataRecievedFromQR();
    }

    private void displayDataRecievedFromQR() {
        Intent intent = getIntent();
        qrDataValue.setText(intent.getDataString());
    }
}
