package com.example.tablayoutbottomnavagation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private SearchView searchView;
    private RecyclerView recyclerView;
    private SearchResultAdapter adapter;
    private List<SearchResult> allBooks;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        searchView = view.findViewById(R.id.search_view);
        recyclerView = view.findViewById(R.id.search_results_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        allBooks = getAllBooks();
        adapter = new SearchResultAdapter(allBooks);
        recyclerView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                performSearch(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                performSearch(newText);
                return true;
            }
        });
    }

    private void performSearch(String query) {
        List<SearchResult> filteredList = new ArrayList<>();
        for (SearchResult book : allBooks) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(book);
            }
        }
        adapter.updateSearchResults(filteredList);
    }


    private List<SearchResult> getAllBooks() {
        List<SearchResult> books = new ArrayList<>();
        books.add(new SearchResult("Spice and Wolf Vol. 20", "Isuna Hasekura", R.drawable.book3));
        books.add(new SearchResult("One in a Million", "Tony Faggioli", R.drawable.book4));
        books.add(new SearchResult("That time i got Reincarnated as a Slime", "Fuse", R.drawable.book5));
        books.add(new SearchResult("Monogatary", "Nishioishin", R.drawable.book6));
        books.add(new SearchResult("Wandering Witch", "Jougi Shiraishi", R.drawable.book7));
        books.add(new SearchResult("Mushoku Tensei", "Rifujin na Magonote", R.drawable.book8));
        books.add(new SearchResult("Konosuba", "Natsume Akatsuki", R.drawable.book9));


        return books;
    }
}
