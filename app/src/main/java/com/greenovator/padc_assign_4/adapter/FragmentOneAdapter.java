package com.greenovator.padc_assign_4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.greenovator.padc_assign_4.R;
import com.greenovator.padc_assign_4.deligate.ItemDeligate;
import com.greenovator.padc_assign_4.view.holder.ItemHolder;

public class FragmentOneAdapter extends RecyclerView.Adapter {
    private ItemDeligate itemDeligate;

    public FragmentOneAdapter(ItemDeligate itemDeligate) {
        this.itemDeligate = itemDeligate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_city_profile,parent,false);
        return new ItemHolder(view,itemDeligate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
