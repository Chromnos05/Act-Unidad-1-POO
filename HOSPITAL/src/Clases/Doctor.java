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
public class Doctor {
    
    /*VARIABLES*/
    private String Hospital_Name;
    private String Hospital_Ubication;
    private double Beds_number;

    private Hospital doc;
    private List<Paciente> pacient;
    
    /*GETTES Y SETTERS*/
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

    public Hospital getDoc() {
        return doc;
    }

    public void setDoc(Hospital doc) {
        this.doc = doc;
    }

    public List<Paciente> getPacient() {
        return pacient;
    }

    public void setPacient(List<Paciente> pacient) {
        this.pacient = pacient;
    }
    /*FIN DE GETTERS Y SETTERS*/

    /*CONSTRUCTOR POR DEFECTO*/
    public Doctor(String Hospital_Name, String Hospital_Ubication, double Beds_number, Hospital doc, List<Paciente> pacient) {
        this.Hospital_Name = Hospital_Name;
        this.Hospital_Ubication = Hospital_Ubication;
        this.Beds_number = Beds_number;
        this.doc = doc;
        this.pacient = pacient;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Doctor() {
    }

    
    
    
}
