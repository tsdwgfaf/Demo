package com.example.demo.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.demo.R;

public class TitleItemView extends LinearLayout {

    public TitleItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.item_title, this);
        Button titleBack = (Button) findViewById(R.id.titleBack);
        Button titleEdit = (Button) findViewById(R.id.titleEdit);
        titleBack.setOnClickListener(new OnClickListener() { //点击back关闭当前Activity
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });
    }


}
