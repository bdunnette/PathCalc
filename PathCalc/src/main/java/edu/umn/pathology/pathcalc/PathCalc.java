package edu.umn.pathology.pathcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

import static java.lang.Float.parseFloat;

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

    public void calcGleason(View view) {
        float GS3 = parseFloat();
        float GS4 = parseFloat();
        float qGS = 2 * ();
    }
}
