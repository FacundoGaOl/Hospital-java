package org.hospital;

import org.hospital.AmbulancePatient;
import org.hospital.AppoinmentPatient;
import org.hospital.Specialist;
import org.hospital.Student;

public class Main {
    static void main() {
        Character alberto = new AppoinmentPatient ("Alfredo Diaz", "2026-03-01", 101,"Rest and Water","2026-03-05", "2026-03-05", "Nurse Joy");
        Character javier = new  AppoinmentPatient ("Javier Longueira", "2026-03-02", 105, "2026-03-04", "Vitamin B12", "Follow-up", "Nurse Ratched");

        Character david = new AmbulancePatient ("David Alvarez", "2026-03-03", 304, "2026-03-20", "Antibiotics", "Leg Surgery", "Physical Therapy");
        Character daniel = new AmbulancePatient ("Daniel Vallejo", "2026-03-03", 206, "Pending", "Painkillers", "Shoulder Surgery", "Restricted Movement");

        Character dorian = new Specialist("Dorian Gray", "14:00 - 15:00", "Day Shift", "30", "Diagnostic Medicine");
        Character vlad = new Specialist("Vlad Tepes", "13:00 - 14:00", "Night Shift", "25", "General Surgery");

        Character alex = new Student("Alex Sanchez", "12:00 - 13:00", "Rotation Shift", "4th Year", "20");
        Character ana = new Student("Ana Dominguez", "12:30 - 13:30", "Rotation Shift", "3rd Year", "25");

    Character[] Characters = {alberto, javier, david, daniel,vlad, dorian, alex, ana};

    for (Character person : Characters) {
        System.out.println(person.description());
    }
    }
}
