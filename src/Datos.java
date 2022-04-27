/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jessica
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        informacion info = new informacion  ("Jessica", "Info ", 2 , "tec2");
        //encapsular
        String Numcon = info.getNombre()+""+info.getCarrera()+""+info.getNumsemestre()+""+ info.getEscuela() +"";
        System.out.println("Datos del alumno:" +Numcon);
                
        
    }
    
}
