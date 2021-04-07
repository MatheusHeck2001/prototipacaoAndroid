package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateTimeDisplay1 = findViewById(R.id.timeDate1);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 3, 5, 11, 32);
        SimpleDateFormat dateFormat = new SimpleDateFormat("E\ndd/MM/yy\nh:mm a", Locale.getDefault());
        String date = dateFormat.format(calendar.getTime());
        dateTimeDisplay1.setText(date);

        TextView dateTimeDisplay2 = findViewById(R.id.timeDate2);
        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 5, 10, 59);
        dateFormat = new SimpleDateFormat("E\ndd/MM/yy\nh:mm a", Locale.getDefault());
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay2.setText(date);

        TextView dateTimeDisplay3 = findViewById(R.id.timeDate3);
        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 4, 23, 11);
        dateFormat = new SimpleDateFormat("E\ndd/MM/yy\nh:mm a", Locale.getDefault());
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay3.setText(date);

        TextView dateTimeDisplay4 = findViewById(R.id.timeDate4);
        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 4, 21, 52);
        dateFormat = new SimpleDateFormat("E\n dd/MM/yy\nh:mm a", Locale.getDefault());
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay4.setText(date);

        TextView dateTimeDisplay5 = findViewById(R.id.timeDate5);
        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 4, 19, 46);
        dateFormat = new SimpleDateFormat("E\ndd/MM/yy\nh:mm a", Locale.getDefault());
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay5.setText(date);

        TextView dateTimeDisplay6 = findViewById(R.id.timeDate6);
        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 4, 18, 20);
        dateFormat = new SimpleDateFormat("E\n dd/MM/yy\nh:mm a", Locale.getDefault());
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay6.setText(date);

        TextView dateTimeDisplay7 = findViewById(R.id.timeDate7);
        calendar = Calendar.getInstance();
        calendar.set(2021, 3, 4, 15, 1);
        dateFormat = new SimpleDateFormat("E\ndd/MM/yy\nh:mm a", Locale.getDefault());
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay7.setText(date);

        Button buttonToChat = (Button) findViewById(R.id.chat1);
        buttonToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Chat.class);
                startActivity(it);
            }
        });


    }
}