package Unit;

public abstract class CrossbowMan extends Archer {
    public CrossbowMan(String name, float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist) {
        super(name, hp, maxHp, damage, att, def,shots,maxShots,dist);
    }

    public CrossbowMan(String name) {
        super(name, 100, 100, 15, 7, 4, 18, 18,2.5f);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я арбалетчик";
    }
}