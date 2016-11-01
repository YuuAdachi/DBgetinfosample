package com.example.k13006kk.DBgetinformationsample;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.k13006kk.mylibrary.DBaccess;

public class MainActivity extends Activity {

    DBaccess dBaccess = new DBaccess();
    public String[] room = new String[6];

    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ContentResolver resolver = getContentResolver();
        for (int i = 0; i < dBaccess.monitoring(resolver).length; i++) {
            room[i] = dBaccess.monitoring(resolver)[i];
        }

        tv1 = (TextView) findViewById(R.id.toumei);
        tv1.setText(room[1]);

        tv2 = (TextView) findViewById(R.id.heyamei);
        tv2.setText(room[2]);

        tv3 = (TextView) findViewById(R.id.heyaban);
        tv3.setText(room[3]);

        tv4 = (TextView) findViewById(R.id.nichiji);
        tv4.setText(room[4]);
    }

    public void onClick(View view){

        final ContentResolver resolver = getContentResolver();
        for (int i = 0; i < dBaccess.monitoring(resolver).length; i++) {
            room[i] = dBaccess.monitoring(resolver)[i];
        }

        tv1 = (TextView) findViewById(R.id.toumei);
        tv1.setText(room[1]);

        tv2 = (TextView) findViewById(R.id.heyamei);
        tv2.setText(room[2]);

        tv3 = (TextView) findViewById(R.id.heyaban);
        tv3.setText(room[3]);

        tv4 = (TextView) findViewById(R.id.nichiji);
        tv4.setText(room[4]);
    }
}
