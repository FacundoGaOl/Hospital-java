package org.hospital;

public abstract class MedicalStaff extends Character implements Workable{
    private String workShift;
    private String mealShift;

    public MedicalStaff(String name, String workShift, String mealShift) {
        super(name);
        this.workShift = workShift;
        this.mealShift = mealShift;
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    public String getMealShift() {
        return mealShift;
    }

    public void setMealShift(String mealShift) {
        this.mealShift = mealShift;
    }

    @Override
    public void workSchedule(int hours) {

    }

    @Override
    public void eat() {

    }
    public abstract String description();
}
