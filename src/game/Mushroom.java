package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import javax.swing.*;

public class Mushroom extends Walker{
    private static final Shape mushroomShape =new BoxShape(1,1f);
    private final BodyImage mushroomImage = new BodyImage("data/Mushroom.gif",2);

    public Mushroom(World world) {
        super(world, mushroomShape);
        this.addImage(mushroomImage);
        setGravityScale(5);
    }

}
