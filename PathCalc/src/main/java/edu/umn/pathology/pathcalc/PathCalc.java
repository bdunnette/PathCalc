package edu.umn.pathology.pathcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import static java.lang.String.valueOf;


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

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                EditText inputText1 = (EditText) findViewById(R.id.inputText1);
                float GS3 = Float.parseFloat(inputText1.getText().toString());
                EditText inputText2 = (EditText) findViewById(R.id.inputText2);
                float GS4 = Float.parseFloat(inputText2.getText().toString());
                EditText resultText = (EditText) findViewById(R.id.resultText);
                resultText.setText(valueOf(quantitativeGleasonScore(GS3, GS4)));
        }

    }

    //Calculate a quantitative Gleason score
    private float quantitativeGleasonScore(float GS3, float GS4) {
        return 2 * ((3 * (GS3 / 100)) + (4 * (GS4 / 100)));
    }
}
