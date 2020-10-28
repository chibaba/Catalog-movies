package com.example.genremoviesincinema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);

        FragmentManager fragile = getSupportFragmentManager();
        Fragment fragment = fragile.findFragmentById(R.id.fragment_house);

        if(fragment == null) {
            fragment = createFragment();
            fragile.beginTransaction()
                    .add(R.id.fragment_house, fragment)
                    .commit();
        }
    }

    protected abstract Fragment createFragment();
}