
package com.example.recyclerprec.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerprec.MainActivity;
import com.example.recyclerprec.R;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    Context context;
    ArrayList<> model1;
    public CarAdapter(Context context, ArrayList<Moel> model1) {
        this.context = context;
        this.model1 = model1;
    }

    public CarAdapter(Context context, ArrayList<com.example.recyclerprec.Adapter.Model> model) {
    }


    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.car_view,parent,false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {

        holder.txtname.setText(model1.get(position),name);
        holder.txtprice.setText(model1.get(position).price);
        holder.lemp.setImageResource(model1.get(position).lemp);
    }

    @Override
    public int getItemCount() {

        return model1.size();
    }

    class CarViewHolder extends RecyclerView.ViewHolder{
        TextView txtname,txtprice;
        ImageView img;
        public CarViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.txtname);
            txtprice = itemView.findViewById(R.id.txtprice);
            img = itemView.findViewById(R.id.img);
        }
    }
}
