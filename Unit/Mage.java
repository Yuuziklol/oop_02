package Unit;

public abstract class Mage extends SpellCaster{
    public Mage(String name,float hp, int maxHp, int damage, int att, int def,int mp,int maxMp,float dist) {
        super(name, hp, maxHp, damage, att, def,mp,maxMp,dist);
    }

    public Mage(String name) {
        super(name, 100, 100, 14, 2, 6, 250, 250,2.2f);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я маг";
    }
}