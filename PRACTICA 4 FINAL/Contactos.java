import java.util.Arrays;
public class Contactos{
    private persona [] amigos;
    
    public Contactos (int tamanio){
        amigos = new persona[tamanio];
    }

    public boolean  agregarAmigos(persona num){
        boolean res =false;
        for(int i =0; i<amigos.length && res == false; i++){
            if(amigos[i]==null){
                amigos[i]=num;
                res= true;   
            }
        }
        return res;

    }
    
    public int [] BuacadorAmigo(int buscado, int[]arr){
     Arrays.sort(arr);
     int res = Arrays.binarySearch(arr,buscado);
     return arr;
    }
    
    public String [] buscadorAmigo(String buscando,String []arr){
        Arrays.sort(arr);
        return arr;
    }
    
    public int [] ordenamiento(int[]arr){
     Arrays.sort(arr);
     return arr;
    }
       
    public String enviarMensaje(int nume, String mensaje){
        String res="";
        res= mensaje+ nume;
        return res;
    }
    
    public String mensajesResividos(){
        return "el mensaje fue envido";
    }

} 
