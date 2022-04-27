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
     
     */
    
        // TODO code application logic here
        String nombre;
        String carrera;
        int Numsemestre;
        String Escuela;

    public informacion(String nombre, String carrera, int Numsemestre, String Escuela) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.Numsemestre = Numsemestre;
       this.Escuela = Escuela;
        
        
    }

    public String getEscuela() {
        return "La institucion a la que pertenece es: " + Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
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
        return "El semestre que cursa es: "  + Numsemestre;
    }

    public void setNumsemestre(int Numsemestre) {
        this.Numsemestre = Numsemestre;
    }
        
        
    

    
  

   
    }
    
    
    

