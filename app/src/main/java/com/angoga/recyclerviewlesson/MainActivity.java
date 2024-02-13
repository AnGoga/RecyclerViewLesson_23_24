package com.angoga.recyclerviewlesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.angoga.recyclerviewlesson.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private DataAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        initData();
        initView();
        setContentView(binding.getRoot());
    }

    private void initData() {
        data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(new Data(i));
        }
    }

    private void initView() {
        initRecyclerView();
    }

    private void initRecyclerView() {
        adapter = new DataAdapter(data);
        layoutManager = new LinearLayoutManager(this);

        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}