/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textoanimado;

/**
 *
 * @author andra
 */

import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author LCE X - XX
 */
public class MiHilo implements Runnable{
    private JLabel etiqueta;
    private String msg;
    private int x;
    public MiHilo(JLabel etiqueta, String msg){
        this.etiqueta = etiqueta;
        this.msg=msg;
        x=5;
    }

    @Override
    public void run() {
        int size = 10;
        while(true){
            Font f = new Font("Times New Roman", Font.BOLD,size);
            etiqueta.setFont(f);
            etiqueta.setText(msg);
            try {
                Thread.sleep(50);
                size+=x;
                if(size>400)
                    x*=-1;
                if(size<10)
                    x*=-1;
            } catch (InterruptedException ex) {
                System.out.println("Eror");
            }
        }
    }
    
    //hilo pasar al panel, imaginar q el pamel e4s la etioqueta
    //desde el hilo se puiede invocar el panel
    
}
