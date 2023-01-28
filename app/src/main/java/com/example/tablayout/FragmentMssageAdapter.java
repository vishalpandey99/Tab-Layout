package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentMssageAdapter extends FragmentPagerAdapter {


    public FragmentMssageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position==0){

            return new fragChat();
        }
        else if (position==1){

            return new fragStatus();
        }
        else
        {
            return new fragCall();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0){
            return "Chat";
        }
        else if (position==1){
            return "Status";
        }
        else

        {
            return "Call";
        }
    }
}
