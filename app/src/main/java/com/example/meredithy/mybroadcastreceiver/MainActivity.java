package com.example.meredithy.mybroadcastreceiver;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"aaaaa",Toast.LENGTH_LONG).show();
             Intent intent = new Intent("com.example.broadcasttest.MY_BROADCAST");
              intent.setComponent(new ComponentName("com.example.meredithy.mybroadcastreceiver",
                "com.example.meredithy.mybroadcastreceiver.MyBroadcastReceiver"));
               sendBroadcast(intent);
            }
        });
    }
}
