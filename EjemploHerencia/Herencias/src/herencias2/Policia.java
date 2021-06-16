/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author D E L L
 */
public class Policia extends Persona{
    
    private String rango;

    public Policia (String n, String a, int e, String rang){
       super (n,a,e); 
       setRango(rang);
    }
       public void setRango(String rang){
           rango = rang;
       }
       public String getRango(){
           return rango;
       }
       
    @Override
       public String toString(){
           return String.format("%s -Rango: %s", super.toString()
                   ,getRango());    
       }
    }
