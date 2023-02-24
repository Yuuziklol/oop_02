package Unit;

public abstract class SpellCaster extends Default{
    protected int mp,maxMp;
    protected float dist;
    public SpellCaster(String name,float hp, int maxHp, int damage, int att, int def, int mp, int maxMp, float dist) {
        super(name,hp,maxHp,damage,att,def);
        this.mp = mp;
        this.maxMp = maxMp;
        this.dist = dist;
    }
}
