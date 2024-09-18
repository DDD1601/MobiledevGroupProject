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

public class homeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Category 1 Items
        setupItem(view, R.id.category_1_item_1, R.drawable.book1, "Book Title 1", "This is the description for Book 1");
        setupItem(view, R.id.category_1_item_2, R.drawable.book2, "Book Title 2", "This is the description for Book 2");
        setupItem(view, R.id.category_1_item_3, R.drawable.book1, "Book Title 3", "This is the description for Book 3");
        setupItem(view, R.id.category_1_item_4, R.drawable.book2, "Book Title 4", "This is the description for Book 4");
        setupItem(view, R.id.category_1_item_5, R.drawable.book1, "Book Title 5", "This is the description for Book 5");

        // Category 2 Items
        setupItem(view, R.id.category_2_item_1, R.drawable.book2, "Book Title 6", "This is the description for Book 6");
        setupItem(view, R.id.category_2_item_2, R.drawable.book1, "Book Title 7", "This is the description for Book 7");
        setupItem(view, R.id.category_2_item_3, R.drawable.book2, "Book Title 8", "This is the description for Book 8");
        setupItem(view, R.id.category_2_item_4, R.drawable.book1, "Book Title 9", "This is the description for Book 9");
        setupItem(view, R.id.category_2_item_5, R.drawable.book2, "Book Title 10", "This is the description for Book 10");

        // Category 3 Items
        setupItem(view, R.id.category_3_item_1, R.drawable.book1, "Book Title 11", "This is the description for Book 11");
        setupItem(view, R.id.category_3_item_2, R.drawable.book2, "Book Title 12", "This is the description for Book 12");
        setupItem(view, R.id.category_3_item_3, R.drawable.book1, "Book Title 13", "This is the description for Book 13");
        setupItem(view, R.id.category_3_item_4, R.drawable.book2, "Book Title 14", "This is the description for Book 14");
        setupItem(view, R.id.category_3_item_5, R.drawable.book1, "Book Title 15", "This is the description for Book 15");

        // Category 4 Items
        setupItem(view, R.id.category_4_item_1, R.drawable.book2, "Book Title 16", "This is the description for Book 16");
        setupItem(view, R.id.category_4_item_2, R.drawable.book1, "Book Title 17", "This is the description for Book 17");
        setupItem(view, R.id.category_4_item_3, R.drawable.book2, "Book Title 18", "This is the description for Book 18");
        setupItem(view, R.id.category_4_item_4, R.drawable.book1, "Book Title 19", "This is the description for Book 19");
        setupItem(view, R.id.category_4_item_5, R.drawable.book2, "Book Title 20", "This is the description for Book 20");

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
