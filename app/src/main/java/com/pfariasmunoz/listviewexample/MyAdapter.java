package com.pfariasmunoz.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pablo Farias on 21-09-16.
 */

public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] commands ) {
        super(context, R.layout.row_layout_2, commands);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.row_layout_2, parent, false);

        String command = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.testView_command);
        textView.setText(command);

        String function = getItem(position);
        TextView textView2 = (TextView) view.findViewById(R.id.testView_function);
        textView2.setText(function);

        return view;
    }


}
