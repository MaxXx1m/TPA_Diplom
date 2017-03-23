package com.example.user.diplom;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static com.example.user.diplom.DataBaseHelper.FOOD_NAME;

public class Spisok extends AppCompatActivity {
DataBaseHelper dataBaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok);

        final Intent intent= new Intent(Spisok.this, Sozd.class);
        View.OnClickListener clicklist = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int editId = v.getId();
                //   Button currEditTxt = Button.(editId);
                intent.putExtra("BtnId",editId);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Id =" + editId , Toast.LENGTH_SHORT);
                toast.show();
                finish();
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
            LinearLayout mainLayout = (LinearLayout)findViewById(R.id.Sll);


            Button iTem2 = new Button(Spisok.this);
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
