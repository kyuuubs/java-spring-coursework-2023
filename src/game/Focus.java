package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Focus implements MouseListener {

    private GameView view;
    public Focus(GameView view) {this.view = view;}


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {view.requestFocus();

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
