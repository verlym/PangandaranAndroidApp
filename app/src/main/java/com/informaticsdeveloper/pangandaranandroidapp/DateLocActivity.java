package com.informaticsdeveloper.pangandaranandroidapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateLocActivity extends AppCompatActivity implements View.OnClickListener {

    String loc,strTime,strDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_loc);
        Button btnGetCurrentTime = findViewById(R.id.btnGetCurrentTime);
        btnGetCurrentTime.setOnClickListener(this);

        TextView location = findViewById(R.id.current_location);
    }

    private void displayDateTime(String date,String time) {
        TextView tvTime = findViewById(R.id.current_time_view);
        TextView tvDate = findViewById(R.id.current_date_view);
        tvDate.setText(date);
        tvTime.setText(time);
    }

    private void setLoc() {
        TextView location = findViewById(R.id.current_location);
        loc = location.getText().toString();
    }

    private void setTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");
        strTime = "Current Time : " + mdformat.format(calendar.getTime());
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
        strDate = "Current Date : " + mdformat.format(calendar.getTime());
    }

    private void IntentActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 1000);
//        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        setTime();
        setLoc();
        setDate();
        History history = new History(loc,strTime,strDate);
        displayDateTime(history.getWaktu(),history.getTanggal());
        Toast.makeText(this,history.getLokasi(),Toast.LENGTH_SHORT).show();
        IntentActivity();
    }
}
