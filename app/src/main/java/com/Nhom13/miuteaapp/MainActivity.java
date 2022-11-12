package com.Nhom13.miuteaapp;

import static com.Nhom13.miuteaapp.R.color.bottom_navigation_select_icon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.Nhom13.miuteaapp.databinding.ActivityMainBinding;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    HomeFragment homeFragment = new HomeFragment();
    MenuFragment menuFragment = new MenuFragment();
    VoucherFragment voucherFragment = new VoucherFragment();
    NotiFragment notiFragment = new NotiFragment();
    AccountFragment accountFragment = new AccountFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
       changeFragment();


        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
        BadgeDrawable badgeDrawable= binding.bottomNavigation.getOrCreateBadge(R.id.noti);
        badgeDrawable.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), bottom_navigation_select_icon));

        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(10);
        badgeDrawable.setMaxCharacterCount(3);
    }

    private void changeFragment() {
        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;
                    case R.id.menu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, menuFragment).commit();
                        return true;
                    case R.id.voucher:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, voucherFragment).commit();
                        return true;
                    case R.id.noti:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, notiFragment).commit();
                        return true;
                    case R.id.account:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, accountFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }


}