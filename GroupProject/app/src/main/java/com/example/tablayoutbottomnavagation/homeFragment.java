package com.example.tablayoutbottomnavagation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class homeFragment extends Fragment {

    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Sample data
        categoryList = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        books.add(new Book(R.drawable.book2, "Last Hope", "Author: Tony Faggioli"));
        // Add more books to the list

        categoryList.add(new Category("Science Fiction", books));
        categoryList.add(new Category("Novels and Literature", books));
        categoryList.add(new Category("Health, Mind and Body", books));

        categoryAdapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(categoryAdapter);

        return view;
    }
}