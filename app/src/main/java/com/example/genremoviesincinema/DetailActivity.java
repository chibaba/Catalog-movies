package com.example.genremoviesincinema;

import android.graphics.Movie;

import androidx.fragment.app.Fragment;

import com.example.genremoviesincinema.ui.gallery.MovieData;

public class DetailActivity {
    public static final String MOVIE_OBJECT = "movie";

    @Override
    protected Fragment createFragment() {
        MovieData movie = (Movie) getIntent().getSerializableExtra(MOVIE_OBJECT);
        return DetailFragment.newInstance(movie)
    }
}
