package com.example.sardor.todolist;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.sardor.todolist.Module.Suplier;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    EditText title, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        setContentView(R.layout.activity_main);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        final Suplier suplier = new Suplier();
        RecyclerView recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        AdapterNigga adapterNigga = new AdapterNigga(this, suplier.infos);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterNigga);

        title = findViewById(R.id.title);
        info = findViewById(R.id.info);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!title.getText().toString().isEmpty() && !info.getText().toString().isEmpty()){
                    suplier.infos.add(new Info(title.getText().toString(), info.getText().toString()));
                }
                else
                    Toast.makeText(MainActivity.this, "Please fill the lines", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
