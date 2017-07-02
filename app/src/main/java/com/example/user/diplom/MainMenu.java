package com.example.user.diplom;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static com.example.user.diplom.DataBaseHelper.DIET_FOODB1;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODB2;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODB3;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODD1;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODD2;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODD3;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODS1;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODS2;
import static com.example.user.diplom.DataBaseHelper.DIET_FOODS3;
import static com.example.user.diplom.DataBaseHelper.DIET_NAME;
import static com.example.user.diplom.DataBaseHelper.DIET_SELECTED;
import static com.example.user.diplom.DataBaseHelper.TABLE_DIET;
import static com.example.user.diplom.DataBaseHelper.TABLE_FOOD;

public class MainMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DataBaseHelper dataBaseHelper;
    Integer idp;
    Integer shet = 0;
    String LOG_TAG;
    String Namme;
Integer F=0;
    private static final int NOTIFY_ID = 101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //
       /* if (F!=0){
            F--;
            finish();
        }else{
            F++;
        }*/
        final Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        List<String> catNames = new ArrayList<String>();
        TextView NAMe = (TextView) findViewById(R.id.textView22);
        TextView Priyom = (TextView) findViewById(R.id.textView23);

        Button t1 = (Button) findViewById(R.id.button2);
        Button t2 = (Button) findViewById(R.id.button3);
        Button t3 = (Button) findViewById(R.id.button4);
        final Intent intent = new Intent(MainMenu.this, Pprod.class);
        View.OnClickListener clicklist6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int editId = v.getId();
                //   Button currEditTxt = Button.(editId);
                intent.putExtra("BtnId", editId);
                startActivity(intent);

            }
        };
        dataBaseHelper = new DataBaseHelper(this);


        SQLiteDatabase database = dataBaseHelper.getWritableDatabase();
        String Imya;
        Integer seelect;

        final Cursor cursor2 = database.query(TABLE_DIET, null, null, null, null, null, null);
        cursor2.moveToFirst();
        // if () {
        do {
            int seelected = cursor2.getColumnIndex(DIET_SELECTED);
            seelect = cursor2.getInt(seelected);
            int nameIndex = cursor2.getColumnIndex(DIET_NAME);
            Imya = cursor2.getString(nameIndex);
            Namme = Imya;
            if (seelect.equals(1)) {

                NAMe.setVisibility(View.VISIBLE);
                Priyom.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                int b1 = cursor2.getColumnIndex(DIET_FOODB1);
                int b2 = cursor2.getColumnIndex(DIET_FOODB2);
                int b3 = cursor2.getColumnIndex(DIET_FOODB3);
                int d1 = cursor2.getColumnIndex(DIET_FOODD1);
                int d2 = cursor2.getColumnIndex(DIET_FOODD2);
                int d3 = cursor2.getColumnIndex(DIET_FOODD3);
                int s1 = cursor2.getColumnIndex(DIET_FOODS1);
                int s2 = cursor2.getColumnIndex(DIET_FOODS2);
                int s3 = cursor2.getColumnIndex(DIET_FOODS3);

                long date = System.currentTimeMillis();
                NAMe.setText(Imya);

                SimpleDateFormat sdf = new SimpleDateFormat("hh");
                SimpleDateFormat sdf2 = new SimpleDateFormat("a");
                String dateString = sdf.format(date);
                String dateString2 = sdf2.format(date);
                Integer hours = Integer.valueOf(dateString);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "HOURS! " + dateString, Toast.LENGTH_SHORT);
                toast.show();
                if (dateString2.equals("PM")) {
                    hours = hours + 12;
                }
                if (hours >= 14 && hours <= 19) {
                    Priyom.setText("Ужин");
                    Log.d(LOG_TAG, "Ужин");
                    // t1.setText(cursor2.getString(s1));
                    SQLiteDatabase database3 = dataBaseHelper.getWritableDatabase();

                    final Cursor cursor1 = database3.query(TABLE_FOOD, null, null, null, null, null, null);
                    cursor1.moveToFirst();
                    do {

                        Log.d(LOG_TAG, "DO");
                        int idfood = cursor1.getColumnIndex(DataBaseHelper.FOOD_ID);
                        int fname = cursor1.getColumnIndex(DataBaseHelper.FOOD_NAME);
                        if (cursor2.getInt(s1) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t1.setText(cursor1.getString(fname));
                            t1.setId(cursor1.getInt(idfood));
                            t1.setOnClickListener(clicklist6);
                        }
                        if (cursor2.getInt(s2) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t2.setText(cursor1.getString(fname));
                            t2.setId(cursor1.getInt(idfood));
                            t2.setOnClickListener(clicklist6);
                        }
                        if (cursor2.getInt(s3) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t3.setText(cursor1.getString(fname));
                            t3.setId(cursor1.getInt(idfood));
                            t3.setOnClickListener(clicklist6);
                        }
                    } while (cursor1.moveToNext());
                    // t2.setText(cursor2.getString(s2));


                    // t3.setText(cursor2.getString(s3));


                } else if (hours >= 20 || hours >= 0 && hours <= 6) {
                    Priyom.setText("Завтрак");

                    Log.d(LOG_TAG, "Завтрак");

                    SQLiteDatabase database3 = dataBaseHelper.getWritableDatabase();
                    final Cursor cursor1 = database3.query(TABLE_FOOD, null, null, null, null, null, null);
                    cursor1.moveToFirst();
                    do {

                        Log.d(LOG_TAG, "DO");
                        int idfood = cursor1.getColumnIndex(DataBaseHelper.FOOD_ID);
                        int fname = cursor1.getColumnIndex(DataBaseHelper.FOOD_NAME);
                        if (cursor2.getInt(b1) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t1.setText(cursor1.getString(fname));
                            t1.setId(cursor1.getInt(idfood));
                            t1.setOnClickListener(clicklist6);
                        }
                        if (cursor2.getInt(b2) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t2.setText(cursor1.getString(fname));
                            t2.setId(cursor1.getInt(idfood));
                            t2.setOnClickListener(clicklist6);
                        }
                        if (cursor2.getInt(b3) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t3.setText(cursor1.getString(fname));
                            t3.setId(cursor1.getInt(idfood));
                            t3.setOnClickListener(clicklist6);
                        }
                    } while (cursor1.moveToNext());
                } else if (hours >= 7 && hours <= 13) {
                    Priyom.setText("Обед");

                    Log.d(LOG_TAG, "Обед");

                    SQLiteDatabase database3 = dataBaseHelper.getWritableDatabase();
                    final Cursor cursor1 = database3.query(TABLE_FOOD, null, null, null, null, null, null);
                    cursor1.moveToFirst();
                    do {

                        Log.d(LOG_TAG, "DO");
                        int idfood = cursor1.getColumnIndex(DataBaseHelper.FOOD_ID);
                        int fname = cursor1.getColumnIndex(DataBaseHelper.FOOD_NAME);
                        if (cursor2.getInt(d1) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t1.setText(cursor1.getString(fname));
                            t1.setId(cursor1.getInt(idfood));
                            t1.setOnClickListener(clicklist6);
                        }
                        if (cursor2.getInt(d2) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t2.setText(cursor1.getString(fname));
                            t2.setId(cursor1.getInt(idfood));
                            t2.setOnClickListener(clicklist6);
                        }
                        if (cursor2.getInt(d3) == cursor1.getInt(idfood)) {
                            Log.d(LOG_TAG, cursor1.getString(idfood));
                            Log.d(LOG_TAG, cursor1.getString(fname));
                            t3.setText(cursor1.getString(fname));
                            t3.setId(cursor1.getInt(idfood));
                            t3.setOnClickListener(clicklist6);
                        }
                    } while (cursor1.moveToNext());
                }
            } else {

                catNames.add(Imya);
            }

        } while (cursor2.moveToNext());


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, catNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


        //   }
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {

                idp = selectedItemPosition;
                String selected = spinner.getSelectedItem().toString();
                SQLiteDatabase database = dataBaseHelper.getWritableDatabase();
                final Cursor cursor3 = database.query(TABLE_DIET, null, null, null, null, null, null);
                cursor2.moveToFirst();
                String Imya2;
                Integer seelect2;
                do {
                    int nameIndex = cursor2.getColumnIndex(DIET_NAME);
                    Imya2 = cursor2.getString(nameIndex);
                    int seelected = cursor2.getColumnIndex(DIET_SELECTED);
                    seelect2 = cursor2.getInt(seelected);
                    if (selected.equals(Imya2)) {
                        seelect2 = 1;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(DataBaseHelper.DIET_SELECTED, seelect2);
                        // database.update(DataBaseHelper.TABLE_DIET, contentValues,DataBaseHelper.DIET_SELECTED+"="+seelect2,null);

                        final Intent intent = new Intent(MainMenu.this, MainMenu.class);
                        finish();
                        startActivity(intent);

                    }
                } while (cursor2.moveToNext());
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public void onRestart(){
        super.onRestart();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intenth = new Intent(MainMenu.this, Help.class);
            startActivity(intenth);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            Intent intent = new Intent(MainMenu.this, Vvod.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MainMenu.this, Sdiet.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {


<<<<<<< HEAD
        } else if (id == R.id.nav_eat) {
            Intent intent = new Intent(MainMenu.this, Sprod.class);
            startActivity(intent);
=======
        }else if (id == R.id.nav_eat) {
            Intent intent=new Intent(MainMenu.this, Sprod.class);
            startActivity(intent);
<<<<<<< HEAD
=======

        }else if (id == R.id.nav_eat) {
<<<<<<< HEAD
            Intent intent = new Intent(MainMenu.this, Creation.class);
=======
<<<<<<< HEAD
            Intent intent = new Intent(MainMenu.this, Creation.class);
=======
            Intent intent = new Intent(MainMenu.this, Sozd.class);
>>>>>>> origin/master
>>>>>>> origin/master
            startActivity(intent);
>>>>>>> origin/master
>>>>>>> origin/master
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClick(View v) {
        Integer CHOOSEN = 0;
        final Intent intent = new Intent(MainMenu.this, SPdiet.class);
        startActivityForResult(intent, CHOOSEN);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String thb = data.getStringExtra(Spisok.Name);
        SQLiteDatabase database31 = dataBaseHelper.getWritableDatabase();
        ContentValues barsikValues1 = new ContentValues();
        TextView NAMe = (TextView) findViewById(R.id.textView22);
        barsikValues1.put("DIET_SELECTED", 0);
        database31.update(TABLE_DIET,
                barsikValues1,
                "DIET_NAME = ?", new String[]{Namme});

        Toast toast = Toast.makeText(getApplicationContext(),
                "HO! " + Namme, Toast.LENGTH_SHORT);
        toast.show();
        ContentValues barsikValues = new ContentValues();

        barsikValues.put("DIET_SELECTED", 1);

        database31.update(TABLE_DIET,
                barsikValues,
                "DIET_NAME = ?", new String[]{thb});
        Cursor cursor;
        Log.d(LOG_TAG, "-----TABLE DIET------");
        cursor = database31.query(TABLE_DIET, null, null, null, null, null, null);
        logCursor(cursor);
        cursor.close();
        Log.d(LOG_TAG, " =================== ");
        finish();
        final Intent refresher = new Intent(MainMenu.this, MainMenu.class);
        startActivity(refresher);


    }

    private void logCursor(Cursor cursor) {
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                String str;
                do {
                    str = "";
                    for (String cn : cursor.getColumnNames()) {
                        str = str.concat(cn + " = " + cursor.getString(cursor.getColumnIndex(cn)) + "; ");
                    }
                    Log.d(LOG_TAG, str);
                } while (cursor.moveToNext());
            }
        } else Log.d(LOG_TAG, "Cursor is null");
    }

}

