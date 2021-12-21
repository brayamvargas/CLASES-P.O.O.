
/**
 * Write a description of class persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class persona{
    private String nombre;
    private int edad;
    private int numeroCelular;
    public persona(String nom, int eda, int nume){
       nombre= nom;
       edad= eda;
       numeroCelular= nume;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombresito){
        nombre= nombresito;
    }
    
    public int getnumeroCelular(){
        return numeroCelular;
    }
    
    public void setnumeroCelular(int otroNumero){
        numeroCelular= otroNumero;
    }
}