package com.example.administrator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private final LayoutInflater minflater;
    private final List<String> data;
    private final int resLayoutId;
    private Context context;

    public CustomAdapter(List<String> data, int resLayoutId, Context context){
        if (data==null){
            throw new NullPointerException("data不能为空");
        }
        this.data = data;
        this.resLayoutId = resLayoutId;
        this.context=context;
        minflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Toast.makeText(context, "position:"+position, Toast.LENGTH_SHORT).show();
        return createViewFromResource(minflater,position,convertView,parent,resLayoutId);
    }

    private View createViewFromResource(LayoutInflater minflater, int position, View convertView, ViewGroup parent, int resLayoutId) {
        View v;
        if (convertView==null) {
            v = minflater.inflate(resLayoutId, parent, false);
        }
        else {
            v=convertView;
        }
        return v;
    }
}
