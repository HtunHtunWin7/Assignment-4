package com.greenovator.padc_assign_4.view.holder;

import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.greenovator.padc_assign_4.R;
import com.greenovator.padc_assign_4.deligate.ItemDeligate;


public class ItemHolder extends RecyclerView.ViewHolder {
    /*ItemDeligate itemDeligate;
    private TextView text, text2, text3, text4, text_title;
    private ImageView imageView;
    private Button button;*/

    public ItemHolder(@NonNull View itemView, ItemDeligate itemDeligate) {
        super(itemView);
        itemDeligate = itemDeligate;
        /*text = itemView.findViewById(R.id.text);
        text2 = itemView.findViewById(R.id.text2);
        text3 = itemView.findViewById(R.id.text3);
        text4 = itemView.findViewById(R.id.text4);
        text_title = itemView.findViewById(R.id.txt_title);
        button = itemView.findViewById(R.id.button);
        imageView = itemView.findViewById(R.id.image);*/

    }
}
