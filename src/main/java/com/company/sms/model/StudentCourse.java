package com.company.sms.model;

import java.io.Serializable;

public class StudentCourse implements Serializable {
    private Integer studentCourseId;

    private Integer studentId;

    private Integer courseId;

    private static final long serialVersionUID = 1L;

    public Integer getStudentCourseId() {
        return studentCourseId;
    }

    public void setStudentCourseId(Integer studentCourseId) {
        this.studentCourseId = studentCourseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}