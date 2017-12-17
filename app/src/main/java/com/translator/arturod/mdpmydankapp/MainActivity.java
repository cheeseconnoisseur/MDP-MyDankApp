package com.translator.arturod.mdpmydankapp;

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


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager fragmentManager = getFragmentManager();
    NavigationView navigationView = null ;
    Toolbar toolbar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

MainFragment fragment = new MainFragment();
        FragmentTransaction  fragmentTransaction  = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
         toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home) {
            Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
            MainFragment fragment = new MainFragment();
            FragmentTransaction  fragmentTransaction  = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment );
            fragmentTransaction.commit();




        } else if (id == R.id.nav_gallery ) {
            Toast toast= Toast.makeText(getApplicationContext(), "opening browser", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CLIP_VERTICAL  | Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
            webview   fragment = new webview();
            FragmentTransaction  fragmentTransaction  = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment );
            fragmentTransaction.commit();

        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "navy seals", Toast.LENGTH_SHORT).show();

            beemovie  fragment = new beemovie();
            FragmentTransaction  fragmentTransaction  = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();


        } else if (id == R.id.wearenumber1 ) {
            Toast.makeText(this, "we are number one", Toast.LENGTH_SHORT).show();

            weare   fragment = new weare() ;
            FragmentTransaction  fragmentTransaction  = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.iamtheone ) {
            Toast.makeText(this, "i am the one", Toast.LENGTH_SHORT).show();

            iamtheone fragment = new iamtheone();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.legend1  ) {
                Toast.makeText(this, "the legend 27 script", Toast.LENGTH_SHORT).show();

                legend  fragment = new legend() ;
                FragmentTransaction  fragmentTransaction  = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();
        } else if (id == R.id.meme ) {
            Toast.makeText(this, "i  am a meme", Toast.LENGTH_SHORT).show();

            meme fragment = new meme();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.navyr  ) {
            Toast.makeText(this, "emergency broadcast", Toast.LENGTH_SHORT).show();

            navyresponse  fragment = new navyresponse() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.grandad   ) {
            Toast.makeText(this, "grandad smoked", Toast.LENGTH_SHORT).show();

            grandad   fragment = new grandad() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();

    } else if (id == R.id.lenny   ) {
        Toast.makeText(this, "( ͡° ͜ʖ ͡°)", Toast.LENGTH_SHORT).show();

        lenny   fragment = new lenny() ;
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();

        } else if (id == R.id.confu   ) {
            Toast.makeText(this, "ಠ_ಠ", Toast.LENGTH_SHORT).show();

            confused    fragment = new confused() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.devious  ) {
            Toast.makeText(this, "ಠ‿ಠ", Toast.LENGTH_SHORT).show();

            shruggy    fragment = new shruggy() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.caillou   ) {
            Toast.makeText(this, "caillou", Toast.LENGTH_SHORT).show();

            af    fragment = new af() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.settings   ) {
            Toast.makeText(this, "welcome to settings", Toast.LENGTH_SHORT).show();

            Intent myIntent = new Intent(MainActivity .this, SettingsActivity .class);
            myIntent.putExtra("key", 3); //Optional parameters
            MainActivity .this.startActivity(myIntent);
        } else if (id == R.id.rant    ) {
            Toast.makeText(this, "BEWARE HACKERS", Toast.LENGTH_SHORT).show();

            gg   fragment = new gg() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.mehmeh   ) {
            Toast.makeText(this, "I LOVE MEMES", Toast.LENGTH_SHORT).show();

            ilovem    fragment = new ilovem() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.navym   ) {
            Toast.makeText(this, "MEDIVAL NAVY SEALSSS", Toast.LENGTH_SHORT).show();

            navymedival     fragment = new navymedival() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.trumpscript   ) {
            Toast.makeText(this, "Full Trump Victory Script", Toast.LENGTH_SHORT).show();

            trumpspeech  fragment = new trumpspeech() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.jets   ) {
            Toast.makeText(this, "LOTS AND LOTS OF JETSSSSS", Toast.LENGTH_SHORT).show();

            jets   fragment = new jets() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        } else if (id == R.id.memesetudio) {
            Toast.makeText(this, "opening meme studio", Toast.LENGTH_SHORT).show();

            Intent myIntent = new Intent(MainActivity .this, pepememes    .class);
            myIntent.putExtra("key", 3); //Optional parameters
            MainActivity .this.startActivity(myIntent);
        } else if (id == R.id.ah) {
            Toast.makeText(this, "i identify as an attack helicopter", Toast.LENGTH_SHORT).show();

            attackh    fragment = new attackh() ;
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
    }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;


    }

}
