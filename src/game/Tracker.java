package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Tracker implements StepListener {
    private GameView view;
    private Player player;

    public Tracker(GameView view, Player player) {
        this.view = view;
        this.player = player;
    }
    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        //view.getGameViewCentre(player.getPosition());
    }
}