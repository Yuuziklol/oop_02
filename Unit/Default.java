package Unit;

public abstract class Default implements GameInterface{
    protected float hp;
    protected String name;
    protected int damage, att, def, maxHp;

    public Default(String name,float hp, int maxHp, int damage, int att, int def) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        this.name = name;
    }

    @Override
    public String toString() {return String.format("%s %d %d",name,hp,damage);}

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "";
    }

}