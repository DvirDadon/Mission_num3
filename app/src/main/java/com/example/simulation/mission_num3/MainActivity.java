package com.example.simulation.mission_num3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn3;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = (Button) findViewById(R.id.btn3);
    }

    public void btnclick(View view) {
        x++;
        btn3.setText("The clcik number is:" + x);

            if (x == 7){
                btn3.setText("It's enough to click.go to a new start.");
            x = 0;
        }



    }
}
