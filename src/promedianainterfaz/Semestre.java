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

    public Semestre (double limiteSuperior, double limiteInferior, double meta, DefaultListModel<Materia> materias) {
        this.limiteSuperior = limiteSuperior;
        this.limiteInferior = limiteInferior;
        this.meta = meta;
        this.materias = materias; 
        
    }
    
    public Semestre(){}; 

   
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
    
    
    
    
}
