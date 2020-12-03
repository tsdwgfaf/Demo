package com.example.demo.entity;

public class CourseInfo {

    private final String courseName; //课程名
    private final String teacherName; //教师
    private final String courseTime; //上课时间
    private final String classroom; //上课地点
    private final String remark; //备注（可选项）

    public CourseInfo(String courseName, String teacherName, String courseTime, String coursePosition) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseTime = courseTime;
        this.classroom = coursePosition;
        this.remark = "空";
    }

    public CourseInfo(String courseName, String teacherName, String courseTime, String coursePosition, String remark) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseTime = courseTime;
        this.classroom = coursePosition;
        this.remark = remark;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getRemark() {
        return remark;
    }
}
