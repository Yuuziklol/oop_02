package Unit;

public abstract class Monk extends SpellCaster{
    public Monk(String name,float hp, int maxHp, int damage, int att, int def,int mp,int maxMp,float dist) {
        super(name, hp, maxHp, damage, att, def,mp,maxMp,dist);
    }

    public Monk(String name) {
        super(name, 120, 120, 8, 2, 7, 300, 300,2.5f);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я монах";
    }
}