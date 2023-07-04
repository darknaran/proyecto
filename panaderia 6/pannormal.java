
public class pannormal extends Pan
{
  private double ventauno;
  private double ventados;
  private double ventatres;
  private double ventacuatro;
  private double ventacinco;
  private double ventaseis;
  private double ventasiete;
  public double getventauno(){
    return ventauno;
    }
  public void setVentauno(double ventauno){
        if(ventauno >= 0)this.ventauno = ventauno;
        else this.ventauno = 0;
    } 
    
  public double getventados(){
    return ventados;
    }
  public void setVentados(double ventados){
        if(ventados >= 0)this.ventados = ventados;
        else this.ventados = 0;
    }
    
  public double getventatres(){
    return ventatres;
    }
  public void setVentatres(double ventatres){
        if(ventatres >= 0)this.ventatres = ventatres;
        else this.ventatres = 0;
    }
  
  public double getventacuatro(){
    return ventacuatro;
    }
  public void setVentacuatro(double ventacuatro){
        if(ventacuatro >= 0)this.ventacuatro = ventacuatro;
        else this.ventacuatro = 0;
    }
    
  public double getventacinco(){
    return ventacinco;
    }
  public void setVentacinco(double ventacinco){
        if(ventacinco >= 0)this.ventacinco = ventacinco;
        else this.ventacinco = 0;
    }
    
  public double getventaseis(){
    return ventaseis;
    }
  public void setVentaseis(double ventaseis){
        if(ventaseis >= 0)this.ventaseis = ventaseis;
        else this.ventaseis = 0;
    }
    
  public double getventasiete(){
    return ventasiete;
    }
  public void setVentasiete(double ventasiete){
        if(ventasiete >= 0)this.ventasiete = ventasiete;
        else this.ventasiete = 0;
    }  
  pannormal(String nombre,double ventauno,double ventados,double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete){
    super(nombre);
    setVentauno(ventauno);
    setVentados(ventados);
    setVentatres(ventatres);
    setVentacuatro(ventacuatro);
    setVentacinco(ventacinco);
    setVentaseis(ventaseis);
    setVentasiete(ventasiete);
    }
  
  double calcualarpromedio(){
        return(ventauno + ventados + ventatres + ventacuatro + ventacinco + ventaseis + ventasiete) / 7;
    }  
}
