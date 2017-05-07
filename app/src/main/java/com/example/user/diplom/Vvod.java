package com.example.user.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.user.diplom.R.id.Vrost;
import static com.example.user.diplom.R.id.fab;

public class Vvod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Присвоение контента форме
        setContentView(R.layout.activity_vvod);

        //Присвоение тулбара
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);

        //Активация тулбара
        setSupportActionBar(toolbar1);

         //Присвоение переменной фабу
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(fab);

        // Кликлисеннэр для фаба
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Начало интенда
                Intent intent= new Intent(Vvod.this, Vuvod.class);

                //Присвоение елементам переменнные через айди
<<<<<<< HEAD

=======
                FloatingActionButton fab1 = (FloatingActionButton) findViewById(fab);
>>>>>>> origin/master
                EditText Ves =(EditText) findViewById(R.id.Vves);
                EditText Rost = (EditText) findViewById(Vrost);
                EditText Vozrast = (EditText) findViewById(R.id.Vvozrast);
                RadioButton rb = (RadioButton)findViewById(R.id.radioButton7);
                RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton8);
<<<<<<< HEAD
                RadioButton rB = (RadioButton)findViewById(R.id.rB);
                RadioButton rB2 = (RadioButton)findViewById(R.id.rB2);
                RadioButton rB3 = (RadioButton)findViewById(R.id.rB3);
=======
>>>>>>> origin/master

                //Переменные их преобразование и вылов ошибок
                Integer VesI;
                Integer RostI;
                Integer VozrastI;
<<<<<<< HEAD
                Integer a = 0;
=======
>>>>>>> origin/master
                try {VesI = Integer.parseInt(Ves.getText().toString());
                    RostI = Integer.parseInt(Rost.getText().toString());
                    VozrastI = Integer.parseInt(Vozrast.getText().toString());}
                catch (NumberFormatException e) {
                    VesI= 0;
                    RostI= 0;
                    VozrastI= 0;}
<<<<<<< HEAD
                
                if (rB.isChecked()){
                    a = 3;
                }else  if (rB2.isChecked()){
                     a = 2;
                }else   if (rB3.isChecked()){
                     a = 1;
                }
                
=======

>>>>>>> origin/master

                //Тосты
                Toast toastV1=Toast.makeText(getApplicationContext(),
                        "Введите Вес!", Toast.LENGTH_SHORT);
                Toast toastV2=Toast.makeText(getApplicationContext(),
                        "Введите Возраст!", Toast.LENGTH_SHORT);
                Toast toastR=Toast.makeText(getApplicationContext(),
                        "Введите Рост!", Toast.LENGTH_SHORT);
                Toast toastV1m=Toast.makeText(getApplicationContext(),
                        "Слишком маленький вес!", Toast.LENGTH_SHORT);
                Toast toastV2m=Toast.makeText(getApplicationContext(),
                        "Слишком маленький возраст!", Toast.LENGTH_SHORT);
                Toast toastR1m=Toast.makeText(getApplicationContext(),
                        "Слишком маленький рост!", Toast.LENGTH_SHORT);
                Toast toastV1X=Toast.makeText(getApplicationContext(),
                        "Слишком большой вес!", Toast.LENGTH_SHORT);
                Toast toastV2X=Toast.makeText(getApplicationContext(),
                        "Слишком большой возраст!", Toast.LENGTH_SHORT);
                Toast toastR1X=Toast.makeText(getApplicationContext(),
                        "Слишком большой рост!", Toast.LENGTH_SHORT);
                //Условия видимости фаба
                //Заполненность полей
                if (Ves.getText().toString().equals(""))
                {toastV1.show();}
                else if (Rost.getText().toString().equals(""))
                {toastR.show();}
                else if (Vozrast.getText().toString().equals(""))
                {toastV2.show();}

                //Минимумы
                else if(VesI<25)
                {toastV1m.show();}
                else if(RostI<120)
                {toastR1m.show();}
                else if(VozrastI<15)
                {toastV2m.show();}

                //Максимумы
                else if(VesI>300)
                {toastV1X.show();}
                else if(RostI>220)
                {toastR1X.show();}
                else if(VozrastI>80)
                {toastV2X.show();}

                else if(rb.isChecked()){
                    intent.putExtra("Mujik","Мужской");
                    intent.putExtra("Pp",1);
                    intent.putExtra("Ves", Ves.getText().toString());
                    intent.putExtra("Rost", Rost.getText().toString());
                    intent.putExtra("Vozrast", Vozrast.getText().toString());
<<<<<<< HEAD
                    intent.putExtra("SJ", a);
=======

>>>>>>> origin/master
                    //Конец интенда
                    startActivity(intent);
                } else if (rb2.isChecked()) {
                    intent.putExtra("Mujik","Женский");
                    intent.putExtra("Pp",0);
                    intent.putExtra("Ves", Ves.getText().toString());
                    intent.putExtra("Rost", Rost.getText().toString());
                    intent.putExtra("Vozrast", Vozrast.getText().toString());

                    //Конец интенда
                    startActivity(intent);}

                //Передача данных в вывод
               /* if (rb.isChecked()) {
                    intent.putExtra("Mujik","Мужской");
                    intent.putExtra("Pp",1); }else
                if (rb2.isChecked()){
                    intent.putExtra("Mujik","Женский");
                    intent.putExtra("Pp",0); }*/
               /* intent.putExtra("Ves", Ves.getText().toString());
                intent.putExtra("Rost", Rost.getText().toString());
                intent.putExtra("Vozrast", Vozrast.getText().toString());

                //Конец интенда
              startActivity(intent);*/
            }
        });
    }

    //ОнКлик фаба(Тест площадка ограничителей)
    public void Next(View view) {


    }
    //OnClick кнопки внизу (Временно)
    public void Heh(View view){
       /* //Присвоение переменных через айди
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(fab);
        EditText Ves =(EditText) findViewById(R.id.Vves);
        EditText Rost = (EditText) findViewById(Vrost);
        EditText Vozrast = (EditText) findViewById(R.id.Vvozrast);
        RadioButton rb = (RadioButton)findViewById(R.id.radioButton7);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton8);*/

        //Переменные их преобразование и вылов ошибок
       /* Integer VesI;
        Integer RostI;
        Integer VozrastI;
        try {VesI = Integer.parseInt(Ves.getText().toString());
            RostI = Integer.parseInt(Rost.getText().toString());
            VozrastI = Integer.parseInt(Vozrast.getText().toString());}
         catch (NumberFormatException e) {
           VesI= 0;
           RostI= 0;
           VozrastI= 0;}*/



       /* //Тосты
        Toast toastV1=Toast.makeText(getApplicationContext(),
                "Введите Вес!", Toast.LENGTH_SHORT);
        Toast toastV2=Toast.makeText(getApplicationContext(),
                "Введите Возраст!", Toast.LENGTH_SHORT);
        Toast toastR=Toast.makeText(getApplicationContext(),
                "Введите Рост!", Toast.LENGTH_SHORT);
        Toast toastV1m=Toast.makeText(getApplicationContext(),
                "Слишком маленький вес!", Toast.LENGTH_SHORT);
        Toast toastV2m=Toast.makeText(getApplicationContext(),
                "Слишком маленький возраст!", Toast.LENGTH_SHORT);
        Toast toastR1m=Toast.makeText(getApplicationContext(),
                "Слишком маленький рост!", Toast.LENGTH_SHORT);
        Toast toastV1X=Toast.makeText(getApplicationContext(),
                "Слишком большой вес!", Toast.LENGTH_SHORT);
        Toast toastV2X=Toast.makeText(getApplicationContext(),
                "Слишком большой возраст!", Toast.LENGTH_SHORT);
        Toast toastR1X=Toast.makeText(getApplicationContext(),
                "Слишком большой рост!", Toast.LENGTH_SHORT);*/

        //Условия видимости фаба
        //Заполненность полей
      /*  if (Ves.getText().toString().equals(""))
        {toastV1.show();}
        else if (Rost.getText().toString().equals(""))
        {toastR.show();}
        else if (Vozrast.getText().toString().equals(""))
        {toastV2.show();}

        //Минимумы
        else if(VesI<25)
        {toastV1m.show();}
        else if(RostI<120)
        {toastR1m.show();}
        else if(VozrastI<15)
        {toastV2m.show();}

        //Максимумы
        else if(VesI>300)
        {toastV1X.show();}
        else if(RostI>220)
        {toastR1X.show();}
        else if(VozrastI>80)
        {toastV2X.show();}

        else if(rb.isChecked()){

        } else if (rb2.isChecked()) {
          }
*/




    }
}

