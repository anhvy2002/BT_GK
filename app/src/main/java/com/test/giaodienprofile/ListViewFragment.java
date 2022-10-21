package com.test.giaodienprofile;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewFragment extends Fragment{
    ListView listView;
    ArrayList<GiaDung> arrayList;
    Apdater adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = (ListView) view.findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new GiaDung(R.drawable.gd1, "Chảo chống dính", "200.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.gd2, "Bếp điện", "8.450.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.gd3, "Nồi cơm điện", "800.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.gd4, "Máy xay sinh tố", "900.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.gd5, "Bình lọc nước", "6.150.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.gd6, "Lò vi sóng", "1.800.000 VNĐ"));

        adapter = new Apdater(getActivity(), R.layout.giadung_layout, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent myIntent = new Intent(getActivity(), GiaDung_Activity_1.class);
                    startActivity(myIntent);
                }
                if(i==1){
                    Intent myIntent = new Intent(getActivity(), GiaDung_Activity_2.class);
                    startActivity(myIntent);
                }
                if(i==2){
                    Intent myIntent = new Intent(getActivity(), GiaDung_Activity_3.class);
                    startActivity(myIntent);
                }
                if(i==3){
                    Intent myIntent = new Intent(getActivity(), GiaDung_Activity_4.class);
                    startActivity(myIntent);
                }
                if(i==4){
                    Intent myIntent = new Intent(getActivity(), GiaDung_Activity_5.class);
                    startActivity(myIntent);
                }
                if(i==5){
                    Intent myIntent = new Intent(getActivity(), GiaDung_Activity_6.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}