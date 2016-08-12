package com.example.zhang.animation_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listview= (ListView) findViewById(R.id.listView1);

        List<String>list=new ArrayList<String>();
        for(int i=0;i<20;i++){
            list.add("星期"+i);
        }
        ArrayAdapter<String>adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);
//        LayoutAnimationController lac=new LayoutAnimationController.AnimationParameters(AnimationUtils.loadAnimation(this,));
    }
}
