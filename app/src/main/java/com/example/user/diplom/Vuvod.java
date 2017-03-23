package com.example.user.diplom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.user.diplom.R.id.Rost;
import static com.example.user.diplom.R.id.Ves;
import static com.example.user.diplom.R.id.Vozrast;

public class Vuvod extends AppCompatActivity implements View.OnClickListener {

  Button btnAdd, btnRead,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Тулбар
        setContentView(R.layout.activity_vuvod);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        // Находим и присваиваем
         /* btnAdd = (Button) findViewById(R.id.button13);
          btnAdd.setOnClickListener(this);

        btnRead = (Button) findViewById(R.id.button14);
        btnRead.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.button12);
        btnClear.setOnClickListener(this);*/


          TextView polp = (TextView) findViewById(Rost);
          TextView polp1 = (TextView) findViewById(Vozrast);
          TextView polp2= (TextView) findViewById(Ves);
          TextView polp3= (TextView) findViewById(R.id.Pol);
          TextView polp4= (TextView) findViewById(R.id.CalcVes);

          //Ловим Интенд
        String Rost = getIntent().getExtras().getString("Rost");
        String Vozrast = getIntent().getExtras().getString("Vozrast");
        String Ves = getIntent().getExtras().getString("Ves");
        String Pol = getIntent().getExtras().getString("Mujik");
        Integer Pp = getIntent().getExtras().getInt("Pp");

         //Присваеваем переданные данные строкам
         polp.setText(Rost);
         polp1.setText(Vozrast);
         polp2.setText(Ves);
         polp3.setText(Pol);

        //Конвертируем данные
         float a= Float.valueOf(Rost);
        float b= Float.valueOf(Vozrast);
        float c= Float.valueOf(Ves);
        Float dd = null;

        //Считаем "Идеальный вес"
       if (Pp==1){
         dd = ((((a-100)+b/10)*1)+ (a - 100 - ((a - 150) / 4)))/2;
        }else if(Pp==0){
            dd = ((((a-100)+b/10)*1)+ (a - 100 - ((a - 150) / 2)))/2;}
        //Округляем и переводим в интеджер
       Integer dd2 = (int)Math.round(dd);
        //Вывод в строку
        polp4.setText(Integer.toString(dd2));

        //dbHelper= new DBHelper(this);
    }

    @Override
    public void onClick(View view) { }
}
