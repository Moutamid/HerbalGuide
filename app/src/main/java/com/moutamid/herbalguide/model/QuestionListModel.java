package com.moutamid.herbalguide.model;

public class QuestionListModel {

    private String question;
    private String point1;
    private String point2;
    private String point3;
    private String point4;

    public QuestionListModel(){

    }

    public QuestionListModel(String question, String point1) {
        this.question = question;
        this.point1 = point1;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPoint1() {
        return point1;
    }

    public void setPoint1(String point1) {
        this.point1 = point1;
    }

    public String getPoint2() {
        return point2;
    }

    public void setPoint2(String point2) {
        this.point2 = point2;
    }

    public String getPoint3() {
        return point3;
    }

    public void setPoint3(String point3) {
        this.point3 = point3;
    }

    public String getPoint4() {
        return point4;
    }

    public void setPoint4(String point4) {
        this.point4 = point4;
    }
}
