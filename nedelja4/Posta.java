package domaciposta;

import java.util.ArrayList;

public class Posta {
    private ArrayList<Poruka> poruke;

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public void add(Poruka p) {
        boolean imaP = this.itExist(p);
        if (!imaP) {
            poruke.add(p);
        }
    }

    private boolean itExist(Poruka p) {
        boolean imaP = false;
        for (int i = 0; i < poruke.size(); i++) {
            if (poruke.get(i).getId() == p.getId()) {
                imaP = true;
                break;
            }
        }
        return imaP;
    }

    public void remove(Poruka p) {
        for (int i = 0; i < poruke.size(); i++) {
            if (poruke.get(i).getId() == p.getId()) {
                poruke.remove(p);
            }

        }
    }

    public void send(Poruka p) {
        boolean imaP = itExist(p);
        if (imaP) {
            System.out.println(p.toString());
            this.poruke.remove(p);
        }
    }

    public void change(Poruka p, String msg) {
        for (int i = 0; i < poruke.size(); i++) {
            if (poruke.get(i).getId() == p.getId()) {
                poruke.get(i).setPoruka(msg);
//                    break;
            }
        }
    }


    public Integer isplata(Poruka p) {

        boolean imaP = itExist(p);
        if (imaP) {
            return p.getSuma();
        } else {
            return null;
        }
    }


    @Override
    public String toString() {
        String porukaString = "";
        for (int i = 0; i < poruke.size(); i++) {
            Poruka poruka = poruke.get(i);
            if (poruka.getSuma() > 0) {
                porukaString = poruka.getPosiljalac() + " salje " + poruka.getSuma() + " para" + poruka.getPrimalac() + "-u, uz poruku: " + poruka.getPoruka();
            } else {
                porukaString = poruka.getPosiljalac() + " prima " + Math.abs(poruka.getSuma()) + " para od " + poruka.getPrimalac() + "-a, uz poruku: " + poruka;
            }

        }
        return "Posta{ " + porukaString + " }";


    }
}