package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Player extends Walker{

    private static final Shape playerShape =new BoxShape(0.75f,0.75f);
    private final BodyImage playerImage = new BodyImage("data/pink-idle.gif",2);

    public Player(World world) {
        super(world, playerShape);
        this.addImage(playerImage);
        setGravityScale(5);
    }

    public void Pew() {
        DynamicBody seed = new DynamicBody(this.getWorld(), new CircleShape(0.3f));
        seed.addImage(new BodyImage("data/Bullet.png", 0.5f));
        seed.setPosition(new Vec2(this.getPosition().x, this.getPosition().y));
        seed.setLinearVelocity(new Vec2(100, 0));
        seed.addCollisionListener(new CollisionListener() {
            @Override
            public void collide(CollisionEvent collisionEvent) {
                if (collisionEvent.getOtherBody() instanceof Mushroom) {
                    // impact with an enemy body
                    collisionEvent.getOtherBody().destroy();
                    collisionEvent.getReportingBody().destroy();
                }
            }
        });
    }
}
