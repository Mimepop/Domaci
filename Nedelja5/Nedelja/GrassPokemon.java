package pokemon;

public class GrassPokemon extends Pokemon{
    public GrassPokemon(String name, int health) {
        super(name, health);
    }
    @Override
    public String attack() {
        return "Travom";

    }

    @Override
    public String defend() {
        return "Izbegava";
    }

    @Override
    public String wins() {
        return "Water type";
    }

    @Override
    public String loses() {
        return "Fire type";
    }

    @Override
    public String logAll() {
        return "Napada: " +attack()+"\n"+
                "Brani se: "+ defend()+"\n"+
                "Pobedjuje: "+wins()+"\n"+
                "Gubi od: "+loses();
    }

}