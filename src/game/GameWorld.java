package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
    private Shape floor;
    private Shape Grass;
    private Shape Dirt;
    private Shape Platform;
    private Player player;
    private Mushroom mushroom1;

    public GameWorld(){

        // make floor
        Shape floor = new BoxShape(25, 1f);
        StaticBody ground = new StaticBody(this, floor);
        ground.setPosition(new Vec2(0f, -12f));
        ground.addImage(new BodyImage("data/TopFloor.png",2));

        StaticBody UnderGround = new StaticBody(this, floor);
        UnderGround.setPosition(new Vec2(0,-14));
        UnderGround.addImage(new BodyImage("data/BottomFloor.png",2));


        // make a platform
        Shape platformShape = new BoxShape(1.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8.5f, 5.5f));
        platform1.setAngleDegrees(-45);



        // second platform
        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(8.5f,5.5f));
        platform2.addImage(new BodyImage("data/Platform.png", 1));

        player = new Player(this);
        player.setPosition(new Vec2(0,0));

        mushroom1 = new Mushroom(this);
        mushroom1.setPosition(new Vec2(10,10));

    }
    public Player GetPlayer(){return player;}
}
