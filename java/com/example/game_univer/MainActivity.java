package com.example.game_univer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecycleView;
    Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycleView = findViewById(R.id.rc);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));

       myAdapter = new Adapter(this, getMyList());
       mRecycleView.setAdapter(myAdapter);

    }

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Загадки");
        m.setDescription("This is my recycleview....");
        m.setImg(R.drawable.icons);
        models.add(m);

        m = new Model();
        m.setTitle("Вопрос. Ответ");
        m.setDescription("This is my recycleview....");
        m.setImg(R.drawable.icons3);
        models.add(m);

        m = new Model();
        m.setTitle("Логика");
        m.setDescription("This is my recycleview....");
        m.setImg(R.drawable.icons8);
        models.add(m);

        return models;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("Главная");
        menu.add("Правила");
        menu.add("Подробнее");

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG).show();

        return super.onOptionsItemSelected(item);
    }

}
