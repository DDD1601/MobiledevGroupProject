package com.example.tablayoutbottomnavagation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class bookshelfFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bookshelf, container, false);

        // Category 1 Items
        setupItem(view, R.id.category_1_item_1, R.drawable.book1, "Book Title 1", "This is the description for Book 1");
        setupItem(view, R.id.category_1_item_2, R.drawable.book2, "Book Title 2", "This is the description for Book 2");
        setupItem(view, R.id.category_1_item_3, R.drawable.book1, "Book Title 3", "This is the description for Book 3");
        setupItem(view, R.id.category_1_item_4, R.drawable.book2, "Book Title 4", "This is the description for Book 4");
        setupItem(view, R.id.category_1_item_5, R.drawable.book1, "Book Title 5", "This is the description for Book 5");
        setupItem(view, R.id.category_1_item_6, R.drawable.book1, "Book Title 6", "This is the description for Book 1");
        setupItem(view, R.id.category_1_item_7, R.drawable.book2, "Book Title 7", "This is the description for Book 2");
        setupItem(view, R.id.category_1_item_8, R.drawable.book1, "Book Title 8", "This is the description for Book 3");
        setupItem(view, R.id.category_1_item_9, R.drawable.book2, "Book Title 9", "This is the description for Book 4");
        setupItem(view, R.id.category_1_item_10, R.drawable.book1, "Book Title 10", "This is the description for Book 5");

        return view;
    }

    private void setupItem(View view, int itemId, int imageResId, String title, String description) {
        View item = view.findViewById(itemId);
        ImageView itemImage = item.findViewById(R.id.reusableimage);
        TextView itemTitle = item.findViewById(R.id.reusabletitle);
        TextView itemDescription = item.findViewById(R.id.reusabledescription);

        itemImage.setImageResource(imageResId);
        itemTitle.setText(title);
        itemDescription.setText(description);
    }
}
