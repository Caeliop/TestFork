package com.example.b2_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<HeroBean> mHeroBeans;
    private Context mContext;

    public MyAdapter(List<HeroBean> heroBeans, Context context) {
        this.mHeroBeans = heroBeans;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mHeroBeans.size();
    }

    @Override
    public Object getItem(int i) {
        return mHeroBeans.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater _LayoutInflater=LayoutInflater.from(mContext);
        view=_LayoutInflater.inflate(R.layout.spinner_item, null);
        if(view!=null)
        {
            TextView textView=(TextView)view.findViewById(R.id.name);
            ImageView imageView=view.findViewById(R.id.icon);
            textView.setText(mHeroBeans.get(position).getName());
            imageView.setImageResource(mHeroBeans.get(position).getIcon());
        }
        return view;
    }
}

