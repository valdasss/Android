package com.example.valdasb.mano1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class Treciaspsl extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treciaspsl);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_treciaspsl, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pagrindinis:
                Intent intent = new Intent(Treciaspsl.this, Pirmas.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),
                        "Surasta!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pirmas:
                Intent intent1 = new Intent(Treciaspsl.this, Pirmaspsl.class);
                startActivity(intent1);

                Toast.makeText(getApplicationContext(),
                        "Surasta!!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.antras:
                Intent intent2 = new Intent(Treciaspsl.this, Antraspsl.class);
                startActivity(intent2);

                Toast.makeText(getApplicationContext(),
                        "Surasta", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

}
