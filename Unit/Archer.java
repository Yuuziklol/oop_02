package Unit;

public abstract class Archer extends Default{
    protected int shots, maxShots;
    protected float dist;

    public Archer(String name, float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist) {
        super(name, hp, maxHp, damage, att, def);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    public float getDist() {return dist;}
}