package com.example.sirjm.sirjm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Motivation mMotivation = new Motivation();

    private RelativeLayout mLayout;
    private TextView mDay;
    private TextView mMotivate;
    private TextView lesson1, mL1lec, mL1tit, mL1ven, mL1tim, venue1, title1;
    private TextView lesson2, mL2lec, mL2tit, mL2ven, mL2tim, venue2, title2;
    private TextView lesson3, mL3lec, mL3tit, mL3ven, mL3tim, venue3, title3;
    private TextView lesson4, mL4lec, mL4tit, mL4ven, mL4tim, venue4, title4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mLayout = (RelativeLayout) findViewById(R.id.content_main);
        mDay = (TextView) findViewById(R.id.tableTextView);
        mMotivate = (TextView) findViewById(R.id.motivationView);

        lesson1 = (TextView) findViewById(R.id.lesson1);
        mL1lec = (TextView) findViewById(R.id.lesson1Lecturer);
        mL1tit = (TextView) findViewById(R.id.lesson1Title);
        mL1ven = (TextView) findViewById(R.id.lesson1Venue);
        mL1tim = (TextView) findViewById(R.id.lesson1Time);
        venue1 = (TextView) findViewById(R.id.venue1);
        title1 = (TextView) findViewById(R.id.title1);

        lesson2 = (TextView) findViewById(R.id.lesson2);
        mL2lec = (TextView) findViewById(R.id.lesson2Lecturer);
        mL2tit = (TextView) findViewById(R.id.lesson2Title);
        mL2ven = (TextView) findViewById(R.id.lesson2Venue);
        mL2tim = (TextView) findViewById(R.id.lesson2Time);
        venue2 = (TextView) findViewById(R.id.venue2);
        title2 = (TextView) findViewById(R.id.title2);

        lesson3 = (TextView) findViewById(R.id.lesson3);
        mL3lec = (TextView) findViewById(R.id.lesson3Lecturer);
        mL3tit = (TextView) findViewById(R.id.lesson3Title);
        mL3ven = (TextView) findViewById(R.id.lesson3Venue);
        mL3tim = (TextView) findViewById(R.id.lesson3Time);
        venue3 = (TextView) findViewById(R.id.venue3);
        title3 = (TextView) findViewById(R.id.title3);

        lesson4 = (TextView) findViewById(R.id.lesson4);
        mL4lec = (TextView) findViewById(R.id.lesson4Lecturer);
        mL4tit = (TextView) findViewById(R.id.lesson4Title);
        mL4ven = (TextView) findViewById(R.id.lesson4Venue);
        mL4tim = (TextView) findViewById(R.id.lesson4Time);
        venue4 = (TextView) findViewById(R.id.venue4);
        title4 = (TextView) findViewById(R.id.title4);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "created By Sir JM Kitavi.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
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
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Quote quote = mMotivation.getARandomQuote();


        if (id == R.id.nav_mon) {

            mDay.setText("Monday");
            mMotivate.setText(quote.getQuote());

            mL1lec.setText("Mr. Kiiru");
            mL1tit.setText("BIT 2301: Research Methdlgy");
            mL1ven.setText("PREF 3-02");
            mL1tim.setText("7:30-10am");

            mL2lec.setText("Mr. Ndegwa");
            mL2tit.setText("ICS 2404: Adv. Database(SQL)");
            mL2ven.setText("Korea 2");
            mL2tim.setText("10-1:00pm");

            mL3lec.setText("Mr. Kyenge");
            mL3tit.setText("BIT 2203: Adv. Program.(C++)");
            mL3ven.setText("EG28");
            mL3tim.setText("2-4:00pm");

            mL4lec.setText("Owende");
            mL4tit.setText("Probability and Statistics");
            mL4ven.setText("PREF 2-04");
            mL4tim.setText("4:30-6:00pm");

        } else if (id == R.id.nav_tue) {
            mDay.setText("Tuesday");
            mMotivate.setText(quote.getQuote());

            mL1lec.setText("Mr. Kane");
            mL1tit.setText("BIT 2207: Internet App. Prog.");
            mL1ven.setText("PREF 2-01");
            mL1tim.setText("8-10am");

            mL2lec.setText("Dr. Iyaya");
            mL2tit.setText("SMA 2102: Calculus");
            mL2ven.setText("varies");
            mL2tim.setText("10-1:00pm");

            mL3lec.setText("Dr. Iyaya");
            mL3tit.setText("SMA 2102: Calculus");
            mL3ven.setText("varies");
            mL3tim.setText("2-4:00pm");

            mL4lec.setText("Owende");
            mL4tit.setText("Probability & Statistics");
            mL4ven.setText("PREF 2-04");
            mL4tim.setText("4:30-6:00pm");

        } else if (id == R.id.nav_wed) {
            mDay.setText("Wednesday");
            mMotivate.setText(quote.getQuote());

            mL1lec.setText("Mr. Kane");
            mL1tit.setText("BIT 2201: Internet App. Prog.");
            mL1ven.setText("LAB A05");
            mL1tim.setText("8-10am");

            mL2lec.setText("x.x.x.x.");
            mL2tit.setText("x.x.x.x.");
            mL2ven.setText("x.x.x.x.");
            mL2tim.setText("x.x.x.x.");


            mL3lec.setText("Mr. Kyenge");
            mL3tit.setText("BIT 2203: Adv. Programm.(C++)");
            mL3ven.setText("LAB A06");
            mL3tim.setText("2-4:00pm");

            mL4lec.setText("x.x.x.x.");
            mL4tit.setText("x.x.x.x.");
            mL4ven.setText("x.x.x.x.");
            mL4tim.setText("x.x.x.x.");



        } else if (id == R.id.nav_thur) {
            mDay.setText("Thursday");
            mMotivate.setText(quote.getQuote());

            mL1lec.setText("Mr. Ndegwa");
            mL1tit.setText("ICS 2404: Adv. Database(SQL)");
            mL1ven.setText("EG 28");
            mL1tim.setText("8-10am");

            mL2lec.setText("x.x.x.x.");
            mL2tit.setText("x.x.x.x.");
            mL2ven.setText("x.x.x.x.");
            mL2tim.setText("x.x.x.x.");


            mL3lec.setText("Dr. F. Kamau");
            mL3tit.setText("BIT 2208: Marketing Management");
            mL3ven.setText("EG28");
            mL3tim.setText("2-4:00pm");

            mL4lec.setText("x.x.x.x.");
            mL4tit.setText("x.x.x.x.");
            mL4ven.setText("x.x.x.x.");
            mL4tim.setText("x.x.x.x.");



        } else if (id == R.id.nav_fri) {
            mDay.setText("Friday");
            mMotivate.setText(quote.getQuote());

            mL1lec.setText("x.x.x.x.");
            mL1tit.setText("x.x.x.x.");
            mL1ven.setText("x.x.x.x.");
            mL1tim.setText("x.x.x.x.");


            mL2lec.setText("x.x.x.x.");
            mL2tit.setText("x.x.x.x.");
            mL2ven.setText("x.x.x.x.");
            mL2tim.setText("x.x.x.x.");


            mL3lec.setText("Mr. Kituku");
            mL3tit.setText("Design & Analysis of Algorithms");
            mL3ven.setText("EG28");
            mL3tim.setText("2-5:00pm");

            mL4lec.setText("x.x.x.x.");
            mL4tit.setText("x.x.x.x.");
            mL4ven.setText("x.x.x.x.");
            mL4tim.setText("x.x.x.x.");

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
