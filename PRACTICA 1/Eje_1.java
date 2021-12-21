
public class Eje_1{
   public String hallarVortice(int []arr){
       String res ="el vortice esta formado por los numeros";
       int nummayor= arr[0];
       int nummenor= arr[0];
       int posmayor=0;
       int posmenor=0;
       
       for(int i=1;i<arr.length;i++){
           int actual= arr[i];
           if(actual > nummayor){
               nummayor = actual;
               posmayor =i;
            }else{
               if(actual < nummenor){
                   nummenor = actual;
                   posmenor = i;
                }
            }
        }
        int posInicial= Math.min(posmayor,posmenor);
        int posFinal = Math.max(posmayor,posmenor);
        for(int i= posInicial; i<=posFinal; i++){
            int actual= arr[i];
            res = res+" "+actual; 
        }
        return res;
    }
    
}
