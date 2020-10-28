package com.example.genremoviesincinema.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.genremoviesincinema.MovieAdapter;
import com.example.genremoviesincinema.MovieSheet;
import com.example.genremoviesincinema.R;
import com.example.genremoviesincinema.ui.gallery.MovieData;

import java.util.List;

public class FantasyFragment extends Fragment {

  RecyclerView dRecyclerView;
  List<MovieData> fantasymovieList;
  MovieSheet movieSheet;
  MovieAdapter adapter;

  public FantasyFragment() {

  }
  public static FantasyFragment newInstance(String str, String str2) {
    FantasyFragment fragment = new FantasyFragment();
    return fragment;
  }
  @Override
  public void OnCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    movieSheet = new MovieSheet();
  }
}