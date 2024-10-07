
import Clases.Doctor;
import Clases.Hospital;
import Clases.Paciente;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Crear un hospital
        Hospital hospital = new Hospital("Hospital Central", "Calle de prueba", 100, new ArrayList<>(), new ArrayList<>());

        //Crear un doctor
        Doctor doctor = new Doctor("Hospital Central", "Calle de prueba", 100, hospital, new ArrayList<>());
        
        //Crear un paciente
        Paciente paciente = new Paciente("Juan Perez", "30", "Gripe", doctor, hospital);
        
        // Agregar paciente al hospital y al doctor
        hospital.getPacientes().add(paciente);
        doctor.getPacient().add(paciente);
        
        //Mostrar datos del paciente
        mostrarDatosPaciente(paciente);
    }
    
    public static void mostrarDatosPaciente(Paciente paciente) {
        System.out.println(paciente);
        System.out.println(paciente.getDoctor());
        System.out.println(paciente.getHospital());
    }
        
}
    
