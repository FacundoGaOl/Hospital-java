package org.hospital;

public abstract class Patient extends Character implements AboutPatients, InOutHospital{
    private String admissionDate;
    private int room;
    private String treatment;
    private String dischargeDate;

    public Patient(String name, String admissionDate, int room, String treatment, String dischargeDate) {
        super(name);
        this.admissionDate = admissionDate;
        this.room = room;
        this.treatment = treatment;
        this.dischargeDate = dischargeDate;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
}
