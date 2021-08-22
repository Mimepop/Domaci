package domaciposta;

public class Poruka {
    private String poruka;
    private String posiljalac;
    private String primalac;
    int suma;
    private int _id;

    public Poruka(String poruka, String posiljalac, String primalac, int suma, int id) {
        this.poruka = poruka;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.suma = suma;
        this._id = id;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public String getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }
    public void posalji() {
            if(suma>0){
                System.out.println(posiljalac+" salje "+suma+" para"+primalac+"-u, uz poruku: "+poruka);
            }
            else {
                System.out.println(posiljalac + " prima " +  Math.abs(this.suma) + " para od " + primalac + "-a, uz poruku: " + poruka);
            }
    }
    @Override
    public String toString() {
        return posiljalac+" i "+primalac+" vrse transakciju od "+suma+", uz poruku: "+poruka+" ("+_id+")";
    }
}

