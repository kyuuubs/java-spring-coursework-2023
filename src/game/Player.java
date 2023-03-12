package game;
import city.cs.engine.*;

public class Player extends Walker{

    private static final Shape playerShape =new BoxShape(0.75f,0.75f);
    private final BodyImage playerImage = new BodyImage("data/pink-idle.gif",2);

    public Player(World world) {
        super(world, playerShape);
        this.addImage(playerImage);
        setGravityScale(5);
    }
}
