package com.example.user.diplom;

<<<<<<< HEAD
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.user.diplom.R.id.TitleMax;
=======
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
<<<<<<< HEAD
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

>>>>>>> origin/master
import static com.example.user.diplom.R.id.b1;

public class Creation extends AppCompatActivity implements View.OnClickListener {
    Button bb1, bb2, bb3, bd1, bd2, bd3, bs1, bs2, bs3;
    Integer bid1, bid2, bid3, bid4, bid5, bid6, bid7, bid8, bid9;
    Integer CHOOSEN = 0;
    Integer casebut = 0;
    Integer Dyn = 0;
    Integer Add = 0;
    Integer Za = 0;
    Integer Ob = 0;
    Integer Uj = 0;
    Integer bkk1 = 0, bkk2 = 0, bkk3 = 0, bkk4 = 0, bkk5 = 0, bkk6 = 0, bkk7 = 0, bkk8 = 0, bkk9 = 0;
    String LOG_TAG = "WTF";
<<<<<<< HEAD
    DataBaseHelper dataBaseHelper;
=======
=======
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Creation extends AppCompatActivity implements View.OnClickListener {
    Button bb1,bb2,bb3,bd1,bd2,bd3,bs1,bs2,bs3;

>>>>>>> origin/master
>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> origin/master
>>>>>>> origin/master
        final Intent intent = new Intent(Creation.this, Spisok.class);
        View.OnClickListener clicklist = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int editId = v.getId();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                switch (v.getId()) {
                    case b1:
                        casebut = 1;
                        break;

                    case R.id.b2:
                        casebut = 2;
                        break;

                    case R.id.b3:
                        casebut = 3;
                        break;

                    case R.id.d1:
                        casebut = 4;
                        break;

                    case R.id.d2:
                        casebut = 5;
                        break;

                    case R.id.d3:
                        casebut = 6;
                        break;

                    case R.id.s1:
                        casebut = 7;
                        break;

                    case R.id.s2:
                        casebut = 8;
                        break;

                    case R.id.s3:
                        casebut = 9;
                        break;

                }

<<<<<<< HEAD
                //   Button currEditTxt = Button.(editId);
                intent.putExtra("BtnId", editId);


=======
=======
>>>>>>> origin/master
                //   Button currEditTxt = Button.(editId);
                intent.putExtra("BtnId", editId);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Id =" + editId, Toast.LENGTH_SHORT);
                toast.show();
<<<<<<< HEAD
>>>>>>> origin/master
                startActivityForResult(intent, CHOOSEN);
            }
        };

        bb1 = (Button) findViewById(b1);
<<<<<<< HEAD
=======
=======
                startActivity(intent);
            }
        };

        bb1 = (Button) findViewById(R.id.b1);
>>>>>>> origin/master
>>>>>>> origin/master
        bb1.setOnClickListener(clicklist);

        bb2 = (Button) findViewById(R.id.b2);
        bb2.setOnClickListener(clicklist);

        bb3 = (Button) findViewById(R.id.b3);
        bb3.setOnClickListener(clicklist);

        bd1 = (Button) findViewById(R.id.d1);
        bd1.setOnClickListener(clicklist);

        bd2 = (Button) findViewById(R.id.d2);
        bd2.setOnClickListener(clicklist);

        bd3 = (Button) findViewById(R.id.d3);
        bd3.setOnClickListener(clicklist);

        bs1 = (Button) findViewById(R.id.s1);
        bs1.setOnClickListener(clicklist);

        bs2 = (Button) findViewById(R.id.s2);
        bs2.setOnClickListener(clicklist);

        bs3 = (Button) findViewById(R.id.s3);
        bs3.setOnClickListener(clicklist);

<<<<<<< HEAD
        TextView tmax = (TextView) findViewById(TitleMax);
        TextView smax = (TextView) findViewById(R.id.Max);
        TextView tmin = (TextView) findViewById(R.id.TitleMin);
        final EditText Namee = (EditText) findViewById(R.id.editText);
        final String nam = Namee.getText().toString();
        Integer Titlemax = getIntent().getExtras().getInt("MaxKkal");
        Integer Titlemin = getIntent().getExtras().getInt("MinKkal");
        final Integer SJ = getIntent().getExtras().getInt("SJ");
        final Integer Type = getIntent().getExtras().getInt("type");
=======
<<<<<<< HEAD
        TextView tmax = (TextView) findViewById(R.id.TitleMax);
        TextView smax = (TextView) findViewById(R.id.Max);
        TextView tmin = (TextView) findViewById(R.id.TitleMin);


        Integer Titlemax = getIntent().getExtras().getInt("MaxKkal");
        Integer Titlemin = getIntent().getExtras().getInt("MinKkal");
        Integer SJ = getIntent().getExtras().getInt("SJ");
>>>>>>> origin/master

        Log.d(LOG_TAG, "Creation" + Titlemax);
        Log.d(LOG_TAG, "Creation" + Titlemin);
        tmax.setText(Integer.toString(Titlemax));

        tmin.setText(Integer.toString(Titlemin));

        smax.setText(Integer.toString(Titlemax));
<<<<<<< HEAD
        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();
=======
=======

>>>>>>> origin/master
>>>>>>> origin/master



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                final EditText Namee = (EditText) findViewById(R.id.editText);
                final String nam = Namee.getText().toString();
                SQLiteDatabase database = dataBaseHelper.getWritableDatabase();

                ContentValues contentValues = new ContentValues();

                contentValues.put(DataBaseHelper.DIET_NAME, nam );
                contentValues.put(DataBaseHelper.DIET_TYPE, Type);
                contentValues.put(DataBaseHelper.DIET_DAYLYNORM, Dyn);
                contentValues.put(DataBaseHelper.DIET_FOODB1, bid1);
                contentValues.put(DataBaseHelper.DIET_FOODB2, bid2);
                contentValues.put(DataBaseHelper.DIET_FOODB3, bid3);
                contentValues.put(DataBaseHelper.DIET_FOODD1, bid4);
                contentValues.put(DataBaseHelper.DIET_FOODD2, bid5);
                contentValues.put(DataBaseHelper.DIET_FOODD3, bid6);
                contentValues.put(DataBaseHelper.DIET_FOODS1, bid7);
                contentValues.put(DataBaseHelper.DIET_FOODS2, bid8);
                contentValues.put(DataBaseHelper.DIET_FOODS3, bid9);


                database.insert(DataBaseHelper.TABLE_DIET, null, contentValues);
                dataBaseHelper.close();
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Рацион " + nam +" успешно добавлен!", Toast.LENGTH_LONG);
                toast.show();
                final Intent intent = new Intent(Creation.this, MainMenu.class);
               startActivity(intent);
=======
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
<<<<<<< HEAD


                //Tut budet sohranenie dannih
=======
>>>>>>> origin/master
>>>>>>> origin/master
            }
        });
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
    @Override
    public void onClick(View v) {
     /* *//* Cursor cursor2 = database.query(DataBaseHelper.TABLE_FOOD, null, null, null, null, null, null);
        Intent intent= new Intent(Creation.this, Spisok.class);*//*
        switch (v.getId()) {
            case b1:
             casebut = 1;
                Toast toast = Toast.makeText(getApplicationContext(),
                        "11111111111111" , Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.b2:
                casebut = 2;
                break;

            case R.id.b3:
                casebut = 3;
                break;

            case R.id.d1:
                casebut = 4;
                break;

            case R.id.d2:
                casebut = 5;
                break;

            case R.id.d3:
                casebut = 6;
                break;

            case R.id.s1:
                casebut = 7;
                break;

            case R.id.s2:
                casebut = 8;
                break;

            case R.id.s3:
                casebut = 9;
<<<<<<< HEAD
=======
=======
   @Override
    public void onClick(View v) {
      /* // Cursor cursor2 = database.query(DataBaseHelper.TABLE_FOOD, null, null, null, null, null, null);
        Intent intent= new Intent(Creation.this, Spisok.class);
        switch (v.getId()) {
            case R.id.b1:
              startActivity(intent);
                break;

            case R.id.b2:
                startActivity(intent);
                break;

            case R.id.b3:
                startActivity(intent);
                break;

            case R.id.d1:
                startActivity(intent);
                break;

            case R.id.d2:
                startActivity(intent);
                break;

            case R.id.d3:
                startActivity(intent);
                break;

            case R.id.s1:
                startActivity(intent);
                break;

            case R.id.s2:
                startActivity(intent);
                break;

            case R.id.s3:
                startActivity(intent);
>>>>>>> origin/master
>>>>>>> origin/master
                break;

        }*/
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == CHOOSEN) {
            if (resultCode == RESULT_OK) {
<<<<<<< HEAD
                Integer tha = data.getIntExtra(Spisok.IDB,0);
                String thb = data.getStringExtra(Spisok.Name);
                String thc = data.getStringExtra(Spisok.Ops);
                TextView tmax = (TextView) findViewById(TitleMax);
                TextView smax = (TextView) findViewById(R.id.Max);
                TextView tmin = (TextView) findViewById(R.id.TitleMin);
                TextView iz = (TextView) findViewById(R.id.textView26);
                Integer Titlemax = getIntent().getExtras().getInt("MaxKkal");
                Integer Titlemin = getIntent().getExtras().getInt("MinKkal");
=======
                String tha = data.getStringExtra(Spisok.IDB);
                String thb = data.getStringExtra(Spisok.Name);
                String thc = data.getStringExtra(Spisok.Ops);
>>>>>>> origin/master

                TextView dmin = (TextView) findViewById(R.id.Dynamic);
                TextView Z = (TextView) findViewById(R.id.DynamicZ);
                TextView O = (TextView) findViewById(R.id.DynamicO);
                TextView U = (TextView) findViewById(R.id.DynamicU);
<<<<<<< HEAD
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
=======
>>>>>>> origin/master
                Add = Integer.valueOf(thc);

                switch (casebut) {
                    case 1:
                        bb1.setText(thb);
<<<<<<< HEAD
                        bid1 = tha;
                        Log.d(LOG_TAG,"bid "+ bid1 );
                        Log.d(LOG_TAG,"tha "+ tha );
                        Dyn = Dyn - bkk1;

=======
                        bid1 = Integer.getInteger(tha);

                        Dyn = Dyn - bkk1;
                        Za = Dyn;
                        Z.setText(Za);
>>>>>>> origin/master
                        bkk1 = Add;
                        break;

                    case 2:
                        bb2.setText(thb);
<<<<<<< HEAD
                        bid2 =  tha ;
                        Dyn = Dyn - bkk2;
=======
                        bid2 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk2;
                        Za = Dyn;
                        Z.setText(Za);
>>>>>>> origin/master

                        bkk2 = Add;
                        break;

                    case 3:
                        bb3.setText(thb);
<<<<<<< HEAD
                        bid3 =  tha ;
                        Dyn = Dyn - bkk3;

=======
                        bid3 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk3;
                        Za = Dyn;
                        Z.setText(Za);
>>>>>>> origin/master

                        bkk3 = Add;
                        break;


                    case 4:
                        bd1.setText(thb);
<<<<<<< HEAD
                        bid4 =  tha ;

                        Dyn = Dyn - bkk4;
=======
                        bid4 = Integer.getInteger(tha);

                        Dyn = Dyn - bkk4;
                        Ob = Dyn;
                        O.setText(Ob);
>>>>>>> origin/master

                        bkk4 = Add;
                        break;

                    case 5:
                        bd2.setText(thb);
<<<<<<< HEAD
                        bid5 =  tha ;
                        Dyn = Dyn - bkk5;
=======
                        bid5 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk5;
                        Ob = Dyn;
                        O.setText(Ob);
>>>>>>> origin/master

                        bkk5 = Add;
                        break;

                    case 6:
                        bd3.setText(thb);
<<<<<<< HEAD
                        bid6 =  tha ;
                        Dyn = Dyn - bkk6;

=======
                        bid6 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk6;
                        Ob = Dyn;
                        O.setText(Ob);
>>>>>>> origin/master

                        bkk6 = Add;
                        break;

                    case 7:
                        bs1.setText(thb);
<<<<<<< HEAD
                        bid7 =  tha ;
                        Dyn = Dyn - bkk7;
=======
                        bid7 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk7;
                        Uj = Dyn;
                        U.setText(Uj);
>>>>>>> origin/master

                        bkk7 = Add;
                        break;

                    case 8:
                        bs2.setText(thb);
<<<<<<< HEAD
                        bid8 =  tha ;
                        Dyn = Dyn - bkk8;

=======
                        bid8 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk8;
                        Uj = Dyn;
                        U.setText(Uj);
>>>>>>> origin/master

                        bkk8 = Add;
                        break;

                    case 9:
                        bs3.setText(thb);
<<<<<<< HEAD
                        bid9 =  tha ;

                        Dyn = Dyn - bkk9;
=======
                        bid9 = Integer.getInteger(tha);

                        Dyn = Dyn - bkk9;
                        Uj = Dyn;
                        U.setText(Uj);
>>>>>>> origin/master

                        bkk9 = Add;
                        break;

                }
                Dyn = Dyn + Add;
<<<<<<< HEAD
                if (Dyn<Titlemin||Dyn>Titlemax){
                    Log.d(LOG_TAG,"1 "+ Dyn + ":" + Titlemin);
                    fab.setVisibility(View.INVISIBLE);
                if (Dyn<Titlemin) {
                    Log.d(LOG_TAG,"3 "+ Dyn + ":" + Titlemin);
                    dmin.setTextColor(Color.parseColor("#FF80CBC4"));
                    iz.setTextColor(Color.parseColor("#FF80CBC4"));
                    smax.setTextColor(Color.parseColor("#FF80CBC4"));
                }else if (Dyn>Titlemax) {
                       Log.d(LOG_TAG,"4 "+ Dyn + ":" + Titlemax);
                    smax.setTextColor(Color.RED);
                    dmin.setTextColor(Color.RED);
                    iz.setTextColor(Color.RED);
                }} else {
                    Log.d(LOG_TAG,"2!!!!");
                    fab.setVisibility(View.VISIBLE);
                    smax.setTextColor(Color.GREEN);
                    dmin.setTextColor(Color.GREEN);
                    iz.setTextColor(Color.GREEN);
                }
=======
>>>>>>> origin/master
                dmin.setText(Integer.toString(Dyn));
            }
        }
    }
<<<<<<< HEAD
}
=======
}
=======
}
>>>>>>> origin/master
>>>>>>> origin/master
