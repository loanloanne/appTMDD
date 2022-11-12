package com.Nhom13.miuteaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class DonmuaActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    ImageView imvBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donmua);
        mTabLayout = findViewById(R.id.tab_layout);
        mviewPager = findViewById(R.id.view_pager);

        ViewOrderAdapter viewOrderAdapter = new ViewOrderAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(viewOrderAdapter);
        mTabLayout.setupWithViewPager(mviewPager);
       imvBack = findViewById(R.id.imv_Back);
       imvBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onBackPressed();
           }
       });

    }
}