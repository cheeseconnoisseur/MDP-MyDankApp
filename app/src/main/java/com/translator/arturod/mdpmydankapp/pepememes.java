package com.translator.arturod.mdpmydankapp;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.translator.arturod.mdpmydankapp.R;

public class pepememes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pepememes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        mainbrowser  fragment = new mainbrowser() ;
        FragmentTransaction  fragmentTransaction  = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "going back to app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent myIntent = new Intent(pepememes  .this, MainActivity     .class);
                myIntent.putExtra("key", 3); //Optional parameters
                pepememes  .this.startActivity(myIntent);

                Snackbar.make(view, "going back to app", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
