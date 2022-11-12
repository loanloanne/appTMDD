package com.Nhom13.miuteaapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Nhom13.miuteaapp.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

import com.Nhom13.miuteaapp.adapters.AdapterSpBanChay;
import com.Nhom13.miuteaapp.models.SpBanChay;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    RecyclerView rcvSpBanChay;
    AdapterSpBanChay adapterBC;
    List<SpBanChay> ListSpBC;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        rcvSpBanChay = binding.rcvSpBanChay;

        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcvSpBanChay = view.findViewById(R.id.rcv_SpBanChay);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        rcvSpBanChay.setLayoutManager(mLayoutManager);
        rcvSpBanChay.setAdapter(adapterBC);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Destroy previous fragment's data
        if (ListSpBC != null)
            ListSpBC.clear();
        initData();
    }

    private void initData() {
        ListSpBC = new ArrayList<>();
        ListSpBC.add(new SpBanChay(R.drawable.hong_tra_ngu_coc_kem_cf,"Hồng trà ngũ cốc kem cafe"));
        ListSpBC.add(new SpBanChay(R.drawable.grass_jelly_milk_coffee,"Grass Jelly milk coffee"));
        ListSpBC.add(new SpBanChay(R.drawable.ngu_coc_kem_cf,"Ngũ cốc kem cafe"));
        ListSpBC.add(new SpBanChay(R.drawable.olong_kem_phomai,"Ô long kem phô mai"));
        ListSpBC.add(new SpBanChay(R.drawable.olong_xoai_kem,"Ô long xoài kem"));
        ListSpBC.add(new SpBanChay(R.drawable.sua_chua_man_hat_sen,"Sữa chua mận hạt sen"));
        ListSpBC.add(new SpBanChay(R.drawable.tiger_sugar,"Tiger Sugar"));

        adapterBC = new AdapterSpBanChay(getActivity(), ListSpBC);
    }


}
