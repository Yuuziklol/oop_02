package Unit;

public abstract class Rogue extends Warrior{
    public Rogue(String name, float hp, int maxHp, int damage, int att, int def, int rage, int maxRage) {
        super(name,hp,maxHp,damage,att,def,rage,maxRage);
    }
    public Rogue(String name) {
        super(name, 100, 100, 20, 10, 2, 100, 100);
    }
    
    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я разбойник";
    }
}