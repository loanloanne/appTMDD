package com.Nhom13.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Nhom13.miuteaapp.R;
import com.Nhom13.miuteaapp.databinding.ProductItemBinding;
import com.Nhom13.models.Product;

import java.util.List;

public class adapterAllProduct extends RecyclerView.Adapter<adapterAllProduct.productHolder> {

    Context nContext;
    LayoutInflater nLayoutInflater;
    List<Product> productList;
    public adapterAllProduct(Context context, List<Product> datas) {
        nContext = context;
        productList = datas;
    }

    public void setData(List<Product> list){
        this.productList= list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public productHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProductItemBinding productItemBinding = ProductItemBinding.inflate((LayoutInflater.from(parent.getContext())),parent,false);

//        View view = LayoutInflater.from(context).inflate(R.layout.product_item,parent,false);


        return new productHolder(productItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull productHolder holder, int position) {
        Product p = productList.get(position);

        holder.imvPhoto.setImageResource(p.getPhoto());
        holder.txtName.setText(p.getName());
        holder.txtPrice.setText(Integer.toString((int) p.getPrice()) + "đ");
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class productHolder extends RecyclerView.ViewHolder{
        ImageView imvPhoto;
        TextView txtName;
        TextView txtPrice;
       public productHolder(@NonNull ProductItemBinding productItemBinding) {
           super(productItemBinding.getRoot());
           imvPhoto = itemView.findViewById(R.id.imv_photo);
           txtName = itemView.findViewById(R.id.txt_name);
           txtPrice = itemView.findViewById(R.id.txt_price);
       }


   }

}