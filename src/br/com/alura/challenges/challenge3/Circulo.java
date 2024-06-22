package br.com.alura.challenges.challenge3;

public class Circulo implements Forma{

    private double area;
    private double pi;

    public double getArea() {
        return area;
    }

    @Override
    public void calcularArea(double raio) {
        this.pi = 3.1415926535898;
        this.area = pi * (raio * raio);
    }

    @Override
    public double guardaArea() {
        return this.area;
    }
}
