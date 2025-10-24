package views;

import javax.swing.*;
import java.awt.*;

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

        // Hintergrund leicht grau (habs versucht)
        getContentPane().setBackground(new Color(245, 245, 245));

        // Coole Schrift
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));
        UIManager.put("Table.font", new Font("Segoe UI", Font.PLAIN, 13));

         pPanel = new PlaylistPanel();
         add(pPanel);
    }

}
