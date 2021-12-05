package com.example.shiyan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        Intent intent=getIntent();
        String text=intent.getStringExtra("extra_text");
        TextView textView=(TextView) findViewById(R.id.item);
        textView.setText(text);

    }
}
