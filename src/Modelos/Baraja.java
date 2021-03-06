package Modelos;

import com.sun.org.apache.bcel.internal.classfile.Constant;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.Random;

public class Baraja {
    static ArrayList<Carta> cartas = new ArrayList<Carta>();

    //MÉTODO QUE CREA UNA LISTA DE CARTAS QUE REPRESENTA LA BARAJA.
    public static void crearBaraja() {
        for (Figura figura: Figura.values()) {
            for(int i=0 ; i<13 ; i++){
                Carta c = new Carta();
                c.setNumero(i+1);
                c.setFigura(figura);
                c.setValor(i+1);
                if(c.getValor()>10){
                    c.setValor(10);
                }
                cartas.add(c);
            }
        }
    }

    public static void quemarCarta(int indexEnBaraja){
        cartas.remove(indexEnBaraja);
    }

    public static ArrayList<Carta> getCartas() {
        return cartas;
    }

    public static void setCartas(ArrayList<Carta> cartas) {
        cartas = cartas;
    }

}
