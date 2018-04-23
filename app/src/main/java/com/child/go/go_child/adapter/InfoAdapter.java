package com.child.go.go_child.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.child.go.go_child.R;
import com.child.go.go_child.model.Cases;
import com.child.go.go_child.model.Info;

import java.util.List;

/**
 * Created by sefu on 4/19/18.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.MyViewHolder> {

    private List<Info> infoList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView infoTitle;

        public MyViewHolder(View view) {
            super(view);
            infoTitle = (TextView) view.findViewById(R.id.infoTitle);
        }
    }


    public InfoAdapter(List<Info> infoList) {
        this.infoList = infoList;
    }

    @Override
    public InfoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.info_list_row, parent, false);

        return new InfoAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(InfoAdapter.MyViewHolder holder, int position) {
        Info info = infoList.get(position);
        holder.infoTitle.setText(info.getInfoTitle());
    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }
}