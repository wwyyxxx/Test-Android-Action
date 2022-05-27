package com.example.dele.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.dele.R;

import java.util.List;

public class FamilyAdapter  extends ArrayAdapter<Family> {

    private  int resourceID;
    public FamilyAdapter(Context context, int resource, List<Family> objects) {
        super(context, resource, objects);
        resourceID = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Family family = getItem(position); // 获取当前项的Family实例
//        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

//        }
        ImageView familyImage = (ImageView) convertView.findViewById(R.id.family_image);
        TextView familyName = (TextView) convertView.findViewById(R.id.family_name);
        TextView familyPhone = (TextView) convertView.findViewById(R.id.family_phone_num);
        familyImage.setImageResource(family.getImageID());
        familyName.setText(family.getName());
        familyPhone.setText(family.getPhoneNum());
        return convertView;
    }
}
