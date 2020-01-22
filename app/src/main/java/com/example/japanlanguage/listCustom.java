package com.example.japanlanguage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class listCustom extends ArrayAdapter<translate> {

    public listCustom(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public listCustom(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public listCustom(@NonNull Context context, int resource, @NonNull translate[] objects) {
        super(context, resource, objects);
    }

    public listCustom(@NonNull Context context, int resource, int textViewResourceId, @NonNull translate[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public listCustom(@NonNull Context context, int resource, @NonNull List<translate> objects) {
        super(context, resource, objects);
    }

    public listCustom(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<translate> objects) {
        super(context, resource, textViewResourceId, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view =convertView;
        if(view==null){
            LayoutInflater inflater =LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.activity_data, null);
        }
        translate tran = getItem(position);
        if(tran!=null){
            TextView japan = (TextView)view.findViewById(R.id.Japan);
            TextView vietNam = (TextView)view.findViewById(R.id.vn);

            japan.setText(tran.getJapan());
            vietNam.setText(tran.getVietNam());
        }
        return view;
    }
}
