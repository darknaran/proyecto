public class Panaderia
{
    String nombre;
    double ventasuno;
    double ventasdos;
    double ventastres;
    double ventascuatro;
    double ventascinco;
    double ventasseis;
    double ventassiete;
    Panaderia(String nombre, double ventasuno, double ventasdos, double ventastres,double ventascuatro,double ventascinco,double ventasseis, double ventassiete){
        this.nombre = nombre;
        this.ventasuno = ventasuno;
        this.ventasdos = ventasdos ;
        this.ventastres = ventastres;
        this.ventascuatro = ventascuatro;
        this.ventascinco = ventascinco;
        this.ventasseis = ventasseis;
        this.ventassiete = ventassiete;
        
    }
    
    double calcularPromedio(){
        return (ventasuno + ventasdos + ventastres + ventascuatro + ventascinco + ventasseis + ventassiete) / 7;
    }
}
