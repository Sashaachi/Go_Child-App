package com.child.go.go_child;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.child.go.go_child.adapter.CasesAdapter;
import com.child.go.go_child.model.Cases;

import java.util.ArrayList;
import java.util.List;

public class TypesOfCases extends AppCompatActivity {

    private List<Cases> caseList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CasesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_cases);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Type of Cases");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new CasesAdapter(caseList);

        recyclerView.setHasFixedSize(true);

        // vertical RecyclerView
        // keep movie_list_row.xml width to `match_parent`
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        // horizontal RecyclerView
        // keep movie_list_row.xml width to `wrap_content`
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(mLayoutManager);

        // adding inbuilt divider line
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        // adding custom divider line with padding 16dp
        // recyclerView.addItemDecoration(new MyDividerItemDecoration(this, LinearLayoutManager.HORIZONTAL, 16));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(mAdapter);

        // row click listener
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Cases cases = caseList.get(position);
//                Toast.makeText(getApplicationContext(), cases.getCaseName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();
    }

    /**
     * Prepares sample data to provide data set to adapter
     */
    private void prepareMovieData() {
        Cases cases = new Cases("Sexual Abuse", "Action & Adventure");
        caseList.add(cases);

        cases = new Cases("Physical abuse", "Action & Adventure");
        caseList.add(cases);

        cases = new Cases("Sodomization", "Action & Adventure");
        caseList.add(cases);

        cases = new Cases("Rape", "Action & Adventure");
        caseList.add(cases);

        cases = new Cases("Kidnap", "Action & Adventure");
        caseList.add(cases);

        cases = new Cases("Child labor", "Action & Adventure");
        caseList.add(cases);

        cases = new Cases("Early marriages", "Action & Adventure");
        caseList.add(cases);


        // notify adapter about data set changes
        // so that it will render the list with new data
        mAdapter.notifyDataSetChanged();
    }

}