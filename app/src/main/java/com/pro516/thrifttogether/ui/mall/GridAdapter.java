package com.pro516.thrifttogether.ui.mall;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pro516.thrifttogether.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;

    public GridAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.grid_recycler_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.LinearViewHolder viewHolder, final int i) {

        viewHolder.textView.setText("优惠券" + i);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(i);
//                Toast.makeText(mContext, "click..." + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
