package promedianainterfaz;

import javax.swing.DefaultListModel;

/**
 *
 * @author brayan
 */
public class Semestre {

    private double limiteSuperior, limiteInferior;
    private double meta;
    private DefaultListModel<Materia> materias = new DefaultListModel<Materia>();

    public Semestre(double limiteSuperior, double limiteInferior, double meta, DefaultListModel<Materia> materias) {
        this.limiteSuperior = limiteSuperior;
        this.limiteInferior = limiteInferior;
        this.meta = meta;
        this.materias = materias;

    }

    public Semestre() {
    }

    ; 

   
    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public double getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public DefaultListModel<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(DefaultListModel<Materia> materias) {
        this.materias = materias;
    }

    //este metodo se utilizara con el fin de conseguir el promedio credito
    //es utilzado en VentanaSemestre con el fin de utilizarlo  
    //para mostrar el promedio semestral
    public double getPromedioCredito() {
        double suma = 0;
        int totalCreditos = 0;
        if (materias.getSize() != 0) {
            for (int i = 0; i < materias.getSize(); i++) {

                // la siguente linea de codigo multipica los creditos de cada materuia 
                // con el promedio conrrespondiente y lo suma a la variable suma
                suma += materias.getElementAt(i).getCreditos() * materias.getElementAt(i).getPromedio();

                // la sugiente linea de codigo suma el total de creditos
                totalCreditos = materias.getElementAt(i).getCreditos();
            }
            return suma / totalCreditos;
        } else {
            return 0;
        }
    }

}
