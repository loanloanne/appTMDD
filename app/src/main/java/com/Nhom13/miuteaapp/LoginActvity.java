package com.Nhom13.miuteaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.Nhom13.miuteaapp.databinding.ActivityLoginActvityBinding;
import com.Nhom13.miuteaapp.databinding.ActivityOnboardingBinding;


import java.util.concurrent.TimeUnit;

public class LoginActvity extends AppCompatActivity {
    ActivityLoginActvityBinding binding;
    String codeBySystem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login_actvity);
        binding = ActivityLoginActvityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        addEvents();

    }

    private void addEvents() {

        //Nhấn vào biểu tượng close-->chuyển hướng sang onboarding 3
        binding.btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        //Nhấn vào đồng ý điều khoản--> tích đỏ
        binding.imgAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change photo
                if(binding.imgAgree.getTag()==null|| binding.imgAgree.getTag().equals("notagree"))
                {
                    binding.imgAgree.setImageResource(R.drawable.ic_baseline_check_circle_24);
                    binding.imgAgree.setTag("agree");
                    binding.btnContinuelogin.setEnabled(!binding.edtInputphonemumber.getText().toString().trim().isEmpty());

                }
                else{
                    binding.imgAgree.setImageResource(R.drawable.oval);
                    binding.imgAgree.setTag("notagree");

                }
            }
        });



        //Đọc điều khoản khi nhấn vào Điều khoản và điều kiện
        //Chuyển sang màn hình verify cùng với số điện thoại
        binding.btnContinuelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.edtInputphonemumber.getText().toString().trim().isEmpty()){
                    Toast.makeText(LoginActvity.this, "Nhập số điện thoại", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (binding.imgAgree.getTag()==null|| binding.imgAgree.getTag().equals("notagree")){
                    Toast.makeText(LoginActvity.this, "Bạn chưa đồng ý với điều khoản", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent =  new Intent(LoginActvity.this, VerifyotpActivity.class);
                intent.putExtra("phonenumber", binding.edtInputphonemumber.getText().toString());
                startActivity(intent);

            }

        });
    }
}