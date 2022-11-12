package com.Nhom13.miuteaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.provider.Contacts;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class NotiFragment extends Fragment {
    TextView txtOrder, txtOrder1, txtOrder2, txtOrder3, txtOrder4, txtOrder5,
            txtOrder6,txtOrder7,txtOrder8,txtOrder9;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_noti, container, false);
        txtOrder = (TextView) view.findViewById(R.id.txtOrder);
        txtOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Bạn có thể hủy đơn hàng trong vòng 5 phút từ 15:00 đến 15:05", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder1 = (TextView) view.findViewById(R.id.txtOrder1);
        txtOrder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Bạn đã thanh toán 40.000 đồng cho đơn hàng 1CA001", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder2 = (TextView) view.findViewById(R.id.txtOrder2);
        txtOrder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Xác nhận đơn hàng 1CA001 đã giao thành công", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder3 = (TextView) view.findViewById(R.id.txtOrder3);
        txtOrder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Cảm ơn bạn đã đánh giá đơn hàng 1CA001", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder4 = (TextView) view.findViewById(R.id.txtOrder4);
        txtOrder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Vui lòng thanh toán đơn hàng 1CA002 từ 9:00 đến 9:05", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder5 = (TextView) view.findViewById(R.id.txtOrder5);
        txtOrder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Xác nhận bạn đã hủy đơn hàng 1CA002", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder6 = (TextView) view.findViewById(R.id.txtOrder6);
        txtOrder6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Đơn hàng 1CA003 sẽ đến trong vòng 10 phút từ 19:30 đến 19:40", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder7 = (TextView) view.findViewById(R.id.txtOrder7);
        txtOrder7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Bạn có thể hủy đơn hàng trong thời gian 5 phút kể từ 18:00 đến 18:05", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder8 = (TextView) view.findViewById(R.id.txtOrder8);
        txtOrder8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Xác nhận đơn hàng 1CA099 đã giao thành công", Toast.LENGTH_LONG).show();
                return true;
            }
        });
        txtOrder9 = (TextView) view.findViewById(R.id.txtOrder9);
        txtOrder9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), DonmuaActivity.class);
                startActivity(intent);
            }
        });
        txtOrder9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getActivity(), "Xác nhận đơn hàng 1CAB10 đã giao thành công", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        return view;
    }
}