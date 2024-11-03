package Datos;

public abstract class Personaje implements Ataque{

    private String nombre;
    private int poderBase;
    protected Arma armaActual;

    public Personaje(String nombre,int poderBase, Arma armaActual) {
        this.nombre = nombre;
        this.poderBase = poderBase;
        this.armaActual = armaActual;
    }

    public String getNombre() {
        return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoderBase() {
        return poderBase;
    }

    public Arma getArmaActual() {
        return armaActual; }

    public void cambiarArma(Arma nuevaArma) {
        this.armaActual = nuevaArma;
    }

    public int getPoderTotal(){
        return poderBase + armaActual.getPoder();
    }

    public void atacar() {
        System.out.print(nombre + " ataca con ");
        armaActual.usar();
    }

    public abstract void display();
}