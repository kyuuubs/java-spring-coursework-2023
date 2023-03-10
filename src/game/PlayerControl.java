package game;
import city.cs.engine.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl implements KeyListener {

    private Player player;

    public PlayerControl(Player player){this.player = player;}

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_A) {
            player.startWalking(-10);
        } else if (code == KeyEvent.VK_D) {
            player.startWalking(10);
        } else if (code == KeyEvent.VK_SPACE) {
            player.jump(20);
        }
        else if( code == KeyEvent.VK_E) {
            player.Pew();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {player.stopWalking();

    }
}
