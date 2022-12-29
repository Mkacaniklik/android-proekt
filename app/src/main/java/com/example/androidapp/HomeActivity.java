package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

/*SeekBar seekBar1, seekBar2;
TextView tvOption1,tvOption2;

TextView tvPrecent1,tvPrecent2;
double count1=1,count2=1;
boolean flag1=true,flag2=true;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       /* seekBar1 = findViewById(R.id.seek_bar1);
seekBar2= findViewById(R.id.seek_bar2);

tvOption1 = findViewById(R.id.tv_option1);
tvOption2 = findViewById(R.id.tv_option2);

tvPrecent1 = findViewById(R.id.tv_percent1);
tvPrecent2 = findViewById(R.id.tv_percent2);

seekBar1.setOnTouchListener(new View.OnTouchListener(){
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent){
        return true;
    }
});

tvOption1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(flag1)
            count1++;
        count2=1;
        flag1=false;
        flag2=true;
        calculatePercent();
    }
});
        seekBar2.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                return true;
            }
        });
        tvOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag1)
                    count1=1;
                count2++;
                flag1=true;
                flag2=false;
                calculatePercent();
            }
        });


    }

    private void calculatePercent() {
        double total= count1+count2;
        double percent1= (count1/total)*100;
        double percent2= (count2/total)*100;
        tvPrecent1.setText(String.format("%.f%%",percent1));
        seekBar1.setProgress((int) percent1);
        tvPrecent2.setText(String.format("%.f%%",percent2));
        seekBar2.setProgress((int) percent2);


    }*/

}}