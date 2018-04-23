package com.child.go.go_child.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.child.go.go_child.R;
import com.child.go.go_child.model.Cases;
import com.child.go.go_child.model.Lawyer;

import java.util.List;

/**
 * Created by sefu on 4/19/18.
 */

public class LawyerAdapter extends RecyclerView.Adapter<LawyerAdapter.MyViewHolder> {

    private List<Lawyer> lawyerList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView caseName, caseDescription;

        public MyViewHolder(View view) {
            super(view);
            caseName = (TextView) view.findViewById(R.id.lawyerName);
         }
    }


    public LawyerAdapter(List<Lawyer> lawyerList) {
        this.lawyerList = lawyerList;
    }

    @Override
    public LawyerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lawyer_list_row, parent, false);

        return new LawyerAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LawyerAdapter.MyViewHolder holder, int position) {
        Lawyer lawyer = lawyerList.get(position);
        holder.caseName.setText(lawyer.getLawyerName());
        // holder.caseDescription.setText(cases.getCaseDescription());
    }

    @Override
    public int getItemCount() {
        return lawyerList.size();
    }
}