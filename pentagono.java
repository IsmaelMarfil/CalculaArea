//Hecho por Ismael 14/11
public class pentagono {
    double apotema;
    double lado;
    public pentagono(double apotema, double lado){
        this.apotema = apotema;
        this.lado = lado;
    }
    public double calculaAreaPentagono(){
        double resultado = ((lado*5)*apotema)/2;
        return resultado;
    }

    
}
