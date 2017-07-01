package com.example.leochris.launcher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SettingAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<FragmentInfo> mDataSource;

    public SettingAdapter(Context context, ArrayList<FragmentInfo> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //1
    @Override
    public int getCount() {
        return mDataSource.size();
    }
    //2
    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }
    //3
    @Override
    public long getItemId(int position) {
        return position;
    }
    //4
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get view for row item
        View rowView = mInflater.inflate(R.layout.list_item, parent, false);
        TextView titleTextView =
                (TextView) rowView.findViewById(R.id.fragment_title);
        FragmentInfo mFragment = (FragmentInfo) getItem(position);

        titleTextView.setText(mFragment.getName());
        return rowView;
    }

}