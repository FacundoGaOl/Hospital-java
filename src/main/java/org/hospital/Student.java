package org.hospital;

public class Student extends MedicalStaff{
    private String course;
    private String Study;

    public Student(String name, String workShift, String mealShift, String course, String study) {
        super(name, workShift, mealShift);
        this.course = course;
        Study = study;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudy() {
        return Study;
    }

    public void setStudy(String study) {
        Study = study;
    }
}
