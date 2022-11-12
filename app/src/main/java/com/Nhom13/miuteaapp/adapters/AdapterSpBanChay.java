package com.Nhom13.miuteaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Nhom13.miuteaapp.databinding.ItemSpbanchayBinding;

import java.util.List;

import com.Nhom13.miuteaapp.models.SpBanChay;

public class AdapterSpBanChay extends RecyclerView.Adapter<AdapterSpBanChay.SpBCViewHolder>{

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<SpBanChay> ListSpBC;
    public AdapterSpBanChay(Context context, List<SpBanChay> datas) {
        mContext = context;
        ListSpBC = datas;
    }

    public void setData(List<SpBanChay> list){
        this.ListSpBC =list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SpBCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSpbanchayBinding itemBiding = ItemSpbanchayBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        // View view = LayoutInflater.from(mContext).inflate(R.layout.item_spbanchay, null);
        return new SpBCViewHolder(itemBiding);
    }

    @Override
    public void onBindViewHolder(@NonNull SpBCViewHolder holder, int position) {
        SpBanChay spBanChay = ListSpBC.get(position);
        if (spBanChay == null) {
            return;
        }
        holder.bind(spBanChay);
    }

    @Override
    public int getItemCount() {
        if (ListSpBC != null){
            return ListSpBC.size();
        }
        return 0;
    }

    public class SpBCViewHolder extends RecyclerView.ViewHolder{

        private ImageView imvPhotoSpBanChay;
        private TextView txtNameSpBanChay;

        public SpBCViewHolder(ItemSpbanchayBinding itemBiding) {
            super(itemBiding.getRoot());
            imvPhotoSpBanChay = itemBiding.imvPhotoSpBanChay;
            txtNameSpBanChay = itemBiding.txtNameSpBanChay;

        }

        public TextView getTxtNameSpBanChay() {
            return txtNameSpBanChay;
        }

        public ImageView getImvPhotoSpBanChay() {
            return imvPhotoSpBanChay;
        }

        public void bind(SpBanChay spBanChay) {
            txtNameSpBanChay.setText(spBanChay.getNameSpBanChay());
            imvPhotoSpBanChay.setImageResource(spBanChay.getPhotoSpBanChay());
        }

    }



}
