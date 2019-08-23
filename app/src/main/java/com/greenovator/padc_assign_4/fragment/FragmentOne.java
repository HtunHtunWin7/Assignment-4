package com.greenovator.padc_assign_4.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greenovator.padc_assign_4.R;
import com.greenovator.padc_assign_4.adapter.FragmentOneAdapter;
import com.greenovator.padc_assign_4.deligate.ItemDeligate;

public class FragmentOne extends Fragment {
    ItemDeligate itemDeligate;
    public static FragmentOne newInstance() {

        Bundle args = new Bundle();

        FragmentOne fragment = new FragmentOne();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        FragmentOneAdapter adapter = new FragmentOneAdapter(itemDeligate);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
