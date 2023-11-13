package promedianainterfaz;

import javax.swing.DefaultListModel;

/**
 *
 * @author brayan
 */
public class Materia {

    public String nombre;
    public int creditos;
    public DefaultListModel<Nota> notas = new DefaultListModel<Nota>();

    public Materia(String nombre, int creditos, DefaultListModel<Nota> notas) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.notas = notas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public DefaultListModel<Nota> getNotas() {
        return notas;
    }

    public void setNotas(DefaultListModel<Nota> notas) {
        this.notas = notas;
    }

    public double getPromedio() {

        if (notas.size() == 0) {
            return 0;
        } else {
            double suma = 0;
            for (int i = 0; i < notas.getSize(); i++) {
                suma += (notas.getElementAt(i).getCalificacion()) * (notas.getElementAt(i).getPorcentaje());
                // calificacion de la nota por el porcentaje
            }
            return suma;
        }
    }

    public double getSumaProcentaje() {
        double sum = 0;
        for (int i = 0; i < notas.getSize(); i++) {
            sum += notas.getElementAt(i).getPorcentaje() * 100; 
        }
        return sum; 
    }

}
