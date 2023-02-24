package Unit;

public abstract class Sniper extends Archer {
    public Sniper(String name, float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist) {
        super(name, hp, maxHp, damage, att, def,shots,maxShots,dist);
    }

    public Sniper(String name) {
        super(name, 80, 80, 17, 9, 2, 24, 24,4.5f);
    }
    
    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я снайпер";
    }
}