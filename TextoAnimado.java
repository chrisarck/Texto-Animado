/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textoanimado;

/**
 *
 * @author andra
 */

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LCE X - XX
 */
public class TextoAnimado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Hilos");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        f.setSize(1000,800);
        JLabel l = new JLabel();
        JLabel la = new JLabel();
        f.setLayout(null);
        l.setBounds(0,0,1000,400);
        la.setBounds(0,400,1000,400);
//        l.setBounds(300, 500, 50, 50);
        //programacioon concurrente hilos de procesos
        //ejecutar programa en foprmna de hilos
        //crear clase
        //es mas recomendable usar runnable, no es recomendable usar herencia para no desperdiciarla
        //lo q se va a poner en el hilo no interrum,pe en las secciones de este programa?
        //el sistema ooperativo da tiempos a cad hilo
        
        f.add(l);
        f.add(la);
        f.setVisible(true);
        //delay y luego system.exit para matar programa luego de este
        MiHilo m = new MiHilo(l,"chaparritos");
        MiHilo ma = new MiHilo(la,"by oye gil");
        Thread t = new Thread(m);
        Thread ta = new Thread(ma);
        t.start();
        ta.start();
    }

   
    
}
