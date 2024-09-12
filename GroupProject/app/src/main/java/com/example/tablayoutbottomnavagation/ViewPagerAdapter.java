package com.example.tablayoutbottomnavagation;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new homeFragment();
            case 1:
                return new searchFragment();
            case 2:
                return new bookshelfFragment();
            case 3:
                return new accountFragment();
            default:
                return new homeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}