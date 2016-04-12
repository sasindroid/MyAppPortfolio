package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayAppInfo(View view) {

        Button button = (Button) view;

        String strToast = "Nothing defined";

        switch (view.getId()) {
            case R.id.button1:
                strToast = getString(R.string.toast_spotify);
                break;

            case R.id.button2:
                strToast = getString(R.string.toast_scores);
                break;

            case R.id.button3:
                strToast = getString(R.string.toast_library);
                break;

            case R.id.button4:
                strToast = getString(R.string.toast_build_it_bigger);
                break;

            case R.id.button5:
                strToast = getString(R.string.toast_xyz);
                break;

            case R.id.button6:
                strToast = getString(R.string.toast_own_app);
                break;

            default:
                strToast = "Default defined";
                break;
        }

        Toast.makeText(this, strToast, Toast.LENGTH_SHORT).show();
    }

}
