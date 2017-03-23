package com.example.user.diplom;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Creation extends AppCompatActivity implements View.OnClickListener {
    Button bb1,bb2,bb3,bd1,bd2,bd3,bs1,bs2,bs3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final Intent intent = new Intent(Creation.this, Spisok.class);
        View.OnClickListener clicklist = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int editId = v.getId();
                //   Button currEditTxt = Button.(editId);
                intent.putExtra("BtnId", editId);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Id =" + editId, Toast.LENGTH_SHORT);
                toast.show();
                startActivity(intent);
            }
        };

        bb1 = (Button) findViewById(R.id.b1);
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





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

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
                break;

        }*/
    }
}
