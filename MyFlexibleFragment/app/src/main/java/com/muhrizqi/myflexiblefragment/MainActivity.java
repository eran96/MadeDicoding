package com.muhrizqi.myflexiblefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HomeFragment mHomeFragment = new HomeFragment();

        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());
        if (!(fragment instanceof HomeFragment)){
            fragmentTransaction.add(R.id.frame_container, mHomeFragment, HomeFragment.class.getSimpleName());
            Log.d("MyFlexibleFragment", "Fragment Name: " + HomeFragment.class.getSimpleName());
            fragmentTransaction.commit();
        }
    }
}
