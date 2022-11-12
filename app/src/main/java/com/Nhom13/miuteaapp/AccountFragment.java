package com.Nhom13.miuteaapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.Nhom13.miuteaapp.databinding.FragmentAccountBinding;
import com.Nhom13.miuteaapp.databinding.FragmentHomeBinding;


public class AccountFragment extends Fragment {
    TextView txtcapnhat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_account, container, false);
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        txtcapnhat = (TextView) view.findViewById(R.id.txt_confirm);
        txtcapnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), capnhatthongtin.class);
                startActivity(intent);
            }
        });
        return view;

    }
}