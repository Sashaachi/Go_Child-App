package com.child.go.go_child;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.child.go.go_child.adapter.InfoAdapter;
import com.child.go.go_child.adapter.LawyerAdapter;
import com.child.go.go_child.model.*;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class BookALawyer extends AppCompatActivity {

    private List<Lawyer> lawyerList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LawyerAdapter mAdapter;

    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_alawyer);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("More Info");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new LawyerAdapter(lawyerList);

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
               Lawyer lawyer = lawyerList.get(position);
 Toast.makeText(getApplicationContext(), "Request sent to "+lawyer.getLawyerName() + " will handle your case", Toast.LENGTH_SHORT).show();
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
        Lawyer  lawyer = new Lawyer("Santurina Karimi");
        lawyerList.add(lawyer);

        lawyer = new Lawyer("Eunice Mutai");
        lawyerList.add(lawyer);

        lawyer = new Lawyer("Grace Maina");
        lawyerList.add(lawyer);

        lawyer = new Lawyer("Florah Njoroge");
        lawyerList.add(lawyer);

        lawyer = new Lawyer("Keren Mwangi");
        lawyerList.add(lawyer);

        lawyer = new Lawyer("Sasha Achieng’");
        lawyerList.add(lawyer);





        // notify adapter about data set changes
        // so that it will render the list with new data
        mAdapter.notifyDataSetChanged();
    }

}