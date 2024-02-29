
package com.example.recyclerprec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kitchen.R;
import com.example.kitchen.databinding.ActivityMainBinding;
import com.example.recyclerprec.Adapter.CarAdapter;
import com.example.recyclerprec.Adapter.Model;
import com.example.recyclerprec.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    String[] name = {"BMW","Audi","Ferrari"};

    Integer[] lemp = {R.drawable.light, R.drawable.light1,R.drawable.light2,R.drawable.light3};
    String[] price ={"100000","200000","300000"};


    ArrayList<Model> model = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        for (int i=0;i<name.length;i++){

            Model m1 = new Model(name[i],price[i],lemp[i]);
            model.add(m1);

        }
        CarAdapter carAdapter = new CarAdapter(this,model);
        binding.rec1.setAdapter(carAdapter);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        binding.rec1.setLayoutManager(lm);

    }
}



