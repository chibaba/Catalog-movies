package com.example.genremoviesincinema;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.example.genremoviesincinema.ui.gallery.ActionFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends MultipleFragment {


    @Override
    protected Fragment createFragment() {
        return  ActionFragment.newInstance();
    }
}