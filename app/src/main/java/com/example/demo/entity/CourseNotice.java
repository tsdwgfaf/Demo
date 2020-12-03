package com.example.demo.entity;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CourseNotice {

    private final String content; //通知内容
    private final String author; //通知发布人
    private final LocalDateTime dateTime; //发布通知的时间

    @RequiresApi(api = Build.VERSION_CODES.O)
    public CourseNotice(String content, String author) {
        this.content = content;
        this.author = author;
        this.dateTime = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return this.dateTime.format(dateTimeFormatter);
    }
}
