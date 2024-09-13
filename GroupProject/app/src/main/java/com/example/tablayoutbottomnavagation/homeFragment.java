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

        // Science Fiction Books
        List<Book> scienceFictionBooks = new ArrayList<>();
        scienceFictionBooks.add(new Book(R.drawable.book3, "The Space Between Worlds", "Micaiah Johnson"));
        scienceFictionBooks.add(new Book(R.drawable.book4, "Shards of Earth", "Adrian Tchaikovsky"));
        scienceFictionBooks.add(new Book(R.drawable.book5, "The Second Rebel", "Linden A. Lewis"));

        // Novels and Literature Books
        List<Book> novelsAndLiteratureBooks = new ArrayList<>();
        novelsAndLiteratureBooks.add(new Book(R.drawable.book6, "Spice and Wolf ", "Isuna Hasekura"));
        novelsAndLiteratureBooks.add(new Book(R.drawable.book7, "That Time I Got Reincarnated as a Slime ", "Fuse"));
        novelsAndLiteratureBooks.add(new Book(R.drawable.book8, "Pocket Universe", "Author Name"));

        // Health, Mind and Body Books
        List<Book> healthMindBodyBooks = new ArrayList<>();
        healthMindBodyBooks.add(new Book(R.drawable.book9, "Reprogram Your Mind", "Dr. Suresh Choudhary"));
        healthMindBodyBooks.add(new Book(R.drawable.book10, "The Power of the Mind", "Samuel Yeboah-Boafo"));
        healthMindBodyBooks.add(new Book(R.drawable.book11, "Power of the Mind", "Anuj Sayal"));

        // Categories
        categoryList = new ArrayList<>();
        categoryList.add(new Category("Science Fiction", scienceFictionBooks));
        categoryList.add(new Category("Novels and Literature", novelsAndLiteratureBooks));
        categoryList.add(new Category("Health, Mind and Body", healthMindBodyBooks));

        categoryAdapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(categoryAdapter);

        return view;
    }
}