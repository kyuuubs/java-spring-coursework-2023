package game;

import org.jbox2d.common.Vec2;
import city.cs.engine.*;

public class Trampoline extends StaticBody {

    private static final Shape TrampolineShape = new BoxShape( 0.25f,0.25f);
    private static final BodyImage TrampolineImage = new BodyImage("data/trampolineGif.gif",1);

    public Trampoline(World world) {
        super(world, TrampolineShape);
        addImage(TrampolineImage);
        //this is used to make players jump after coming into contact with the trampoline
        this.addCollisionListener(new CollisionListener() {
            @Override
            public void collide(CollisionEvent collisionEvent) {
                if (collisionEvent.getOtherBody() instanceof Player){
                    ((Player) collisionEvent.getOtherBody()).applyImpulse(new Vec2(0,400));
                }
            }
        });
    }
}
