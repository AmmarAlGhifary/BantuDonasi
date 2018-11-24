package com.blogspot.yourfavoritekaisar.bantudonasi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleFragment extends Fragment {
    String[] namaPulau,DetailPulau;
    int[] GambarPulau;
    @BindView(R.id.recycleFragment)
    RecyclerView recycleFragment;
    Unbinder unbinder;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycle, container, false);
        unbinder = ButterKnife.bind(this, view);


        namaPulau = getResources().getStringArray(R.array.nama_pulau);
        DetailPulau = getResources().getStringArray(R.array.detail_pulau);
        GambarPulau = new int[]{R.drawable.sulawesiasli,R.drawable.lombok,R.drawable.jabar,R.drawable.sumatra,
        R.drawable.aceh};

        AdapterLombok mAdapterLombok = new AdapterLombok(getContext(), GambarPulau,namaPulau,DetailPulau);

        recycleFragment.setHasFixedSize(true);
        recycleFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        recycleFragment.setAdapter(mAdapterLombok);
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
