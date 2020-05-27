package com.company.sms.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreSheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreSheetExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdIsNull() {
            addCriterion("student_course_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdIsNotNull() {
            addCriterion("student_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdEqualTo(Integer value) {
            addCriterion("student_course_id =", value, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdNotEqualTo(Integer value) {
            addCriterion("student_course_id <>", value, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdGreaterThan(Integer value) {
            addCriterion("student_course_id >", value, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_course_id >=", value, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdLessThan(Integer value) {
            addCriterion("student_course_id <", value, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_course_id <=", value, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdIn(List<Integer> values) {
            addCriterion("student_course_id in", values, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdNotIn(List<Integer> values) {
            addCriterion("student_course_id not in", values, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("student_course_id between", value1, value2, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_course_id not between", value1, value2, "studentCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdIsNull() {
            addCriterion("teacher_course_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdIsNotNull() {
            addCriterion("teacher_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdEqualTo(Integer value) {
            addCriterion("teacher_course_id =", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdNotEqualTo(Integer value) {
            addCriterion("teacher_course_id <>", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdGreaterThan(Integer value) {
            addCriterion("teacher_course_id >", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_course_id >=", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdLessThan(Integer value) {
            addCriterion("teacher_course_id <", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_course_id <=", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdIn(List<Integer> values) {
            addCriterion("teacher_course_id in", values, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdNotIn(List<Integer> values) {
            addCriterion("teacher_course_id not in", values, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_course_id between", value1, value2, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_course_id not between", value1, value2, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreIsNull() {
            addCriterion("exercise_score is null");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreIsNotNull() {
            addCriterion("exercise_score is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreEqualTo(Integer value) {
            addCriterion("exercise_score =", value, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreNotEqualTo(Integer value) {
            addCriterion("exercise_score <>", value, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreGreaterThan(Integer value) {
            addCriterion("exercise_score >", value, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("exercise_score >=", value, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreLessThan(Integer value) {
            addCriterion("exercise_score <", value, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreLessThanOrEqualTo(Integer value) {
            addCriterion("exercise_score <=", value, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreIn(List<Integer> values) {
            addCriterion("exercise_score in", values, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreNotIn(List<Integer> values) {
            addCriterion("exercise_score not in", values, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreBetween(Integer value1, Integer value2) {
            addCriterion("exercise_score between", value1, value2, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andExerciseScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("exercise_score not between", value1, value2, "exerciseScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNull() {
            addCriterion("test_score is null");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNotNull() {
            addCriterion("test_score is not null");
            return (Criteria) this;
        }

        public Criteria andTestScoreEqualTo(Integer value) {
            addCriterion("test_score =", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotEqualTo(Integer value) {
            addCriterion("test_score <>", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThan(Integer value) {
            addCriterion("test_score >", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_score >=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThan(Integer value) {
            addCriterion("test_score <", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThanOrEqualTo(Integer value) {
            addCriterion("test_score <=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIn(List<Integer> values) {
            addCriterion("test_score in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotIn(List<Integer> values) {
            addCriterion("test_score not in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreBetween(Integer value1, Integer value2) {
            addCriterion("test_score between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("test_score not between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreIsNull() {
            addCriterion("examination_score is null");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreIsNotNull() {
            addCriterion("examination_score is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreEqualTo(Integer value) {
            addCriterion("examination_score =", value, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreNotEqualTo(Integer value) {
            addCriterion("examination_score <>", value, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreGreaterThan(Integer value) {
            addCriterion("examination_score >", value, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_score >=", value, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreLessThan(Integer value) {
            addCriterion("examination_score <", value, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreLessThanOrEqualTo(Integer value) {
            addCriterion("examination_score <=", value, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreIn(List<Integer> values) {
            addCriterion("examination_score in", values, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreNotIn(List<Integer> values) {
            addCriterion("examination_score not in", values, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreBetween(Integer value1, Integer value2) {
            addCriterion("examination_score between", value1, value2, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andExaminationScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_score not between", value1, value2, "examinationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreIsNull() {
            addCriterion("general_evaluation_score is null");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreIsNotNull() {
            addCriterion("general_evaluation_score is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreEqualTo(Integer value) {
            addCriterion("general_evaluation_score =", value, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreNotEqualTo(Integer value) {
            addCriterion("general_evaluation_score <>", value, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreGreaterThan(Integer value) {
            addCriterion("general_evaluation_score >", value, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("general_evaluation_score >=", value, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreLessThan(Integer value) {
            addCriterion("general_evaluation_score <", value, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreLessThanOrEqualTo(Integer value) {
            addCriterion("general_evaluation_score <=", value, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreIn(List<Integer> values) {
            addCriterion("general_evaluation_score in", values, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreNotIn(List<Integer> values) {
            addCriterion("general_evaluation_score not in", values, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreBetween(Integer value1, Integer value2) {
            addCriterion("general_evaluation_score between", value1, value2, "generalEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluationScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("general_evaluation_score not between", value1, value2, "generalEvaluationScore");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}