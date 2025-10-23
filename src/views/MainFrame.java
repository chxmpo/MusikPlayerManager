package views;

import javax.swing.*;

public class MainFrame extends JFrame {

    private PlaylistPanel pPanel;



    public PlaylistPanel getpPanel() {
        return pPanel;
    }

    public void setpPanel(PlaylistPanel pPanel) {
        this.pPanel = pPanel;
    }

    public MainFrame() {
         setTitle("\uD83D\uDD25 Musik-Playlist-Manager");
         setSize(600,400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);

         pPanel = new PlaylistPanel();
         add(pPanel);
    }

}
