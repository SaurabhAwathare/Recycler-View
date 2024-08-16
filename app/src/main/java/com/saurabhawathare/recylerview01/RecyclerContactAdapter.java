package com.saurabhawathare.recylerview01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    final Context context;
    final ArrayList<ContactModel> arryContact;

    // Constructor should be inside the class
    public RecyclerContactAdapter(Context context, ArrayList<ContactModel> arryContact) {
        this.context = context;
        this.arryContact = arryContact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the contact_row layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_row, parent, false);
        return new ViewHolder(view);  // Return the ViewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind the data to the views
        holder.txtContactName.setText(arryContact.get(position).name);
        holder.txtContactNumber.setText(arryContact.get(position).number);
        holder.imageView2.setImageResource(arryContact.get(position).img);
    }

    @Override
    public int getItemCount() {
        return arryContact.size();  // Return the size of the contact list
    }

    /** @noinspection InnerClassMayBeStatic*/
    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView txtContactName;
        final TextView txtContactNumber;
        final ImageView imageView2;

        public ViewHolder(View itemView) {
            super(itemView);
            // Initialize the views
            txtContactName = itemView.findViewById(R.id.txtContactName);
            txtContactNumber = itemView.findViewById(R.id.txtContactNumber);
            imageView2 = itemView.findViewById(R.id.imageView2);
        }
    }
}
