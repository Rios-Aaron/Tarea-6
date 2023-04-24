package Tarea_6;

public interface Vehiculo {
    public static final int velocidad_maxima= 160;
    public static final char clasificacion_eficiencia = 'A';

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();

}