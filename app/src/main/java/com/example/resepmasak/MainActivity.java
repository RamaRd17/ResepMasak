package com.example.resepmasak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<ResepMasak> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(ResepData.getListData());
        showRecyclerGrid();
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        ListResepAdapter ListResepAdapter = new ListResepAdapter(this);
        ListResepAdapter.setListResep(list);
        rvCategory.setAdapter(ListResepAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedResep(list.get(position));
            }
        });
    }
    private void showSelectedResep(ResepMasak resep){
        Toast.makeText(this, "Kamu memilih "+resep.getName(), Toast.LENGTH_LONG).show();

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("nama", resep.getName());
        intent.putExtra("remark", resep.getRemarks());
        intent.putExtra("photo", resep.getPhoto());
        startActivity(intent);
    }
}
