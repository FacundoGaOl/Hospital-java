package org.hospital;

public class Student extends MedicalStaff{
    private String course;
    private String study;

    public Student(String name, String workShift, String mealShift, String course, String study) {
        super(name, workShift, mealShift);
        this.course = course;
        this.study = study;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    @Override
    public String description() {
        return "MÉDICO ESTUDIANTE: " + getName() +
                "\n > Nivel: " + course + " | Horas de estudio/semana: " + study +
                "\n > Turno de prácticas: " + getWorkShift();
    }
}
