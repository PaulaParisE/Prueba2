package com.example.paulapariselias.prueba2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.paulapariselias.prueba2.R;

/**
 * Created by paulapariselias on 18-08-17.
 */

public class GroceriesAdapter extends RecyclerView.Adapter<GroceriesAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_grocery, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private CheckBox checkBox;
        private TextView textView;


        public ViewHolder(View itemView) {
            super(itemView);

            checkBox =itemView.findViewById(R.id.groceryCb);
            textView =itemView.findViewById(R.id.groceryTv);
        }
    }
}
