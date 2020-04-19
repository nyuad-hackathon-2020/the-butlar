package com.example.vmac.WatBot.models;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.vmac.WatBot.R;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {
    private Context context;
    private List<Item> items;

    public HistoryAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.history_row, parent, false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HistoryViewHolder holder, final int position) {
        holder.productImage.setImageBitmap(items.get(position).getPicture());
        holder.productName.setText(items.get(position).getName());
        holder.productBrand.setText(items.get(position).getBrand());
        holder.productPrice.setText(String.valueOf(items.get(position).getPrice()));

        for (int i = 0; i < Dummy.getINSTANCE(context).stores.size(); i++) {
            if (Dummy.getINSTANCE(context).stores.get(i).storage.contains(items.get(position))) {
                holder.productStore.setText(Dummy.getINSTANCE(context).stores.get(i).getName());
                break;
            }
        }

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User.currentUser.getHistory().remove(items.get(position));
                items.remove(items.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder {
        public ImageView productImage;
        public TextView productName;
        public TextView productBrand;
        public TextView productPrice;
        public TextView productStore;
        public Button delete;

        public HistoryViewHolder(View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productNameText);
            productBrand = itemView.findViewById(R.id.productBrandText);
            productPrice = itemView.findViewById(R.id.productPriceText);
            productStore = itemView.findViewById(R.id.productStoreText);
            delete = itemView.findViewById(R.id.trashItem);
        }
    }
}
