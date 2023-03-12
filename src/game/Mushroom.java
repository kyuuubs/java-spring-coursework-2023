package game;
import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import javax.swing.*;

public class Mushroom extends Walker implements StepListener{
    private static final Shape mushroomShape =new BoxShape(1,0.75f);
    private final BodyImage mushroomImage = new BodyImage("data/Mushroom.gif",2);
    private final int Vel=4;
    private final int Dist = 4;
    private float L, R;

    public Mushroom(World world) {
        super(world, mushroomShape);
        this.addImage(mushroomImage);
        setGravityScale(5);
        world.addStepListener(this);
        startWalking(Vel);
    }
    @Override
    public void setPosition(Vec2 position) {
        super.setPosition(position);
        L = position.x - Dist;
        R = position.x + Dist;
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x > R) {
            startWalking(-Vel);
        }
        if (getPosition().x < L) {
            startWalking(Vel);
        }
    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }
}
