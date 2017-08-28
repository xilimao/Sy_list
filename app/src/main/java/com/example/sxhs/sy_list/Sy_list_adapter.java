package com.example.sxhs.sy_list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sxhs on 2017/8/28.
 */

public class Sy_list_adapter extends BaseAdapter {

    private ArrayList<Xinxi> xinxi;
    private Context context;

    public Sy_list_adapter(ArrayList<Xinxi> xinxiss, Context context) {
        this.xinxi=xinxiss;
        this.context=context;
    }

    @Override
    public int getCount() {
        return xinxi.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //显示的是什么
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView ;
        if (convertView == null) {
            listItemView = View.inflate(context, R.layout.list_view, null);
        }else{
            listItemView=convertView;
        }

        //Xinxi xinxis = getItem(position);

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.text1);
        locationTextView.setText(xinxi.get(position).getNameDiLocatiion());

        TextView xiangXiTextView = (TextView) listItemView.findViewById(R.id.text2);
        xiangXiTextView.setText(xinxi.get(position).getXiangXiXinxi());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image1);
        imageView.setImageResource(xinxi.get(position).getImageId());

        return listItemView;
    }

}
