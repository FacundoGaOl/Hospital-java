package org.hospital;

public class AmbulancePatient extends Patient implements InOutHospital{
    private String dateSurgery;
    private String rehabilitation;

    public AmbulancePatient(String name, String admissionDate, int room, String treatment, String dischargeDate, String dateSurgery, String rehabilitation) {
        super(name, admissionDate, room, treatment, dischargeDate);
        this.dateSurgery = dateSurgery;
        this.rehabilitation = rehabilitation;
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

    @Override
    public String description() {
        return "PACIENTE DE AMBULANCIA: " + getName() +
                "\n > ESTADO CRÍTICO | Habitación: " + getRoom() +
                "\n > Cirugía realizada: " + dateSurgery +
                "\n > Plan de rehabilitación: " + rehabilitation +
                "\n > Alta prevista: " + getDischargeDate();
    }
}
