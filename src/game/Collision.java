package game;

import city.cs.engine.CollisionListener;
import city.cs.engine.CollisionEvent;
public class Collision implements CollisionListener {
    private Player player;


    public Collision(Player player) {
        this.player = player;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if(collisionEvent.getOtherBody() instanceof Mushroom){
            collisionEvent.getReportingBody().destroy();
        }
    }
}

