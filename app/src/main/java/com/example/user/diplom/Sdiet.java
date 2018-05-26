package com.example.user.diplom;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Sdiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdiet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
<<<<<<< HEAD
        });
=======
        };


        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();

        SQLiteDatabase database = dataBaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        final Cursor cursor2 = database.query(DataBaseHelper.TABLE_DIET, null, null, null, null, null, null);
        cursor2.moveToFirst();
        do {


            int nameIndex = cursor2.getColumnIndex(DIET_NAME);

            final int idIndex = cursor2.getColumnIndex(DataBaseHelper.DIET_ID);
            LinearLayout mainLayout = (LinearLayout) findViewById(R.id.ll2);


            Button iTem2 = new Button(Sdiet.this);
            iTem2.setText(cursor2.getString(nameIndex));
            iTem2.setId(cursor2.getInt(idIndex));
            iTem2.setOnClickListener(clicklist);
            mainLayout.addView(iTem2);

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent2 = new Intent(Sdiet.this, Vvod.class);
                    startActivity(intent2);
                }
            });
        }while(cursor2.moveToNext());
>>>>>>> parent of 2a144ac... Maybe final.
    }

}
