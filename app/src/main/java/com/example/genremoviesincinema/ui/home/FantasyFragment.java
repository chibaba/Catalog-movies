package com.example.genremoviesincinema.ui.home;

import android.content.Intent;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.genremoviesincinema.DetailActivity;
import com.example.genremoviesincinema.MovieAdapter;
import com.example.genremoviesincinema.MovieSheet;
import com.example.genremoviesincinema.R;
import com.example.genremoviesincinema.ui.gallery.MovieData;

import java.util.List;

public class FantasyFragment extends Fragment {

  RecyclerView mRecyclerView ;
  List<MovieData> fantasymovieList;
  MovieSheet moviesheet;
  MovieAdapter adapter;


  public FantasyFragment() {
    // Required empty public constructor
  }


  // TODO: Rename and change types and number of parameters
  public static FantasyFragment newInstance(String param1, String param2) {
    FantasyFragment fragment = new FantasyFragment();
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviesheet = new MovieSheet();

    fantasymovieList = moviesheet.getFantasyMovieList();
    adapter = new MovieAdapter(fantasymovieList,getActivity());

    adapter.setOnAdapterListener(new MovieAdapter.CustomeAdapterListener() {
      @Override
      public void adapterListener(int position) {
        MovieData movie = fantasymovieList.get(position);
        Intent intent = new Intent(getActivity(),DetailActivity.class);
        intent.putExtra(DetailActivity.MOVIE_OBJECT,movie);
        startActivity(intent);
      }
    });
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_native_view, container, false);
    mRecyclerView = view.findViewById(R.id.recyclerview);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    mRecyclerView.setAdapter(adapter);
    return view;
  }
}