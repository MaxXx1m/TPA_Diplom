package com.example.user.diplom;

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
=======
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Creation extends AppCompatActivity implements View.OnClickListener {
    Button bb1,bb2,bb3,bd1,bd2,bd3,bs1,bs2,bs3;

>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
<<<<<<< HEAD
=======


>>>>>>> origin/master
        final Intent intent = new Intent(Creation.this, Spisok.class);
        View.OnClickListener clicklist = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int editId = v.getId();
<<<<<<< HEAD
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

=======
>>>>>>> origin/master
                //   Button currEditTxt = Button.(editId);
                intent.putExtra("BtnId", editId);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Id =" + editId, Toast.LENGTH_SHORT);
                toast.show();
<<<<<<< HEAD
                startActivityForResult(intent, CHOOSEN);
            }
        };

        bb1 = (Button) findViewById(b1);
=======
                startActivity(intent);
            }
        };

        bb1 = (Button) findViewById(R.id.b1);
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
        TextView tmax = (TextView) findViewById(R.id.TitleMax);
        TextView smax = (TextView) findViewById(R.id.Max);
        TextView tmin = (TextView) findViewById(R.id.TitleMin);


        Integer Titlemax = getIntent().getExtras().getInt("MaxKkal");
        Integer Titlemin = getIntent().getExtras().getInt("MinKkal");
        Integer SJ = getIntent().getExtras().getInt("SJ");

        Log.d(LOG_TAG, "Creation" + Titlemax);
        Log.d(LOG_TAG, "Creation" + Titlemin);
        tmax.setText(Integer.toString(Titlemax));

        tmin.setText(Integer.toString(Titlemin));

        smax.setText(Integer.toString(Titlemax));
=======

>>>>>>> origin/master



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
<<<<<<< HEAD


                //Tut budet sohranenie dannih
=======
>>>>>>> origin/master
            }
        });
    }

<<<<<<< HEAD
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
                break;

        }*/
    }
<<<<<<< HEAD

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == CHOOSEN) {
            if (resultCode == RESULT_OK) {
                String tha = data.getStringExtra(Spisok.IDB);
                String thb = data.getStringExtra(Spisok.Name);
                String thc = data.getStringExtra(Spisok.Ops);

                TextView dmin = (TextView) findViewById(R.id.Dynamic);
                TextView Z = (TextView) findViewById(R.id.DynamicZ);
                TextView O = (TextView) findViewById(R.id.DynamicO);
                TextView U = (TextView) findViewById(R.id.DynamicU);
                Add = Integer.valueOf(thc);

                switch (casebut) {
                    case 1:
                        bb1.setText(thb);
                        bid1 = Integer.getInteger(tha);

                        Dyn = Dyn - bkk1;
                        Za = Dyn;
                        Z.setText(Za);
                        bkk1 = Add;
                        break;

                    case 2:
                        bb2.setText(thb);
                        bid2 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk2;
                        Za = Dyn;
                        Z.setText(Za);

                        bkk2 = Add;
                        break;

                    case 3:
                        bb3.setText(thb);
                        bid3 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk3;
                        Za = Dyn;
                        Z.setText(Za);

                        bkk3 = Add;
                        break;


                    case 4:
                        bd1.setText(thb);
                        bid4 = Integer.getInteger(tha);

                        Dyn = Dyn - bkk4;
                        Ob = Dyn;
                        O.setText(Ob);

                        bkk4 = Add;
                        break;

                    case 5:
                        bd2.setText(thb);
                        bid5 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk5;
                        Ob = Dyn;
                        O.setText(Ob);

                        bkk5 = Add;
                        break;

                    case 6:
                        bd3.setText(thb);
                        bid6 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk6;
                        Ob = Dyn;
                        O.setText(Ob);

                        bkk6 = Add;
                        break;

                    case 7:
                        bs1.setText(thb);
                        bid7 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk7;
                        Uj = Dyn;
                        U.setText(Uj);

                        bkk7 = Add;
                        break;

                    case 8:
                        bs2.setText(thb);
                        bid8 = Integer.getInteger(tha);
                        Dyn = Dyn - bkk8;
                        Uj = Dyn;
                        U.setText(Uj);

                        bkk8 = Add;
                        break;

                    case 9:
                        bs3.setText(thb);
                        bid9 = Integer.getInteger(tha);

                        Dyn = Dyn - bkk9;
                        Uj = Dyn;
                        U.setText(Uj);

                        bkk9 = Add;
                        break;

                }
                Dyn = Dyn + Add;
                dmin.setText(Integer.toString(Dyn));
            }
        }
    }
}
=======
}
>>>>>>> origin/master
