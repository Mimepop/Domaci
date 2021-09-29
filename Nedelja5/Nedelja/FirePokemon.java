package pokemon;

public class FirePokemon extends Pokemon{
    public FirePokemon(String name, int health) {
        super(name, health);
    }
    @Override
    public String attack() {
        return "Vatrom";

    }

    @Override
    public String defend() {
        return "Telesno";
    }

    @Override
    public String wins() {
        return "Grass type";
    }

    @Override
    public String loses() {
        return "Water type";
    }

    @Override
    public String logAll() {
        return "Napada: " +attack()+"\n"+
                "Brani se: "+ defend()+"\n"+
                "Pobedjuje: "+wins()+"\n"+
                "Gubi od: "+loses();
    }


}