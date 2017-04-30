package com.example.android.sushiburrito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This code is used to display the location of the store on the map
        TextView t2 = (TextView) findViewById(R.id.place_text);
        t2.setMovementMethod(LinkMovementMethod.getInstance());


    }

}
