package Unit;

public abstract class SpearMan extends Warrior{
    public SpearMan(String name, float hp, int maxHp, int damage, int att, int def, int rage, int maxRage) {
        super(name,hp,maxHp,damage,att,def,rage,maxRage);
    }

    public SpearMan(String name) {
        super(name, 220, 220, 12, 4, 7, 40, 100);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я копейщик";
    }
}