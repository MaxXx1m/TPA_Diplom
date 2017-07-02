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
<<<<<<< HEAD
import android.util.Log;
import android.view.View;
=======
<<<<<<< HEAD
import android.util.Log;
import android.view.View;
=======
import android.view.View;
import android.widget.Button;
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
import android.widget.TextView;

import static com.example.user.diplom.R.id.Rost;
import static com.example.user.diplom.R.id.Typ;
import static com.example.user.diplom.R.id.Ves;
import static com.example.user.diplom.R.id.Vozrast;
import static com.example.user.diplom.R.id.fab;

public class Vuvod extends AppCompatActivity implements View.OnClickListener {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
    Integer MinK = 0;
    Integer MaxK = 0;
    Integer SJ = 0;
    Integer WTF = 0;
    String LOG_TAG = "WTF";
     Integer type;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    Integer MinK = 0;
    Integer MaxK = 0;
    Integer SJ = 0;
    String LOG_TAG = "WTF";
     Integer type;
=======
  Button btnAdd, btnRead,btnClear;
>>>>>>> origin/master
>>>>>>> origin/master
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
                Intent intent = new Intent(Vuvod.this, Creation.class);
                intent.putExtra("MaxKkal", MaxK);
                intent.putExtra("MinKkal", MinK);
                intent.putExtra("SJ", SJ);
                intent.putExtra("type", type);
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
<<<<<<< HEAD

        FloatingActionButton fab1 = (FloatingActionButton) findViewById(fab);

        // Кликлисеннэр для фаба
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vuvod.this, Creation.class);
                intent.putExtra("MaxKkal", MaxK);
                intent.putExtra("MinKkal", MinK);
                intent.putExtra("SJ", SJ);
                intent.putExtra("type", type);
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
>>>>>>> origin/master
>>>>>>> origin/master
        String Rost = getIntent().getExtras().getString("Rost");
        String Vozrast = getIntent().getExtras().getString("Vozrast");
        String Ves = getIntent().getExtras().getString("Ves");
        String Pol = getIntent().getExtras().getString("Mujik");
        Integer Pp = getIntent().getExtras().getInt("Pp");
<<<<<<< HEAD
        Integer ts = getIntent().getExtras().getInt("TS");

        SJ = getIntent().getExtras().getInt("SJ");
=======
<<<<<<< HEAD

        SJ = getIntent().getExtras().getInt("SJ");
=======
<<<<<<< HEAD
         SJ = getIntent().getExtras().getInt("SJ");

>>>>>>> origin/master
>>>>>>> origin/master


        //Присваеваем переданные данные строкам
        polp.setText(Rost);
        polp1.setText(Vozrast);
        polp2.setText(Ves);
        polp3.setText(Pol);
<<<<<<< HEAD
       double c = 0;
              if (ts == 1){
        c = 0.9;
        }else if (ts == 2){
        c = 1.1;

        }else if (ts == 3){
        c = 1;
        }
        //Конвертируем данные
        float a = Float.valueOf(Rost);
        float b = Float.valueOf(Vozrast);
        double dd = 0;

        //Считаем "Идеальный вес"
        if (Pp == 1) {
            Log.d(LOG_TAG, "Pp(1) = " + Pp);
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 4))+((a-100)*c)) / 3;
            WTF = 1;
        } else if (Pp == 0) {
            Log.d(LOG_TAG, "Pp(0) = " + Pp);
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 2))+((a-95)*c)) / 3;
            WTF = 2;
=======

        //Конвертируем данные
        float a = Float.valueOf(Rost);
        float b = Float.valueOf(Vozrast);
        float c = Float.valueOf(Ves);
        Float dd = null;

        //Считаем "Идеальный вес"
        if (Pp == 1) {
<<<<<<< HEAD
            Log.d(LOG_TAG, "Pp(1) = " + Pp);
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 4))) / 2;
            WTF = 1;
        } else if (Pp == 0) {
            Log.d(LOG_TAG, "Pp(0) = " + Pp);
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 2))) / 2;
            WTF = 2;
=======
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 4))) / 2;
        } else if (Pp == 0) {
            dd = ((((a - 100) + b / 10) * 1) + (a - 100 - ((a - 150) / 2))) / 2;
>>>>>>> origin/master
>>>>>>> origin/master
        }
        //Округляем и переводим в интеджер
        Integer dd2 = (int) Math.round(dd);
        //Вывод в строку
        polp4.setText(Integer.toString(dd2));
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
        Integer VesI = Integer.valueOf(Ves);
        if (VesI > dd2) {
            type = 2;
            type1.setText("Сброс веса");
        } else if (VesI < dd2) {
            type = 3;
            type1.setText("Набор веса");
        } else {
            type = 1;
            type1.setText("Поддержание веса");
        }

        Integer VOZ = Integer.valueOf(Vozrast);

        switch (WTF) {
            case 1:
                Log.d(LOG_TAG, "WTF(1) = " + WTF);
                if (VOZ <= 25) {
                    Log.d(LOG_TAG, "VOZ(25) = " + VOZ);
                    if (SJ == 1) {
                        Log.d(LOG_TAG, "SJ(1) = " + SJ);
                        if (type == 1) {
                            Log.d(LOG_TAG, "type(1) = " + type);
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
                break;
            case 2:
                Log.d(LOG_TAG, "WTF(2) = " + WTF);
                //Vozrast <25
                if (VOZ <= 25) {
                    Log.d(LOG_TAG, "VOZ(25) = " + VOZ);
                    if (SJ == 1) {
                        Log.d(LOG_TAG, "SJ(1) = " + SJ);
                        if (type == 1) {
                            Log.d(LOG_TAG, "type(1) = " + type);
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
                break;
        }



     /* if (Pp == 1) {
<<<<<<< HEAD
=======
=======
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
>>>>>>> origin/master
>>>>>>> origin/master
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

<<<<<<< HEAD
          }}
        if (Pp == 0){
=======
<<<<<<< HEAD
          }}
        if (Pp == 0){
=======
          }
      }else  {
>>>>>>> origin/master
>>>>>>> origin/master
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

<<<<<<< HEAD
          }*/
   // }
        Log.d(LOG_TAG, "Vuvod" + MinK + "<" + MaxK);
=======
<<<<<<< HEAD
          }*/
   // }
        Log.d(LOG_TAG, "Vuvod" + MinK + "<" + MaxK);
=======
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
>>>>>>> origin/master
>>>>>>> origin/master
        //dbHelper= new DBHelper(this);
    }

    @Override
<<<<<<< HEAD
    public void onClick(View view) {

    }
=======
<<<<<<< HEAD
    public void onClick(View view) {

    }
=======
<<<<<<< HEAD
    public void onClick(View view) {

    }
=======
    public void onClick(View view) { }
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
}
