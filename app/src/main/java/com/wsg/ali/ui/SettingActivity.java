package com.wsg.ali.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.wsg.ali.R;
import com.wsg.ali.adapter.ListAdapter;

import java.util.ArrayList;

/*
 *  项目名：  TallyBook
 *  包名：    com.wsg.ali.ui
 *  文件名:   SettingActivity
 *  创建者:   LiuGuiLinAndroid
 *  创建时间:  2017/3/26 19:57
 *  描述：    设置
 */
public class SettingActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<String> mList = new ArrayList<>();
    private ListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("设置");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getSupportActionBar().setElevation(0);
        }

        initView();

    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.mListView);

        mList.add("作者:蓝莲花WSG");
        mList.add("如有建议请联系QQ：1516961816");
        mList.add("博客:http://my.csdn.net/qq_29375837");
        mList.add("GitHub:https://github.com/stevenwsg");
        mList.add("学习自刘桂林：GitHub:https://github.com/LiuGuiLinAndroid/SimpleProject/tree/master/TallyBook");

        mAdapter = new ListAdapter(this, mList);
        mListView.setAdapter(mAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
