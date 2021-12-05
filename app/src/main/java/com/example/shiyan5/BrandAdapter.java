package com.example.shiyan5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ViewAnimator;

import java.util.List;


public class BrandAdapter extends ArrayAdapter<Brand> {
    private int resourceId;
    public BrandAdapter(Context context, int textViewResourceId, List<Brand>objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){//获取item布局
        Brand brand=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView brandId=(TextView) view.findViewById(R.id.brand_id);
        TextView brandName=(TextView) view.findViewById(R.id.brand_name);
        TextView brandRank=(TextView) view.findViewById(R.id.brand_rank);
        brandId.setText(brand.getId());
        brandName.setText(brand.getBrand());
        brandRank.setText(brand.getRank());
        return view;

    }
}