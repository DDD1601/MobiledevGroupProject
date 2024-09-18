package com.example.tablayoutbottomnavagation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder> {

    private List<SearchResult> searchResults;

    public SearchResultAdapter(List<SearchResult> searchResults) {
        this.searchResults = searchResults != null ? searchResults : new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_search_result, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchResult result = searchResults.get(position);
        holder.titleTextView.setText(result.getTitle());
        holder.authorTextView.setText("Author: " + result.getAuthor());
        holder.coverImageView.setImageResource(result.getCoverResId());
    }

    @Override
    public int getItemCount() {
        return searchResults.size();
    }

    public void updateSearchResults(List<SearchResult> newResults) {
        searchResults.clear();
        if (newResults != null) {
            searchResults.addAll(newResults);
        }
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView authorTextView;
        ImageView coverImageView;

        ViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.result_title);
            authorTextView = itemView.findViewById(R.id.result_author);
            coverImageView = itemView.findViewById(R.id.book_cover);
        }
    }
}