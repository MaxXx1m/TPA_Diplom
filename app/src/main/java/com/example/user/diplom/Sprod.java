package com.example.user.diplom;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static com.example.user.diplom.DataBaseHelper.FOOD_NAME;

public class Sprod extends AppCompatActivity implements View.OnClickListener {
    DataBaseHelper dataBaseHelper;

    Integer i = 0;
    String LOG_TAG = "DB LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprod);


        final Intent intent= new Intent(Sprod.this, Pprod.class);
        View.OnClickListener clicklist = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int editId = v.getId();
                 //   Button currEditTxt = Button.(editId);
                  intent.putExtra("BtnId",editId);
                    Toast toast = Toast.makeText(getApplicationContext(),
                         "Id =" + editId , Toast.LENGTH_SHORT);
                    toast.show();
                startActivity(intent);
            }
        };


        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();

        SQLiteDatabase database = dataBaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        final Cursor cursor2 = database.query(DataBaseHelper.TABLE_FOOD, null, null, null, null, null, null);
        cursor2.moveToFirst();
       do{
        //   i = ++i;
         // String naMe = "iTem"+ i;
           int nameIndex = cursor2.getColumnIndex(FOOD_NAME);

           final int idIndex = cursor2.getColumnIndex(DataBaseHelper.FOOD_ID);
           LinearLayout mainLayout = (LinearLayout)findViewById(R.id.ll1);


           Button iTem2 = new Button(Sprod.this);
            iTem2.setText(cursor2.getString(nameIndex));
           iTem2.setId(cursor2.getInt(idIndex));
             iTem2.setOnClickListener(clicklist);
           mainLayout.addView(iTem2);
          // Item2 = (Button) findViewById(idIndex);
       /*    Item2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Toast toastV2=Toast.makeText(getApplicationContext(),
                           "id = " + idIndex, Toast.LENGTH_SHORT);
                   toastV2.show();
               }
           });*/
       }while(cursor2.moveToNext());



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



<<<<<<< HEAD
     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
=======
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
>>>>>>> origin/master
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Skoro", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
<<<<<<< HEAD
*/



        //    }
      //  });
    }

    @Override
    public void onClick(View v) {


        }
    }

=======




            }
        });
    }

    @Override
    public void onClick(View v) {


        }
    }

>>>>>>> origin/master
