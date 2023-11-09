package promedianainterfaz;

/**
 *
 * @author brayan
 */

import  GUI.VentanaSemestre; 
import javax.swing.DefaultListModel;

public class PromedianaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //nuevo objeto semestre
        DefaultListModel<Materia> materias = new DefaultListModel<Materia>(); 
        Semestre semestre = new Semestre( 5, 0, 4.3, materias); 
        
        VentanaSemestre ventanaPricipal = new VentanaSemestre(semestre);
        ventanaPricipal.setVisible(true);
        ventanaPricipal.setLocationRelativeTo(null);
    }
    
}
