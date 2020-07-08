package com.netology.androidlr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GaleryView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery_view);

        TextView vwResult = (TextView) findViewById(R.id.vwResult);
        String rand = String.valueOf(Math.round( Math.random() *100));
       // vwResult.setText(R.string.img_link);
        vwResult.setText (getText( R.string.img_link) + rand);

        Button btnNext = (Button) findViewById(R.id.btnNext);
        Button btnPrev = (Button) findViewById(R.id.btnPrevious);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextButtonClick();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prevButtonClick();
            }
        });
    }

    private  void nextButtonClick(){
        Intent intent = new Intent(getApplicationContext(), GaleryView.class);
        startActivity(intent); //запуск
    }

    private void prevButtonClick(){
        finish();
    }
}