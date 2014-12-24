package com.example.valdasb.mano1;

import android.content.ClipData;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;


public class Pirmaspsl extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pirmaspsl);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pirmaspsl, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pagrindinis:
                Intent intent = new Intent(Pirmaspsl.this, Pirmas.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),
                        "Surasta!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.antras:
                Intent intent1 = new Intent(Pirmaspsl.this, Antraspsl.class);
                startActivity(intent1);

                Toast.makeText(getApplicationContext(),
                        "Surasta!!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.trecias:
                Intent intent2 = new Intent(Pirmaspsl.this, Treciaspsl.class);
                startActivity(intent2);

                Toast.makeText(getApplicationContext(),
                        "Surasta", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }


}
