package com.test.giaodienprofile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Apdater extends BaseAdapter {
    private Context context;
    private int layout;
    private List<GiaDung> arraylist;

    public Apdater(Context context, int layout, List<GiaDung> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        GiaDung giaDung = arraylist.get(i);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tv_ten = view.findViewById(R.id.tv_ten);
        TextView tv_gia = view.findViewById(R.id.tv_gia);

        imageView.setImageResource(giaDung.getHinh());
        tv_ten.setText(giaDung.getTen());
        tv_gia.setText(giaDung.getGia());
        return view;
    }
}
