package com.example.recyclerviewdemomaterial;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

    private List<Movie> movieList;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView title, genre, year;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), "Element: " +getAbsoluteAdapterPosition() +" Clicked", Toast.LENGTH_SHORT).show();
                    Log.d("narayan", "Element: " +getAbsoluteAdapterPosition() +" Clicked");
                }
            });

            title = (TextView) itemView.findViewById(R.id.title);
            genre = (TextView) itemView.findViewById(R.id.genre);
            year = (TextView) itemView.findViewById(R.id.year);
        }
    }

    public MoviesAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creates a new View which defines the UI of the recyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new ViewHolder(view);
    }

    // Replaces the contents of a view Invoked by Layout Manager
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
       return movieList.size();
    }

}
