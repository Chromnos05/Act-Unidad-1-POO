/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Oscar Mercado
 */
public class Hospital {
    
    /*VARIABLES*/
    private String Hospital_Name;
    private String Hospital_Ubication;
    private double Beds_number;
    
    private List<Paciente> pacientes;
    private List<Doctor> doctor_list;

    
    public List<Paciente> getPacientes() {    
        return pacientes;
    }

    /*GETTERS Y SETTERS*/
    public void setPacientes(List<Paciente> pacientes) {    
        this.pacientes = pacientes;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String Hospital_Name) {
        this.Hospital_Name = Hospital_Name;
    }

    public String getHospital_Ubication() {
        return Hospital_Ubication;
    }

    public void setHospital_Ubication(String Hospital_Ubication) {
        this.Hospital_Ubication = Hospital_Ubication;
    }

    public double getBeds_number() {
        return Beds_number;
    }

    public void setBeds_number(double Beds_number) {
        this.Beds_number = Beds_number;
    }

    public List<Doctor> getDoctor_list() {
        return doctor_list;
    }

    public void setDoctor_list(List<Doctor> doctor_list) {
        this.doctor_list = doctor_list;
    }
    /*FIN DE GETTERS Y SETTERS*/
    
    /*CONSTRUCTOR FOR DEFECTO*/
    public Hospital(String Hospital_Name, String Hospital_Ubication, double Beds_number, List<Paciente> pacientes, List<Doctor> doctor_list) {
        this.Hospital_Name = Hospital_Name;
        this.Hospital_Ubication = Hospital_Ubication;
        this.Beds_number = Beds_number;
        this.pacientes = pacientes;
        this.doctor_list = doctor_list;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Hospital() {
    }
    
    
    @Override
    public String toString() {
        return "Hospital: " + Hospital_Name + "\nUbicacion: " + Hospital_Ubication + "\nNumero de camas: " + Beds_number;
    }
    
}
