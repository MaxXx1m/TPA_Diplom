package com.example.user.diplom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import static com.example.user.diplom.R.id.Rost;
import static com.example.user.diplom.R.id.Ves;
import static com.example.user.diplom.R.id.Vozrast;

public class Vuvod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vuvod);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

          TextView polp = (TextView) findViewById(Rost);
          TextView polp1 = (TextView) findViewById(Vozrast);
          TextView polp2= (TextView) findViewById(Ves);
          TextView polp3= (TextView) findViewById(R.id.Pol);
          TextView polp4= (TextView) findViewById(R.id.CalcVes);


        String Rost = getIntent().getExtras().getString("Rost");
        String Vozrast = getIntent().getExtras().getString("Vozrast");
        String Ves = getIntent().getExtras().getString("Ves");

        String Pol = getIntent().getExtras().getString("Mujik");
        Integer Pp = getIntent().getExtras().getInt("Pp");
          String Keg;
         polp.setText(Rost);
         polp1.setText(Vozrast);
         polp2.setText(Ves);
         polp3.setText(Pol);
         float a= Float.valueOf(Rost);
        float b= Float.valueOf(Vozrast);
        float c= Float.valueOf(Ves);
        Float d1;
        Float d2 = null;
        Float dd;
        d1=((a-100)+b/10)*1;
        if (Pp==1) {

                d2 = a - 100 - ((a - 150) / 4);
        }else
            if (Pp==0) {

                d2 = a - 100 - ((a - 150) / 2);
            }
        dd=(d1+d2)/2;
        Keg = Float.toString(dd);
        polp4.setText(Keg);
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
