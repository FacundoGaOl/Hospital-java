package org.hospital;

public class AppoinmentPatient extends Patient{
    private String appointment;
    private String nurseControl;

    public AppoinmentPatient(String name, String admissionDate, int room, String treatment, String dischargeDate, String appointment, String nurseControl) {
        super(name, admissionDate, room, treatment, dischargeDate);
        this.appointment = appointment;
        this.nurseControl = nurseControl;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getNurseControl() {
        return nurseControl;
    }

    public void setNurseControl(String nurseControl) {
        this.nurseControl = nurseControl;
    }

    @Override
    public void actualTreatment() {

    }

    @Override
    public void medicalAdmission() {

    }

    @Override
    public void medicalDischarge() {

    }

    @Override
    public void giveRoom() {

    }
}
