
public class EJE_1{
    public int distancia(String num1,  String num2){
        int res=0;
        //char caracter ="";
        String va1=num1; 
        String val2=num2;

        for(int i=0;i<num1.length();i++){
            char actual= num1.charAt(i);
            int valnumerico=(int)actual;
            for(int j=0;j<num2.length();j++){
                char actualiti=num2.charAt(j);
                int valnumero=(int)actualiti;
                res=valnumerico - valnumero;
                System.out.println("La distancia sentimental es "+res);
            }
        }
        return res;
    }

}
