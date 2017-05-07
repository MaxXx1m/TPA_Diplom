package com.example.user.diplom;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static com.example.user.diplom.DataBaseHelper.FOOD_NAME;
import static com.example.user.diplom.DataBaseHelper.FOOD_OPS;
import static com.example.user.diplom.DataBaseHelper.FOOD_TEXT;

public class Pprod extends AppCompatActivity {
    DataBaseHelper dataBaseHelper;
    String LOG_TAG = "DB LOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pprod);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Integer Btnid = getIntent().getExtras().getInt("BtnId");
        TextView tv1 = (TextView)  findViewById(R.id.idView1) ;
        TextView tv2 = (TextView)  findViewById(R.id.Name) ;
        TextView tv3 = (TextView)  findViewById(R.id.Text) ;
        TextView tv4 = (TextView)  findViewById(R.id.OPS) ;

        String bTniD = String.valueOf(Btnid);

        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();

        SQLiteDatabase database = dataBaseHelper.getWritableDatabase();

        final Cursor cursor2 = database.query(DataBaseHelper.TABLE_FOOD, null, null, null, null, null, null);
        cursor2.moveToFirst();
         do{
             int idIndex = cursor2.getColumnIndex(DataBaseHelper.FOOD_ID);
             int nameIndex = cursor2.getColumnIndex(FOOD_NAME);
             int textIndex = cursor2.getColumnIndex(FOOD_TEXT);
             int opsIndex = cursor2.getColumnIndex(FOOD_OPS);


             if (Btnid == cursor2.getInt(idIndex) ){
                 Log.d(LOG_TAG, "Cathed");
                tv1.setText(cursor2.getString(idIndex));
                 tv2.setText(cursor2.getString(nameIndex));
                tv3.setText(cursor2.getString(textIndex));
                 tv4.setText(cursor2.getString(opsIndex) + " KKal");
                 break;
             }
         }while (cursor2.moveToNext());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
