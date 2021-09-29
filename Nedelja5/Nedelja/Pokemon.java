package pokemon;

public abstract class Pokemon implements Attackable{
    String name, type;
    int health;

    public Pokemon(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract String logAll(); //Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i od koga gubi
}