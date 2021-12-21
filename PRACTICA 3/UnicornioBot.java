
public class UnicornioBot{
    private String usuario;
    public UnicornioBot(String usu){
        usuario = usu;
    }
    
    public  String getsaludar(){
       String saludo = "hola "+usuario;
       return saludo; 
    }
    
    public void setNombreUsuario(String otro){
        usuario = otro;
    }
}
