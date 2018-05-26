package com.example.user.diplom;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
<<<<<<< HEAD
=======
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.user.diplom.DataBaseHelper.DIET_DAYLYNORM;
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
import static com.example.user.diplom.DataBaseHelper.DIET_TYPE;
>>>>>>> parent of 2a144ac... Maybe final.

public class Pdiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdiet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

<<<<<<< HEAD
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
=======
        Integer Btnid = getIntent().getExtras().getInt("BtnId");

        TextView tv2 = (TextView)  findViewById(R.id.Dname) ;
        TextView tv3 = (TextView)  findViewById(R.id.Dtype) ;
        TextView tv4 = (TextView)  findViewById(R.id.OOPS) ;
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.ll5);
        LinearLayout.LayoutParams lEditParams = new LinearLayout.LayoutParams(
                100, LinearLayout.LayoutParams.WRAP_CONTENT);
        String bTniD = String.valueOf(Btnid);

        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();

        SQLiteDatabase database = dataBaseHelper.getWritableDatabase();
        final Intent intent = new Intent(Pdiet.this, Pprod.class);
        View.OnClickListener clicklist2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int editId = v.getId();
                //   Button currEditTxt = Button.(editId);
                intent.putExtra("BtnId", editId);
                startActivity(intent);

            }
        };

        final Cursor cursor2 = database.query(DataBaseHelper.TABLE_DIET, null, null, null, null, null, null);
        cursor2.moveToFirst();
        do{
            int idIndex = cursor2.getColumnIndex(DataBaseHelper.DIET_ID);
            int nameIndex = cursor2.getColumnIndex(DIET_NAME);
            int textIndex = cursor2.getColumnIndex(DIET_TYPE);
            int opsIndex = cursor2.getColumnIndex(DIET_DAYLYNORM);

            int b1 = cursor2.getColumnIndex(DIET_FOODB1);
            int b2 = cursor2.getColumnIndex(DIET_FOODB2);
            int b3 = cursor2.getColumnIndex(DIET_FOODB3);
            int d1 = cursor2.getColumnIndex(DIET_FOODD1);
            int d2 = cursor2.getColumnIndex(DIET_FOODD2);
            int d3 = cursor2.getColumnIndex(DIET_FOODD3);
            int s1 = cursor2.getColumnIndex(DIET_FOODS1);
            int s2 = cursor2.getColumnIndex(DIET_FOODS2);
            int s3 = cursor2.getColumnIndex(DIET_FOODS3);


            if (Btnid == cursor2.getInt(idIndex) ){
                Log.d(LOG_TAG, "Cathed");
              //  tv1.setText(cursor2.getString(idIndex));
                tv2.setText(cursor2.getString(nameIndex));
                tv4.setText(cursor2.getString(opsIndex));
                //Типы рационов
                if (cursor2.getInt(textIndex) == 1) {
                    tv3.setText("Поддержание веса");
                }else if (cursor2.getInt(textIndex) == 2){
                    tv3.setText("Сброс веса");
                }else  tv3.setText("Набор веса");
                final Cursor cursor3 = database.query(DataBaseHelper.TABLE_FOOD, null, null, null, null, null, null);
                cursor3.moveToFirst();
                TextView textviewb = new TextView(Pdiet.this);
                textviewb.setText("");
            //    textviewb.setLayoutParams(lEditParams);
                mainLayout.addView(textviewb);
                    if (cursor2.getInt(b1) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); }else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(b1) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                    if (cursor2.getInt(b2) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); } else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(b2) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                    if (cursor2.getInt(b3) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); } else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(b3) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                TextView textviewd = new TextView(Pdiet.this);
                textviewb.setText("");
          //      textviewb.setLayoutParams(lEditParams);
                mainLayout.addView(textviewd);
                    if (cursor2.getInt(d1) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); }else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(d1) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                    if (cursor2.getInt(d2) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); }else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(d2) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                    if (cursor2.getInt(d3) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); }else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(d3) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                TextView textviews = new TextView(Pdiet.this);
                textviewb.setText("");
          //      textviewb.setLayoutParams(lEditParams);
                mainLayout.addView(textviews);
                    if (cursor2.getInt(s1) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); }else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(s1) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                           // iTem2.sty
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                    if (cursor2.getInt(s2) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); }else{ cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(s2) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}
                    if (cursor2.getInt(s3) == 0){Button iTem2 = new Button(Pdiet.this); mainLayout.addView(iTem2); }else{cursor3.moveToFirst();
                        do {int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(s3) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;}}while (cursor3.moveToNext());}

           /*     do{

                    do {
                       int idfood = cursor3.getColumnIndex(DataBaseHelper.FOOD_ID);
                        if (cursor2.getInt(b1) == cursor3.getInt(idfood)){
                            Button iTem2 = new Button(Pdiet.this);
                            iTem2.setText(cursor3.getString(nameIndex));
                            iTem2.setId(cursor3.getInt(idfood));
                            iTem2.setOnClickListener(clicklist2);
                            mainLayout.addView(iTem2);
                            break;
                        }
                    }while (cursor3.moveToNext());


                    if (){
                        bcount++;
                    }
                }while (bcount == 9);*/
              //  tv4.setText(cursor2.getString(opsIndex) + " KKal");
                break;
            }
        }while (cursor2.moveToNext());


>>>>>>> parent of 2a144ac... Maybe final.
    }

}
