//Hecho por Ismael 14/11
public class hexagono {
    double lado;
    double apotema;
    public hexagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
    public double calculaAreaHexagono(){
        double resultado = ((lado*6)*apotema)/2;
        return resultado;
    }

    
}
