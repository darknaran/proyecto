
public class Pan
{
  private final String nombre;
  
  double calcularpromedio(){
        return 0;
    }
  
  public String getNombre(){
      return nombre;
  }
  public Pan(String nombre){
        if(nombre != null)this.nombre = nombre;
        else this.nombre = "";    
    }
}
