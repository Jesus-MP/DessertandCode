package com.example.jesus.dessertandcode;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Sets the View of your main screen
        setContentView(R.layout.activity_main);
        //Does the hard part setting up the framework for you to put your tabs
        setTabs();

    }












    //sets up the tab stuff
    public void setTabs() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Empty1"));
        tabLayout.addTab(tabLayout.newTab().setText("Empty2"));
        tabLayout.addTab(tabLayout.newTab().setText("Empty3"));
        tabLayout.addTab(tabLayout.newTab().setText("Empty4"));




        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(getResources().getColor(R.color.black), getResources().getColor(R.color.white));
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.white));

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        final FragmentPageAdapter adapter = new FragmentPageAdapter(getSupportFragmentManager(), 4);
        viewPager.setAdapter(adapter);


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


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
}
