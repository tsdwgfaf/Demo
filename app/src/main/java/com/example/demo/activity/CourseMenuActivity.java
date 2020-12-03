package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.R;

public class CourseMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_menu);
    }

    public void toCourseFileView(View view) {
        Intent intent = new Intent(this, CourseFileActivity.class);
        startActivity(intent);
    }
}