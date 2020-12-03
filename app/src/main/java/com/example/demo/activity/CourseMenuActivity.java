package com.example.demo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.R;

public class CourseMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_menu);
        //隐藏系统自带的标题栏
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }
    }

    public void toCourseFileView(View view) {
        Intent intent = new Intent(this, CourseFileActivity.class);
        startActivity(intent);
    }

    public void toCourseNoticeView(View view) {
        Intent intent = new Intent(this, CourseNoticeActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        ((Activity) view.getContext()).finish();
    }
}