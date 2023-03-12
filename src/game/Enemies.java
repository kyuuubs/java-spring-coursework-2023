package game;
import city.cs.engine.*;

public abstract class Enemies extends Walker {

    private String name;

    public void nameSet(String name){this.name = name;}
    public Enemies(World world, Shape shape) {super(world,shape);}
    public abstract void EnemiesControl();
    public abstract void EnemiesHealth();

}
