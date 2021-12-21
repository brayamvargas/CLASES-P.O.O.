
public class CajaRegistradora{
    private double total;
    public CajaRegistradora(){
       total =0; 
    }
    public void agregaCosto(double precio, int cantidad){
        total = total +(precio*cantidad);
    }
    public String indicarPrecioApagar(){
        return "Error: El dinero indicado no cubre la compra: "+total+" bs";
    }
    public String Pagar(double monto){
        String res ="";
        
        if(monto<total){
            res="el monto no cubre la cantidas a pagar";
        }else{
            double cambio = monto-total;
            res="Cobro exitoso, el cambio a devolver es: "+cambio+" bs";
            total =0;
        }
        return res;
        
    }
}
