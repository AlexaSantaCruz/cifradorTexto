/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifradortexto;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alexa
 */
public class CifradorTexto {

        private ArrayList<String> palabrasSec=new ArrayList<String>();
        private ArrayList<String> palabrasCon=new ArrayList<String>();

    public CifradorTexto(ArrayList<String> palabrasSec, ArrayList<String> palabrasCon) {
        this.palabrasCon=palabrasCon;
        this.palabrasSec=palabrasSec;
    }

    public ArrayList<String> getPalabrasSec() {
        return palabrasSec;
    }

    public void setPalabrasSec(ArrayList<String> palabrasSec) {
        this.palabrasSec = palabrasSec;
    }

    public ArrayList<String> getPalabrasCon() {
        return palabrasCon;
    }

    public void setPalabrasCon(ArrayList<String> palabrasCon) {
        this.palabrasCon = palabrasCon;
    }




}
