package Tarea_6;

import Tarea_6.HerenciaMultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadro = new Cuadrado();
        cuadro.setLado(5);
        System.out.println("El area del cuadrado es : "+cuadro.calcularArea());

        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("El area del circulo es : "+circulo.calcularArea());

        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Pepe");
        ada.setArte("pintura");
        ada.setDeporte("Basket ball");
        System.out.println(ada);
        ada.ensayar(" oleo");
        ada.entrenar();
        ada.presentarCompetencia("CDMX");
        System.out.println(ada);


    }
}