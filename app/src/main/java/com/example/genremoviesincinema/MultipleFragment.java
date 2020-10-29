package com.example.genremoviesincinema;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;

import com.example.genremoviesincinema.ui.gallery.ActionFragment;
import com.example.genremoviesincinema.ui.home.FantasyFragment;
import com.example.genremoviesincinema.ui.slideshow.RomanceFragment;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;


public abstract class   MultipleFragment extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawer;
    protected  abstract Fragment createFragment();
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolba = findViewById(R.id.toolbar);
//        setSupportActionBar(toolba);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawer=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolba,R.string.nav_open_drawer, R.string.nav_close_drawer);

        drawer.addDrawerListener(toggle);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        FragmentManager fragile = getSupportFragmentManager();
        Fragment fragment = fragile.findFragmentById(R.id.fragment_container);
        if(fragment == null) {
            fragment = createFragment();
            fragile.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Fragment fragment = null;
        FragmentTransaction ft;

        switch (id){
            case R.id.nav_action:
                fragment = new ActionFragment();
                break;
            case R.id.nav_fanatsy:
                fragment = new FantasyFragment();
                break;

            case R.id.nav_romance:
                fragment = new RomanceFragment();
                break;

        }
        if(fragment != null) {
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, fragment);
            ft.commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);


    }


}
