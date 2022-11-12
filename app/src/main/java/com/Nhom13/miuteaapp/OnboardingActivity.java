package com.Nhom13.miuteaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.Nhom13.adapters.ViewPagerAdapter;
import com.Nhom13.miuteaapp.databinding.ActivityOnboardingBinding;

public class OnboardingActivity extends AppCompatActivity {
    ActivityOnboardingBinding binding;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_onboarding);
        binding = ActivityOnboardingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        LoadData();
        addEvents();


    }



    private void LoadData() {
        viewPagerAdapter = new ViewPagerAdapter(this);
        binding.slider.setAdapter(viewPagerAdapter);
        binding.CircleIndicator.setViewPager(binding.slider);
        binding.btnLogin.setVisibility(View.INVISIBLE);

    }
    // Nhấn vào nút "Skip" chuyển sang màn hình onboarding số 3
    private void addEvents() {
        binding.txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.slider.setCurrentItem(2);
            }
        });
        // Nhấn vào nút "Tiếp" thì chuyển màn hình onboarding
        binding.txtContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.slider.getCurrentItem()<2){
                    binding.slider.setCurrentItem(binding.slider.getCurrentItem()+1);
                }
            }
        });
        //Nhấn vào nút đăng ký chuyển sang màn hình đăng nhập, đăng ký
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnboardingActivity.this, LoginActvity.class);
                startActivity(intent);
            }
        });
        //Thay đổi trang trên onboarding (ẩn hiện các nút)
        binding.slider.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    binding.btnLogin.setVisibility(View.GONE);
                    binding.txtSkip.setVisibility(View.VISIBLE);
                    binding.txtContinue.setVisibility(View.VISIBLE);
                }
                else if(position ==1){
                    binding.btnLogin.setVisibility(View.GONE);
                    binding.txtSkip.setVisibility(View.VISIBLE);
                    binding.txtContinue.setVisibility(View.VISIBLE);
                }
                else if(position == 2){
                    binding.btnLogin.setVisibility(View.VISIBLE);
                    binding.txtSkip.setVisibility(View.GONE);
                    binding.txtContinue.setVisibility(View.GONE);

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }

}