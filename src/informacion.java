/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica
 */
public class informacion {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        String nombre;
        String carrera;
        int Numsemestre;

    public informacion(String nombre, String carrera, int Numsemestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.Numsemestre = Numsemestre;
        
        
    }

    public String getNombre() {
        return " el nombre del alumno es: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return  "La carrera del alumno es: "+ carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumsemestre() {
        return "El semestre que cursa es: "+ Numsemestre;
    }

    public void setNumsemestre(int Numsemestre) {
        this.Numsemestre = Numsemestre;
    }
        
        
    

    
  

   
    }
    
    
    

