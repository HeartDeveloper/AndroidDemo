package com.example.zhang.animation_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class HelloActivity extends AppCompatActivity {
    private ListView hellolistview;
    private ArrayAdapter<String>ada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        hellolistview= (ListView) findViewById(R.id.hellolistView);
        String[]data={"初级动画Demo","高级动画Demo"};
        ada=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        hellolistview.setAdapter(ada);

        hellolistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                final String grade=  adapter .dataList.get(position).name ;
                final String grade=  ada.getItem(position);
                if(grade=="初级动画Demo"){
                    Intent intent = new Intent(HelloActivity.this, MainActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putString("name", na);
//                intent.putExtras(bundle);
                    startActivity(intent);
                }if(grade=="高级动画Demo"){
                    Intent intent = new Intent(HelloActivity.this,AdvancedActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putString("name", na);
//                intent.putExtras(bundle);
                    startActivity(intent);
//                    YoYo.with(Techniques.BounceIn).duration(1000).playOn(findViewById(R.layout.activity_advanced));
                }
            }
        });
    }
}
