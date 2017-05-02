package com.example.user.diplom;

import android.content.ContentValues;
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> origin/master
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.user.diplom.DataBaseHelper.FOOD_NAME;
import static com.example.user.diplom.DataBaseHelper.FOOD_OPS;
import static com.example.user.diplom.DataBaseHelper.FOOD_TEXT;
import static com.example.user.diplom.DataBaseHelper.TABLE_FOOD;

public class Sozd extends AppCompatActivity implements View.OnClickListener {
    Button button, btnAdd, btnRead, btnClear;
    EditText etName, etEmail;
    DataBaseHelper dataBaseHelper;
    String LOG_TAG = "myLogs";
    TextView tv1, tv2, tv3, tv4, tv5;
    Integer i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sozd);

        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);

        tv1 = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView3);
        tv3 = (TextView) findViewById(R.id.textView14);
        tv4 = (TextView) findViewById(R.id.textView15);
        tv5 = (TextView) findViewById(R.id.textView16);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnRead = (Button) findViewById(R.id.btnRead);
        btnRead.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();

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
        Cursor cursor;
        Log.d(LOG_TAG, "-----TABLE FOOD------");
        cursor = sqLiteDatabase.query(TABLE_FOOD, null, null, null, null, null, null);
        logCursor(cursor);
        cursor.close();
        Log.d(LOG_TAG, " =================== ");


    }

    void logCursor(Cursor cursor) {
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


    @Override
    public void onClick(View v) {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();

        SQLiteDatabase database = dataBaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        Cursor cursor2 = database.query(DataBaseHelper.TABLE_FOOD, null, null, null, null, null, null);
<<<<<<< HEAD
        Intent intent= new Intent(Sozd.this, Spisok.class);

        switch (v.getId()) {
            case R.id.btnAdd:
                startActivity(intent);
=======


        switch (v.getId()) {
            case R.id.btnAdd:
>>>>>>> origin/master
                contentValues.put(DataBaseHelper.KEY_NAME, name);
                contentValues.put(DataBaseHelper.KEY_MAIL, email);

                database.insert(DataBaseHelper.TABLE_CONTACTS, null, contentValues);
                break;
            case R.id.btnRead:
                Cursor cursor = database.query(DataBaseHelper.TABLE_CONTACTS, null, null, null, null, null, null);

                if (cursor.moveToFirst()) {
                    int idIndex = cursor.getColumnIndex(DataBaseHelper.KEY_ID);
                    int nameIndex = cursor.getColumnIndex(DataBaseHelper.KEY_NAME);
                    int emailIndex = cursor.getColumnIndex(DataBaseHelper.KEY_MAIL);
                    do {
                        Log.d("mLog", "ID = " + cursor.getInt(idIndex) +
                                ", name - " + cursor.getString(nameIndex) +
                                ", email - " + cursor.getString(emailIndex));
                    } while (cursor.moveToNext());
                } else
                    Log.d("mLog", "0 rows");
                cursor.close();
                break;
            case R.id.btnClear:

                database.delete(DataBaseHelper.TABLE_CONTACTS, null, null);
                break;

            case R.id.button:
                try {
                    cursor2.moveToFirst();
                    cursor2.moveToPosition(i);

                    i = ++i;
                    Log.d(LOG_TAG, "i = " + i);
                    int idIndex = cursor2.getColumnIndex(DataBaseHelper.FOOD_ID);
                    int nameIndex = cursor2.getColumnIndex(FOOD_NAME);
                    int textIndex = cursor2.getColumnIndex(FOOD_TEXT);
                    int opsIndex = cursor2.getColumnIndex(FOOD_OPS);

                    tv1.setText(cursor2.getString(idIndex));
                    tv2.setText(cursor2.getString(nameIndex));
                    tv3.setText(cursor2.getString(textIndex));
                    tv4.setText(cursor2.getString(opsIndex));
                    /* Log.d("mLog", "ID = " + cursor2.getInt(idIndex) +
                            ", name - " + cursor2.getString(nameIndex) +
                            ", text - " + cursor2.getString(textIndex) +
                            ", ops - " + cursor2.getString(opsIndex));    */

                } catch (Exception e) {
                    i = 0;
                    cursor2.moveToFirst();
                    cursor2.moveToPosition(i);

                    i = ++i;
                    Log.d(LOG_TAG, "i = " + i);
                    int idIndex = cursor2.getColumnIndex(DataBaseHelper.FOOD_ID);
                    int nameIndex = cursor2.getColumnIndex(FOOD_NAME);
                    int textIndex = cursor2.getColumnIndex(FOOD_TEXT);
                    int opsIndex = cursor2.getColumnIndex(FOOD_OPS);

                    tv1.setText(cursor2.getString(idIndex));
                    tv2.setText(cursor2.getString(nameIndex));
                    tv3.setText(cursor2.getString(textIndex));
                    tv4.setText(cursor2.getString(opsIndex));
                }  dataBaseHelper.close();
                }}
}