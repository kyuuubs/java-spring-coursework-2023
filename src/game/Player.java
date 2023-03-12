package game;
import city.cs.engine.*;

public class Player extends Walker{

    private static final Shape playerShape =new PolygonShape(1f, 1f, 1, -1, -1, -1, -1, 1);
    private final BodyImage playerImage = new BodyImage("data/pink-idle.gif",2f);

    public Player(World world) {
        super(world, playerShape);
        this.addImage(playerImage);
        setGravityScale(5);
    }
}
