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
    private Mushroom mushroom2;

    public GameWorld(){

        // make floor
        Shape floor = new BoxShape(25, 1f);
        StaticBody ground = new StaticBody(this, floor);
        ground.setPosition(new Vec2(0f, -12f));
        ground.addImage(new BodyImage("data/TopFloor.png",2));

        StaticBody UnderGround = new StaticBody(this, floor);
        UnderGround.setPosition(new Vec2(0,-14));
        UnderGround.addImage(new BodyImage("data/BottomFloor.png",2));

        Shape dirt = new BoxShape(1,1);
        StaticBody DirtBlock = new StaticBody(this, dirt);
        DirtBlock.setPosition(new Vec2(0,-10));
        DirtBlock.addImage(new BodyImage("data/Grass.png",2));


        // make a platform
        Shape platformShape = new BoxShape(1.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(0f, 4f));
        platform1.setAngleDegrees(45);
        platform1.addImage(new BodyImage("data/Platform.png", 1));



        //platforms
        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(8.5f,5.5f));
        platform2.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(5.5f,5.5f));
        platform3.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform4 = new StaticBody(this, platformShape);
        platform4.setPosition(new Vec2(11.5f,5.5f));
        platform4.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform5 = new StaticBody(this, platformShape);
        platform5.setPosition(new Vec2(14.5f,5.5f));
        platform5.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform11 = new StaticBody(this, platformShape);
        platform11.setPosition(new Vec2(2.5f,5.5f));
        platform11.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform6 = new StaticBody(this, platformShape);
        platform6.setPosition(new Vec2(13f,0f));
        platform6.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform7 = new StaticBody(this, platformShape);
        platform7.setPosition(new Vec2(7f,0f));
        platform7.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform8 = new StaticBody(this, platformShape);
        platform8.setPosition(new Vec2(4f,0f));
        platform8.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform9 = new StaticBody(this, platformShape);
        platform9.setPosition(new Vec2(1f,0f));
        platform9.addImage(new BodyImage("data/Platform.png", 1));

        StaticBody platform10 = new StaticBody(this, platformShape);
        platform10.setPosition(new Vec2(-2f,0f));
        platform10.addImage(new BodyImage("data/Platform.png", 1));

        player = new Player(this);
        player.setPosition(new Vec2(-5,-0));

        mushroom1 = new Mushroom(this);
        mushroom1.setPosition(new Vec2(10,10));

        mushroom2 = new Mushroom(this);
        mushroom2.setPosition(new Vec2(10,-10));

        new Trampoline(this).setPosition(new Vec2(20,-10.5f));

    }
    public Player GetPlayer(){return player;}
}
