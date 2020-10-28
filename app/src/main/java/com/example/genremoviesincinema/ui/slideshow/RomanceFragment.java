package com.example.genremoviesincinema.ui.slideshow;

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

public class RomanceFragment extends Fragment {

RecyclerView dRecyclerview;
List<MovieData> romanceMoveList;
MovieSheet movieSheet;
MovieAdapter adapter;

 public RomanceFragment() {

 }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movieSheet = new MovieSheet();
        romanceMoveList = movieSheet.getRomanceMovieList();
        adapter = new MovieAdapter(romanceMoveList,getActivity());
        adapter.setOnAdapterListener(new MovieAdapter.CustomeAdapterListener() {
            @Override
            public void adapterListener(int position) {
                MovieData movie = romanceMoveList.get(position);
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DetailActivity.MOVIE_OBJECT,movie);
                startActivity(intent);
            }
        });

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_native_view, container, false);
        dRecyclerview = view.findViewById(R.id.recyclerview);
        dRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        dRecyclerview.setAdapter(adapter);
        return view;
    }

}