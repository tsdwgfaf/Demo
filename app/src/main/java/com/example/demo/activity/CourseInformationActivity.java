package com.example.demo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.R;
import com.example.demo.entity.CourseInfo;

public class CourseInformationActivity extends AppCompatActivity {

    private CourseInfo courseInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_infomation);

        initInfo();
        //设置显示内容
        ((TextView) findViewById(R.id.textCourseName)).setText(this.courseInfo.getCourseName());
        ((TextView) findViewById(R.id.textTeacherName)).setText(this.courseInfo.getTeacherName());
        ((TextView) findViewById(R.id.textClassRoom)).setText(this.courseInfo.getClassroom());
        ((TextView) findViewById(R.id.textCourseTime)).setText(this.courseInfo.getCourseTime());
        ((TextView) findViewById(R.id.textCourseRemark)).setText(this.courseInfo.getRemark());

        //隐藏系统自带的标题栏
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }
    }

    public void back(View view) {
        this.finish();
    }

    private void initInfo() {
        this.courseInfo = new CourseInfo(
                "数据结构",
                "XXXXXX",
                "[2-15周]周一12节、周三12节",
                "正心716",
                "先导课程：C语言程序设计"
        );
    }
}