import java.util.ArrayList;
public class panaderia
{
    private final String nit;
    private String nombrepan;
    private ArrayList pan;
    
    public panaderia(String nit,String nombrepan){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombrepan(nombrepan);      
        pan = pan = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombrepan(){
        return nombrepan;
    }
    public void setNombrepan(String nombrepan){
        if(nombrepan != null){
            this.nombrepan = nombrepan;
        }else{
            this.nombrepan = "";
        }        
    }
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < pan.size(); i++){
            promedio += ((Pan)pan.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarpan(String identificacion, String nombre,double ventauno, double ventados,double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete)throws Exception{
        pan.add(new pannormal(identificacion, nombre,ventauno,ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete));
    }
    
    public void adicionapan(String identificacion, String nombre,double ventauno, double ventados,double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete)throws Exception{
        pan.add(new pandulce(identificacion, nombre, ventauno,ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete));
    }
    
    public void adicionarpa(String identificacion, String nombre, double ventauno, double ventados,double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete)throws Exception{
        pan.add(new pangrande(identificacion, nombre, ventauno,ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete));
    }
    
}
