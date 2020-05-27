package com.company.sms.model;

import java.io.Serializable;

public class TeacherCourse implements Serializable {
    private Integer teacherCourseId;

    private Integer teacherId;

    private Integer courseId;

    private static final long serialVersionUID = 1L;

    public Integer getTeacherCourseId() {
        return teacherCourseId;
    }

    public void setTeacherCourseId(Integer teacherCourseId) {
        this.teacherCourseId = teacherCourseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}