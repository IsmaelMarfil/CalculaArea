//Hecho por Ismael 14/11
public class circulo{
    double radio;

    public circulo(double radio){
        this.radio = radio;

    }
    public double calculaAreaCirculo(){
        double resultado = Math.PI*Math.pow(radio, 2);
        return resultado;
    }
}