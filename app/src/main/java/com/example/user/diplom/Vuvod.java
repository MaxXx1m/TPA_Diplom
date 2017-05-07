package com.example.user.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
<<<<<<< HEAD
import android.util.Log;
import android.view.View;
=======
import android.view.View;
import android.widget.Button;
>>>>>>> origin/master
import android.widget.TextView;

import static com.example.user.diplom.R.id.Rost;
import static com.example.user.diplom.R.id.Typ;
import static com.example.user.diplom.R.id.Ves;
import static com.example.user.diplom.R.id.Vozrast;
import static com.example.user.diplom.R.id.fab;

public class Vuvod extends AppCompatActivity implements View.OnClickListener {

<<<<<<< HEAD
    Integer MinK = 0;
    Integer MaxK = 0;
    Integer SJ = 0;
    String LOG_TAG = "WTF";
     Integer type;
=======
  Button btnAdd, btnRead,btnClear;
>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Тулбар
        setContentView(R.layout.activity_vuvod);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

<<<<<<< HEAD

        FloatingActionButton fab1 = (FloatingActionButton) findViewById(fab);

        // Кликлисеннэр для фаба
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Vuvod.this, Creation.class);
                intent.putExtra("MaxKkal", MaxK);
                intent.putExtra("MinKkal", MinK);
                intent.putExtra("SJ", SJ);
                startActivity(intent);

            }
        });

        // Находим и присваиваем
         /* btnAdd = (Button) findViewById(R.id.button13);
          btnAdd.setOnClickListener(this);

        btnRead = (Button) findViewById(R.id.button14);
        btnRead.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.button12);
        btnClear.setOnClickListener(this);*/


        TextView polp = (TextView) findViewById(Rost);
        TextView type1 = (TextView) findViewById(Typ);
        TextView polp1 = (TextView) findViewById(Vozrast);
        TextView polp2 = (TextView) findViewById(Ves);
        TextView polp3 = (TextView) findViewById(R.id.Pol);
        TextView polp4 = (TextView) findViewById(R.id.CalcVes);

        //Ловим Интенд
=======




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
>>>>>>> origin/master
        String Rost = getIntent().getExtras().getString("Rost");
        String Vozrast = getIntent().getExtras().getString("Vozrast");
        String Ves = getIntent().getExtras().getString("Ves");
        String Pol = getIntent().getExtras().getString("Mujik");
        Integer Pp = getIntent().getExtras().getInt("Pp");
<<<<<<< HEAD
         SJ = getIntent().getExtras().getInt("SJ");



        //Присваеваем переданные данные строкам
        polp.setText(Rost);
        polp1.setText(Vozrast);
        polp2.setText(Ves);
        polp3.setText(Pol);

        //Конвертируем данные
        float a = Float.valueOf(Rost);
        float b = Float.valueOf(Vozrast);
        float c = Float.valueOf(Ves);
        Float dd = null;

        //Считаем "Идеальный вес"
        if (Pp == 1) {
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 4))) / 2;
        } else if (Pp == 0) {
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 2))) / 2;
        }
        //Округляем и переводим в интеджер
        Integer dd2 = (int) Math.round(dd);
        //Вывод в строку
        polp4.setText(Integer.toString(dd2));
       Integer VesI= Integer.valueOf(Ves);
            if (VesI > dd2) {
                type=2;
                type1.setText("Сброс веса");
            }else if (VesI < dd2){
                type=3;
                type1.setText("Набор веса");
            }else{
                type=1;
                type1.setText("Поддержание веса");
            }

        Integer VOZ= Integer.valueOf(Vozrast);
      if (Pp == 1) {
         //Vozrast <25
          if (VOZ <= 25) {
              if (SJ == 1) {
                  if (type == 1) {
                      MinK = 2300;
                      MaxK = 2500;
                  } else if (type == 2) {
                      MinK =1900;
                      MaxK =2200;
                  } else if (type == 3) {
                      MinK =2400;
                      MaxK =3000;
                  }
              } else if (SJ == 2) {
                  if (type == 1) {
                      MinK = 2600;
                      MaxK = 2800;
                  } else if (type == 2) {
                      MinK =2400;
                      MaxK =2600;
                  } else if (type == 3) {
                      MinK = 2800;
                      MaxK = 3200;
                  }
              }else if (SJ == 3) {
                  if (type == 1) {
                      MinK = 2800;
                      MaxK = 3200;
                  } else if (type == 2) {
                      MinK =2500;
                      MaxK =2800;
                  } else if (type == 3) {
                      MinK =3000;
                      MaxK =3500;
                  }}
          //Vozrast 26+ 51-
          } else if (VOZ >= 26 || VOZ <= 51) {
              if (SJ == 1) {
                  if (type == 1) {
                      MinK = 1900;
                      MaxK = 2100;
                  } else if (type == 2) {
                      MinK =1500;
                      MaxK =1800;
                  } else if (type == 3) {
                      MinK =2200;
                      MaxK =2500;
                  }
              } else if (SJ == 2) {
                  if (type == 1) {
                      MinK = 2400;
                      MaxK = 2600;
                  } else if (type == 2) {
                      MinK =2000;
                      MaxK =2300;
                  } else if (type == 3) {
                      MinK = 2700;
                      MaxK = 3000;
                  }
              }else if (SJ == 3) {
                  if (type == 1) {
                      MinK = 2800;
                      MaxK = 3000;
                  } else if (type == 2) {
                      MinK =2500;
                      MaxK =2800;
                  } else if (type == 3) {
                      MinK =3000;
                      MaxK =3500;
                  }}
          //Vozrast 51+
          } else if (VOZ > 51) {
              if (SJ == 1) {
                  if (type == 1) {
                      MinK = 1700;
                      MaxK = 1900;
                  } else if (type == 2) {
                      MinK =1700;
                      MaxK =1800;
                  } else if (type == 3) {
                      MinK =2000;
                      MaxK =2500;
                  }
              } else if (SJ == 2) {
                  if (type == 1) {
                      MinK = 2100;
                      MaxK = 2300;
                  } else if (type == 2) {
                      MinK = 1900;
                      MaxK = 2300;
                  } else if (type == 3) {
                      MinK = 2400;
                      MaxK = 3200;
                  }
              }else if (SJ == 3) {
                  if (type == 1) {
                      MinK = 2400;
                      MaxK = 2800;
                  } else if (type == 2) {
                      MinK =2200;
                      MaxK =2600;
                  } else if (type == 3) {
                      MinK =2800;
                      MaxK =3200;
                  }}

          }
      }else  {
          //Vozrast <25
          if (VOZ <= 25) {
              if (SJ == 1) {
                  if (type == 1) {
                      MinK = 1900;
                      MaxK = 2100;
                  } else if (type == 2) {
                      MinK =1500;
                      MaxK =1800;
                  } else if (type == 3) {
                      MinK =2200;
                      MaxK =2500;
                  }
              } else if (SJ == 2) {
                  if (type == 1) {
                      MinK = 2100;
                      MaxK = 2300;
                  } else if (type == 2) {
                      MinK =1700;
                      MaxK =2000;
                  } else if (type == 3) {
                      MinK = 2400;
                      MaxK = 2700;
                  }
              }else if (SJ == 3) {
                  if (type == 1) {
                      MinK = 2300;
                      MaxK = 2500;
                  } else if (type == 2) {
                      MinK =1900;
                      MaxK =2200;
                  } else if (type == 3) {
                      MinK =2600;
                      MaxK =2900;
                  }}
              //Vozrast 26+ 51-
          } else if (VOZ >= 26 || VOZ <= 51) {
              if (SJ == 1) {
                  if (type == 1) {
                      MinK = 1700;
                      MaxK = 1900;
                  } else if (type == 2) {
                      MinK =1300;
                      MaxK =1600;
                  } else if (type == 3) {
                      MinK =2000;
                      MaxK =2300;
                  }
              } else if (SJ == 2) {
                  if (type == 1) {
                      MinK = 2100;
                      MaxK = 2300;
                  } else if (type == 2) {
                      MinK =1700;
                      MaxK =2000;
                  } else if (type == 3) {
                      MinK = 2400;
                      MaxK = 3000;
                  }
              }else if (SJ == 3) {
                  if (type == 1) {
                      MinK = 2100;
                      MaxK = 2300;
                  } else if (type == 2) {
                      MinK =1700;
                      MaxK =2000;
                  } else if (type == 3) {
                      MinK =2400;
                      MaxK =3000;
                  }}
              //Vozrast 51+
          } else if (VOZ > 51) {
              if (SJ == 1) {
                  if (type == 1) {
                      MinK = 1500;
                      MaxK = 1700;
                  } else if (type == 2) {
                      MinK =1300;
                      MaxK =1500;
                  } else if (type == 3) {
                      MinK =1700;
                      MaxK =2000;
                  }
              } else if (SJ == 2) {
                  if (type == 1) {
                      MinK = 1700;
                      MaxK = 1900;
                  } else if (type == 2) {
                      MinK = 1500;
                      MaxK = 1700;
                  } else if (type == 3) {
                      MinK = 1900;
                      MaxK = 2200;
                  }
              }else if (SJ == 3) {
                  if (type == 1) {
                      MinK = 1900;
                      MaxK = 2100;
                  } else if (type == 2) {
                      MinK =1700;
                      MaxK =1900;
                  } else if (type == 3) {
                      MinK =2100;
                      MaxK =2500;
                  }}

          }
      }
        Log.d(LOG_TAG, "Vuvod" + MinK + "<" + MaxK);
=======

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

>>>>>>> origin/master
        //dbHelper= new DBHelper(this);
    }

    @Override
<<<<<<< HEAD
    public void onClick(View view) {

    }
=======
    public void onClick(View view) { }
>>>>>>> origin/master
}
