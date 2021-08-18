package nedelja4;

import java.util.Arrays;
import java.util.Random;

public class Karatista {
    private String ime;
    private int godine;
    private String rang;
    private String[] kata;

    public Karatista(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        this.godine = godine;
        this.rang = rang;
        this.kata = kata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getKata(int index) {
        return kata[index];
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }

    public void napadni(int index) {
           System.out.println( "Karatista " + this.ime + " napada sa " + this.getKata(index) + " katom");
    }

    public void vatreniNapad() {
        int randIdx = new Random().nextInt((this.kata.length-1) - 0 + 1);
        String randElem = kata[randIdx];
        System.out.println("Karatista " + this.ime + " napada sa " + randElem + " katom.");
    }

    public void log() {
        System.out.println("Karatista: " + this.ime + ", " + this.godine + ", " + this.rang + " - zna naredne kate " + Arrays.toString(this.kata));
    }
}

