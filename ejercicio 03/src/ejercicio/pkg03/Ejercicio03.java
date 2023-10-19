/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ferna
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList<Empleado> l;
        l = new MyList();
        Empleado aux=new Empleado("Fer",100,300);
        l.add(aux);
        Empleado aux2=new Empleado("Paco",100,300);
        l.add(aux2);
        Empleado aux3=new Empleado("Paco",100,300);
        l.add(aux3);
        //l.inicio();
        l.adelante();
        l.adelante();
        l.atras();
        
        System.out.println("");
        l.showMyList();
        
        
        final appl app = new appl();
        app.addWindowListener(new WindowAdapter() {
           
           
           @Override
           public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            //Pone el focus (foco de atencion)
           @Override
            public void windowActivated(WindowEvent e) {
                //app.setFocus();
            }
        });
        app.pack();
        app.setVisible(true);
    }
    
}
