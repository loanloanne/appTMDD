package com.Nhom13.miuteaapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewOrderAdapter extends FragmentStatePagerAdapter {
    public ViewOrderAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChoxacnhanFragment();
            case 1:
                return new DanggiaoFragment();
            case 2:
                return new DagiaoFragment();
            case 3:
                return new DahuyFragment();
            default:
                return new ChoxacnhanFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Chờ xác nhận";
                break;
            case 1:
                title="Đang giao";
                break;
            case 2:
                title="Đã giao";
                break;
            case 3:
                title="Đã hủy";
                break;
        }
        return title;
    }
}
