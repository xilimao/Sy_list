package com.example.sxhs.sy_list;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ListView listView;
    private ArrayList<Xinxi> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Xinxi> xinxis = new ArrayList<>();
        xinxis.add(new Xinxi(R.mipmap.ic_launcher,"fsfsdf","fsdfsdfsd"));
        xinxis.add(new Xinxi(R.mipmap.ic_launcher,"fdee","yjn"));
        xinxis.add(new Xinxi(R.mipmap.ic_launcher,"vgrh","nnnn"));
        xinxis.add(new Xinxi(R.mipmap.ic_launcher,"rrrr","yyyy"));
        xinxis.add(new Xinxi(R.mipmap.ic_launcher,"vvvv","btrb"));
        xinxis.add(new Xinxi(R.mipmap.ic_launcher,"fseeeefsdf","vvdvsd"));

        //声明适配器
        Sy_list_adapter adapter = new Sy_list_adapter(xinxis,this);

        //获取listview
        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
