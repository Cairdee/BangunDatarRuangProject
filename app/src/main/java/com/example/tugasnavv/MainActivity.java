package com.example.tugasnavv;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugasnavv.fragment.datar;
import com.example.tugasnavv.fragment.profile;
import com.example.tugasnavv.fragment.ruang;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottom_nav_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_nav_view = findViewById(R.id.bottomView);
        bottom_nav_view.setOnNavigationItemSelectedListener(navListener);

        // Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragment, new profile())
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.profile) {
                        selectedFragment = new profile();
                    } else if (item.getItemId() == R.id.datar) {
                        selectedFragment = new datar();
                    } else if (item.getItemId() == R.id.ruang) {
                        selectedFragment = new ruang();
                    }


                    if (selectedFragment != null) {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flFragment, selectedFragment)
                                .commit();
                        return true;
                    }
                    return false;
                }
            };
}
