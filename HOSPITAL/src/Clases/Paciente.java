/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Oscar Mercado
 */
public class Paciente {
    
    /*VARIABLES*/
    private Paciente Name;
    private String Age;
    private String Diagnostic;
    
    private Doctor doctor;
    private Hospital hospital;
    
    /*GETTERS Y SETTERS*/
    public Paciente getName() {
        return Name;
    }

    public void setName(Paciente Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }

    public void setDiagnostic(String Diagnostic) {
        this.Diagnostic = Diagnostic;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    /*FIN DE GETTERS Y SETTERS*/
    
    /*CONSTRUCTOR POR DEFECTO*/
    public Paciente(Paciente Name, String Age, String Diagnostic, Doctor doctor, Hospital hospital) {
        this.Name = Name;
        this.Age = Age;
        this.Diagnostic = Diagnostic;
        this.doctor = doctor;
        this.hospital = hospital;
    }

    /*CONSTRUCTOR VACIO*/
    public Paciente() {
    }
    
    
}
