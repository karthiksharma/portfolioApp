package com.karthik.udacitynd.sunshine;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Contact me on karthsharma[at]gmail[dot]com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button appListButton[] = new Button[6];
        appListButton[0] = (Button)findViewById(R.id.spotify_app_id);
        createToast(appListButton[0]);

        appListButton[1] = (Button)findViewById(R.id.football_scores_app_button);
        createToast(appListButton[1]);

        appListButton[2] = (Button)findViewById(R.id.library_app_button);
        createToast(appListButton[2]);

        appListButton[3] = (Button)findViewById(R.id.build_bigger_app_button);
        createToast(appListButton[3]);

        appListButton[4] = (Button)findViewById(R.id.xyz_reader_app_button);
        createToast(appListButton[4]);

        appListButton[5] = (Button)findViewById(R.id.capstone_app_button);
        createToast(appListButton[5]);

    }

    //Helper function for handle click event of each app button
    private void createToast(final Button selectedButton){
        selectedButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        selectedButton.getText()+" app will be launched",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
}
