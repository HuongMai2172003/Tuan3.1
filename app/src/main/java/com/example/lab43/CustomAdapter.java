package com.example.lab43;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter <Contact>{
    private Context context;
    private int resource;
    private List<Contact> objects;
    private LayoutInflater inflater;
    public CustomAdapter( Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        ViewHodel hodel=new ViewHodel();

        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.item_listview,null);
            hodel.tvAvatar=(TextView)convertView.findViewById(R.id.tvAvatar);
            hodel.tvName=(TextView)convertView.findViewById(R.id.tvAvatar);
            hodel.tvPhone=(TextView)convertView.findViewById(R.id.tvPhone);
            convertView.setTag(hodel);
        }
        else
        {
            hodel=(ViewHodel)convertView.getTag();
        }
        Contact contact=objects.get(position);
        hodel.tvAvatar.setText(String.valueOf(position)); // lay ve text avt
        //hodel.tvAvatar.setBackgroundColor(Color.GREEN);
        hodel.tvName.setText(contact.getName());
        hodel.tvPhone.setText(contact.getPhone());
        return convertView;


    }

    public  class ViewHodel{
        TextView tvAvatar,tvName,tvPhone;
    }
}