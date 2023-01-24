package com.example.demoapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapplication.R;
import com.example.demoapplication.data.Contact;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.holder> {
    ArrayList<Contact> list;

    public ContactAdapter(ArrayList<Contact> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ContactAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_row_item, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.holder holder, int position) {
        Contact model = list.get(position);
        holder.imgview.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.mobilenum.setText(model.getMobile_no());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder {

        ImageView imgview;
        TextView name;
        TextView mobilenum;

        public holder(@NonNull View itemView) {
            super(itemView);

            imgview = itemView.findViewById(R.id.img_contact);
            name = itemView.findViewById(R.id.text);
            mobilenum = itemView.findViewById(R.id.text2);
        }
    }
}
