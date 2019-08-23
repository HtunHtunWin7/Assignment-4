package com.greenovator.padc_assign_4.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.greenovator.padc_assign_4.R;
import com.greenovator.padc_assign_4.adapter.FragmentTwoAdapter;
import com.greenovator.padc_assign_4.deligate.ItemDeligate;

public class FragmentTwo extends Fragment {
    ItemDeligate itemDeligate;
    public static FragmentTwo newInstance() {

        Bundle args = new Bundle();

        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.explore_resource,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        FragmentTwoAdapter adapter = new FragmentTwoAdapter(itemDeligate);
        recyclerView.setAdapter(adapter);
        Button button = view.findViewById(R.id.btn_sheet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = getLayoutInflater().inflate(R.layout.bottom_sheet,null);
                BottomSheetDialog dialog = new BottomSheetDialog(getActivity());
                dialog.setContentView(view1);
                dialog.show();
            }
        });
        return view;
    }
}
