
public class Eje_5{
    public int [] horas( int valor, int tamanio){
        int [] arr = new int [tamanio];
        arr[0]= valor;//valor que le ingresamos
        int num = 1; //crar valor para poder aumentar
        for(int i=0; i<arr.length-1; i++){
            int actual = arr[i]; 
            if(actual%2 ==0){ //pregunatar si es par 
                actual = actual/2; 
            }else{
               actual = actual + num; 
               num++;
            }
            arr[i+1]=actual; //devolver resultado
        }
        return arr;
    }
}