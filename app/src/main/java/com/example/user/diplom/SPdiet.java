package com.example.user.diplom;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.user.diplom.DataBaseHelper.DIET_DAYLYNORM;
import static com.example.user.diplom.DataBaseHelper.DIET_NAME;

public class SPdiet extends AppCompatActivity {

    DataBaseHelper dataBaseHelper;
    Button h1;
    public final static
    String IDB="afaf";
    public final static
    String Name="adfaf";
    public final static
    String Ops="adfcaf";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spdiet);
        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();

        final SQLiteDatabase database = dataBaseHelper.getWritableDatabase();
        final Intent answerIntent = new Intent();
        View.OnClickListener clicklist = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int editId = v.getId();


                final Cursor cursor1 = database.query(DataBaseHelper.TABLE_DIET, null, null, null, null, null, null);
                cursor1.moveToFirst();
                do{
                    int idIndex = cursor1.getColumnIndex(DataBaseHelper.DIET_ID);
                    int nameIndex = cursor1.getColumnIndex(DIET_NAME);
                    int opsIndex = cursor1.getColumnIndex(DIET_DAYLYNORM);


                    if (editId == cursor1.getInt(idIndex) ){
                        answerIntent.putExtra(IDB,editId);
                        String bname = cursor1.getString(nameIndex);
                        String kkal = cursor1.getString(opsIndex);
                        answerIntent.putExtra(Name,bname);
                        answerIntent.putExtra(Ops,kkal);
                        break;
                    }
                }while (cursor1.moveToNext());


                setResult(RESULT_OK, answerIntent);
                finish();

            }
        };


        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase1 = dataBaseHelper.getWritableDatabase();

        SQLiteDatabase database1 = dataBaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        final Cursor cursor2 = database1.query(DataBaseHelper.TABLE_DIET, null, null, null, null, null, null);
        cursor2.moveToFirst();
        do{
            //   i = ++i;
            // String naMe = "iTem"+ i;
            int nameIndex = cursor2.getColumnIndex(DIET_NAME);

            final int idIndex = cursor2.getColumnIndex(DataBaseHelper.DIET_ID);
            LinearLayout mainLayout = (LinearLayout)findViewById(R.id.ll18);


            Button iTem2 = new Button(SPdiet.this);
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


    }
}
