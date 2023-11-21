//Hecho por Ismael 14/11
public class triangulo{
    private double base;
    private double altura;

    public triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaTrinagulo(){
        return (this.base*this.altura)/2;
    }
}