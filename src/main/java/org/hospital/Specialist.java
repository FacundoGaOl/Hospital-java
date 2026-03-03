package org.hospital;

public class Specialist extends MedicalStaff {
    private String holidays;
    private String medicalSpecialty;

    public Specialist(String name,String workShift, String mealShift, String holidays, String medicalSpecialty) {
        super(name,workShift,mealShift);
        this.holidays = holidays;
        this.medicalSpecialty = medicalSpecialty;
    }

    public String getHolidays() {
        return holidays;
    }

    public void setHolidays(String holidays) {
        this.holidays = holidays;
    }

    public String getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public void setMedicalSpecialty(String medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;
    }
}
