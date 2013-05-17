package edu.umn.pathology.pathcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;


public class PathCalc extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.path_calc, menu);
        return true;
    }

    public void calcGleason() {
        EditText editText1 = (EditText) findViewById(R.id.editText);
        float GS3 = 3 * Float.parseFloat(editText1.getText().toString());
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        float GS4 = 4 * Float.parseFloat(editText2.getText().toString());
        float qGS;
        qGS = (2 * (GS3 + GS4));
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        editText3.setText(String.valueOf(qGS));
    }
}
