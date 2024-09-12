package com.example.tablayoutbottomnavagation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private List<Category> categoryList;

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        public TextView categoryTitle;
        public RecyclerView bookRecyclerView;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            categoryTitle = itemView.findViewById(R.id.categoryTitle);
            bookRecyclerView = itemView.findViewById(R.id.bookRecyclerView);
        }
    }

    public CategoryAdapter(List<Category> categories) {
        categoryList = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = categoryList.get(position);
        holder.categoryTitle.setText(category.getTitle());

        BookAdapter bookAdapter = new BookAdapter(category.getBooks());
        holder.bookRecyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        holder.bookRecyclerView.setAdapter(bookAdapter);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
