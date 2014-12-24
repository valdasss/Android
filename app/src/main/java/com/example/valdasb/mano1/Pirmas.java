package com.example.valdasb.mano1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.net.Uri;

public class Pirmas extends ActionBarActivity {
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pirmas);

        final Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Pirmas.this, Pirmaspsl.class));

            }
        });


        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Pirmas.this, Antraspsl.class));

            }
        });
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Pirmas.this, Treciaspsl.class));

            }
        });
       final Button button4 = (Button)findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.Youtube.com"));
                startActivity(intent);
            }
        });
        final Button button5 = (Button)findViewById(R.id.button4);

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.Facebook.com"));
                startActivity(intent);
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pirmas, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pirmas:
                Intent intent = new Intent(Pirmas.this, Pirmaspsl.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),
                        "Surasta!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.antras:
                Intent intent1 = new Intent(Pirmas.this, Antraspsl.class);
                startActivity(intent1);

                Toast.makeText(getApplicationContext(),
                        "Surasta!!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.trecias:
                Intent intent2 = new Intent(Pirmas.this, Treciaspsl.class);
                startActivity(intent2);

                Toast.makeText(getApplicationContext(),
                        "Surasta", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void showSettings(View view){
        Intent intent = new Intent(this, settingsActivity.class);
        startActivity(intent);
    }
}