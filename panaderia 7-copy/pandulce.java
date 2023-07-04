public class pandulce extends Pan{
    private double ventauno;
    private double ventados;
    private double ventatres;
    private double ventacuatro;
    private double ventacinco;
    private double ventaseis;
    private double ventasiete;
    pandulce(String identificacion, String nombre,  double ventauno, double ventados, double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete)throws Exception{
        super(identificacion, nombre);
        setventauno(ventauno);
        setventados(ventados);
        setventatres(ventatres);
        setventacuatro(ventacuatro);
        setventacinco(ventacinco);
        setventaseis(ventaseis);
        setventasiete(ventasiete);
    }
    
    public double calcularPromedio(){
        return (ventauno+ ventados + ventatres + ventacuatro + ventacinco + ventaseis + ventasiete) / 7;
    }
    
    public double getventauno(){
        return ventauno;
    }
    public void setventauno(double ventauno){
        if(ventauno >= 0) this.ventauno = ventauno;
        else this.ventauno = 0;
    }
    
    public double getventados(){
        return ventados;
    }
    public void setventados(double ventados){
        if(ventados >= 0) this.ventados = ventados;
        else this.ventados = 0;
    }
    
    public double getventatres(){
        return ventatres;
    }
    public void setventatres(double ventatres){
        if(ventatres >= 0) this.ventatres = ventatres;
        else this.ventatres = 0;
    }
    
    public double getventaventacuatro(){
        return ventacuatro;
    }
    public void setventacuatro(double ventacuatro){
        if(ventacuatro >= 0) this.ventacuatro = ventacuatro;
        else this.ventacuatro = 0;
    }
    
    public double getventacinco(){
        return ventacinco;
    }
    public void setventacinco(double ventacinco){
        if(ventacinco >= 0) this.ventacinco = ventacinco;
        else this.ventacinco = 0;
    }
    
    public double getventaseis(){
        return ventaseis;
    }
    public void setventaseis(double ventaseis){
        if(ventaseis >= 0) this.ventaseis = ventaseis;
        else this.ventaseis = 0;
    }
    
    public double getventasiete(){
        return ventasiete;
    }
    public void setventasiete(double ventasiete){
        if(ventasiete >= 0) this.ventasiete = ventasiete;
        else this.ventasiete = 0;
    }
}
