package game;

import city.cs.engine.UserView;
import city.cs.engine.World;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {

    private Image Background;
    public GameView(World w, int width, int height) {
        super(w, width, height);
    }

    @Override
    protected void paintBackground(Graphics2D g) {
            Background = new ImageIcon("data/SpaceBackground.png").getImage();
            g.drawImage(Background,0,0,this);
    }
}

