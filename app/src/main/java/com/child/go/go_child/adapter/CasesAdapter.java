package com.child.go.go_child.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.child.go.go_child.R;
import com.child.go.go_child.model.Cases;

import java.util.List;

/**
 * Created by sefu on 4/19/18.
 */

public class CasesAdapter extends RecyclerView.Adapter<CasesAdapter.MyViewHolder> {

    private List<Cases> caseList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView caseName, caseDescription;

        public MyViewHolder(View view) {
            super(view);
            caseName = (TextView) view.findViewById(R.id.caseName);
            caseDescription = (TextView) view.findViewById(R.id.caseDescription);
        }
    }


    public CasesAdapter(List<Cases> caseList) {
        this.caseList = caseList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.case_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Cases cases = caseList.get(position);
        holder.caseName.setText(cases.getCaseName());
       // holder.caseDescription.setText(cases.getCaseDescription());
    }

    @Override
    public int getItemCount() {
        return caseList.size();
    }
}