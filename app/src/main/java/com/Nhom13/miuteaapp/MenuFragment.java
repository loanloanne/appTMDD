package com.Nhom13.miuteaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Nhom13.adapters.adapterAllProduct;
import com.Nhom13.miuteaapp.databinding.FragmentMenuBinding;
import com.Nhom13.models.Product;

import java.util.ArrayList;
import java.util.List;


public class MenuFragment extends Fragment {
    FragmentMenuBinding binding;
    String [] listCuaHang;

    ArrayAdapter<String> adapterCuaHang;

    SearchView searchView;

    RecyclerView recyclerView;

   adapterAllProduct arrAllProduct;

   List<Product> productList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     //  View view = inflater.inflate(R.layout.fragment_menu, container, false);
       binding = FragmentMenuBinding.inflate(inflater,container,false);
        recyclerView = binding.recycleViewSp;
        View view = binding.getRoot();
        return view;

    }
//    Chọn cửa hàng
    private void selectStrore(){
        listCuaHang = getResources().getStringArray(R.array.CuaHang);
        adapterCuaHang = new ArrayAdapter<>(requireContext(),R.layout.list_cuahang, listCuaHang);
        binding.autoComplete.setAdapter(adapterCuaHang);
    }

     @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();

        recyclerView = view.findViewById(R.id.recycleView_sp);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

       recyclerView.setLayoutManager(mLayoutManager);
        binding.recycleViewSp.setAdapter(arrAllProduct);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (productList != null)
            productList.clear();

    }
    //Nạp data
    private void dataInitialize() {
       productList = new ArrayList<>();

        productList.add(new Product(R.drawable.grass_jelly_milk_coffee, "Grass Jelly Milk Coffee",40000));
        productList.add(new Product(R.drawable.o_long_xoai_kem_coffee, "Ô long xoài kem coffee",40000));
        productList.add(new Product(R.drawable.ngucokemcoffee, "Ngũ cốc kem coffee",40000));
        productList.add(new Product(R.drawable.hongtrangucockemcafe, "Hồng trà ngũ cốc kem cafe",40000));
        productList.add(new Product(R.drawable.suachuamanhatsen, "Sữa chua mận hạt sen",40000));
        productList.add(new Product(R.drawable.royal_pearl_milk_coffee, "Royal pearl milk coffee",40000));
        productList.add(new Product(R.drawable.royal_pearl_milk_coffee, "Grass Jelly Milk Coffee",40000));
        productList.add(new Product(R.drawable.o_long_xoai_kem_coffee, "Ngũ cốc kem coffee",40000));

        arrAllProduct = new adapterAllProduct(getActivity(), productList);
    }

    // Sự kiện các nút
    private void addEvent(){
        binding.btnMonMoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataInitialize();
            }
        });
    }

}


