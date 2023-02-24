package Unit;

public abstract class Farmer extends Warrior{
    public Farmer(String name, float hp, int maxHp, int damage, int att, int def, int rage, int maxRage) {
        super(name,hp,maxHp,damage,att,def,rage,maxRage);
    }

    public Farmer(String name) {
        super(name, 120, 120, 5, 3, 4, 0, 100);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я крестьянин";
    }
}
