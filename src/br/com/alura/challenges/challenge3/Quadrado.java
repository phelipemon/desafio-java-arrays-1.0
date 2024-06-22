package br.com.alura.challenges.challenge3;

public class Quadrado implements Forma{
    private double area;

    public double getArea() {
        return area;
    }

    @Override
    public void calcularArea(double lado) {
        this.area = lado * lado;
    }

    @Override
    public double guardaArea() {
        return this.area;
    }
}
