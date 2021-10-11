package com.example.recyclerviewdemomaterial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> mMovieList = new ArrayList<Movie>();
    private RecyclerView recyclerView;
    private MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv);

        moviesAdapter = new MoviesAdapter(mMovieList);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutmanager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutmanager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new MyDividerItemDeclaration(this, LinearLayoutManager.VERTICAL, 16));
        recyclerView.setAdapter(moviesAdapter);

        prepareMovieData();


    }

    private void prepareMovieData() {
        Movie movie = new Movie("Singham", "Action", "2008");
        mMovieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
        mMovieList.add(movie);

        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        mMovieList.add(movie);

        movie = new Movie("Shaun the Sheep", "Animation", "2015");
        mMovieList.add(movie);

        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
        mMovieList.add(movie);

        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
        mMovieList.add(movie);

        movie = new Movie("Up", "Animation", "2009");
        mMovieList.add(movie);

        movie = new Movie("Star Trek", "Science Fiction", "2009");
        mMovieList.add(movie);

        movie = new Movie("The LEGO Movie", "Animation", "2014");
        mMovieList.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        mMovieList.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "1986");
        mMovieList.add(movie);

        movie = new Movie("Chicken Run", "Animation", "2000");
        mMovieList.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "1985");
        mMovieList.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
        mMovieList.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
        mMovieList.add(movie);

        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        mMovieList.add(movie);

        moviesAdapter.notifyDataSetChanged();
    }

}