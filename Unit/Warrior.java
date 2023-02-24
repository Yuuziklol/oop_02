package Unit;

public abstract class Warrior extends Default{
    protected int rage,maxRage;
    public Warrior(String name, float hp, int maxHp, int damage, int att, int def, int rage, int maxRage) {
        super(name, hp, maxHp, damage, att, def);
        this.rage = rage;
        this.maxRage = maxRage;
    }
}