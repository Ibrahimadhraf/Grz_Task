package com.example.android.grz_task;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }

    //add navigation button
    private BottomNavigationView.OnNavigationItemSelectedListener listener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectFragment=null;
                    switch (menuItem.getItemId()) {
                        case R.id.nav_home:
                            selectFragment = new HomeFragment();
                            break;
                        case R.id.nav_buy:
                            selectFragment = new BuyingFragment();
                            break;
                        case R.id.nav_more:
                            selectFragment=new MoreFragment();
                            default:
                    }
                    assert selectFragment != null;
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment
                            ,
                            selectFragment ).commit();
                    return true;

                }
            };


}
