package com.example.b2_spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner scope;
    private Spinner hero;
    private TextView t_rank,t_hero;
    private ImageView m_hero;

    private ArrayList<HeroBean> mData = null;//存放英雄的名字和图片的实体类数组
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        scope=findViewById(R.id.spinner_rank);//段位的spinner
        hero=findViewById(R.id.spinner_hero);//英雄的spinner
        t_hero=findViewById(R.id.hero);//拿手英雄文本框
        t_rank=findViewById(R.id.rank);//段位文本框
        m_hero=findViewById(R.id.im_hero);//英雄图片

        mData=new ArrayList<HeroBean>();//AL类

        mData.add(new HeroBean(R.drawable.de,"孙悟空"));
        mData.add(new HeroBean(R.drawable.de,"紫霞仙子"));
        mData.add(new HeroBean(R.drawable.de,"貂蝉"));
        mData.add(new HeroBean(R.drawable.de,"韩信"));
        mData.add(new HeroBean(R.drawable.de,"马超"));
        mData.add(new HeroBean(R.drawable.de,"百里玄策"));

        MyAdapter adapter = new MyAdapter(mData, this);//实例化适配器,this指的是当前的Activity

        hero.setPrompt("请选择英雄");
        hero.setAdapter(adapter);//给hero设置适配器，拿手英雄下面的那个列表

        //给选择段位的spinner添加监听
        scope.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                t_rank.setText(scope.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //给选择英雄的spinner添加监听
        hero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override //选中的时候执行的方法
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, mData.get(i).getName(), Toast.LENGTH_SHORT).show();
                t_hero.setText(mData.get(i).getName());//给TextView设置上选择的英雄名字
                m_hero.setImageResource(mData.get(i).getIcon());//给Imageview上选择的英雄图片
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
