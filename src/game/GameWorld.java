package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
    private Shape floor;
    private Shape Grass;
    private Shape Dirt;
    private Shape Platform;
    private Player player;

    public GameWorld(){

        // make floor
        Shape floor = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, floor);
        ground.setPosition(new Vec2(0f, -11.5f));


        // make a platform
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8, 5.5f));
        platform1.setAngleDegrees(-45);

        // make a ball
        Shape ballShape = new CircleShape(1.5f);
        DynamicBody ball = new DynamicBody(this, ballShape);
        ball.setPosition(new Vec2(-9, 6.5f));

        // second platform
        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(8,5.5f));
        platform2.addImage(new BodyImage("data/Platform.png", 1));

        player = new Player(this);
        player.setPosition(new Vec2(0,0));
    }
    public Player GetPlayer(){return player;}
}
