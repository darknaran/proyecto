
public class panaderia
{
    private final String nit;
    private String nombrepanaderia;
    private pannormal[] pan1;
    private pandulce[] pan2;
    private pangrande[] pan3;    
    private int numpan1;
    private int numpan2;
    private int numpan3;        
    
    public panaderia(String nit,String nombrepanaderia){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setnombrepanaderia(nombrepanaderia);       
        pan1 = new pannormal[6];
        pan2 = new pandulce[7];
        pan3 = new pangrande[4];        
        numpan1 = 0;
        numpan2 = 0;
        numpan3 = 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getnombrepanaderia(){
        return nombrepanaderia;
    }
    public void setnombrepanaderia(String nombrepanaderia){
        if(nombrepanaderia != null){
            this.nombrepanaderia = nombrepanaderia;
        }else{
            this.nombrepanaderia = "";
        }        
    }
    
    public int getnumpan1(){
        return numpan1;
    }
    
    public int getnumpan2(){
        return numpan2;
    }
    
    public int getnumpan3(){
        return numpan3;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numpan1; i++){
            promedio = promedio + pan1[i].calcularpromedio() / numpan1;
        }
        for(int i = 0; i < numpan2; i++){
            promedio = promedio + pan2[i].calcularPromedio() / numpan2;
        }
        for(int i = 0; i < numpan3; i++){
            promedio = promedio + pan3[i].calcularPromedio() / numpan3;
        }
        return promedio / 3;
    }
    public void adicionarpannormal(String nombre, double ventauno, double ventados,double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete){
        pan1[ numpan1] = new pannormal( nombre,ventauno, ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete);
        numpan1++;
    }
    
    public void adicionarpandulce(String nombre, double ventauno, double ventados,double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete){
        pan2[numpan2] = new pandulce(nombre,ventauno, ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete);
        numpan2++;
    }
    
    public void adicionarpangrande(String nombre, double ventauno, double ventados,double ventatres,double ventacuatro,double ventacinco,double ventaseis,double ventasiete){
        pan3[numpan3] = new pangrande(nombre,ventauno, ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete);
        numpan3++;
    }
}
