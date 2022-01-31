package com.example.testapplication2;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        Toast.makeText(getApplicationContext(), "値を全て入力して下さい", Toast.LENGTH_LONG).show();

        Button myButton = (Button) findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView myTxt = (TextView) findViewById(R.id.myText);
                myTxt.setText("aaaaaaa");
                Toast.makeText(getApplicationContext(), "bbbbb", Toast.LENGTH_LONG).show();
            }
        });
    }

}
