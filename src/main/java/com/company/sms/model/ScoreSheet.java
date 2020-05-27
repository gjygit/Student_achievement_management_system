package com.company.sms.model;

import java.io.Serializable;

public class ScoreSheet implements Serializable {
    private Integer id;

    private Integer studentCourseId;

    private Integer teacherCourseId;

    private Integer exerciseScore;

    private Integer testScore;

    private Integer examinationScore;

    private Integer generalEvaluationScore;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentCourseId() {
        return studentCourseId;
    }

    public void setStudentCourseId(Integer studentCourseId) {
        this.studentCourseId = studentCourseId;
    }

    public Integer getTeacherCourseId() {
        return teacherCourseId;
    }

    public void setTeacherCourseId(Integer teacherCourseId) {
        this.teacherCourseId = teacherCourseId;
    }

    public Integer getExerciseScore() {
        return exerciseScore;
    }

    public void setExerciseScore(Integer exerciseScore) {
        this.exerciseScore = exerciseScore;
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    public Integer getExaminationScore() {
        return examinationScore;
    }

    public void setExaminationScore(Integer examinationScore) {
        this.examinationScore = examinationScore;
    }

    public Integer getGeneralEvaluationScore() {
        return generalEvaluationScore;
    }

    public void setGeneralEvaluationScore(Integer generalEvaluationScore) {
        this.generalEvaluationScore = generalEvaluationScore;
    }
}