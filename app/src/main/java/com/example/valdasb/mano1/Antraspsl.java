package com.example.valdasb.mano1;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
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


public class Antraspsl extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antraspsl);
    }

    @Override
    public void onBackPressed() {
        AlertDialog diaBox = AskOption();
        diaBox.show();
    }

    private AlertDialog AskOption()
    {
        return new AlertDialog.Builder(this)
                .setTitle(R.string.exit)
                .setMessage(R.string.exit_question)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_antraspsl, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pagrindinis:
                Intent intent = new Intent(Antraspsl.this, Pirmaspsl.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),
                        "Surasta!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pirmas:
                Intent intent1 = new Intent(Antraspsl.this, Pirmaspsl.class);
                startActivity(intent1);

                Toast.makeText(getApplicationContext(),
                        "Surasta!!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.trecias:
                Intent intent2 = new Intent(Antraspsl.this, Treciaspsl.class);
                startActivity(intent2);

                Toast.makeText(getApplicationContext(),
                        "surasta", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }


}
