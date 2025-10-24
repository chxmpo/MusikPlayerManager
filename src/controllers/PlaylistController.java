package controllers;

import models.PlaylistModel;
import models.Song;
import views.MainFrame;
import views.SongDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PlaylistController {
    private MainFrame frame;
    private PlaylistModel model;
    private final String FILE_NAME = "SongSpeichern.dat";

    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public MainFrame getFrame() {
        return frame;
    }

    public void setFrame(MainFrame frame) {
        this.frame = frame;
    }

    public PlaylistModel getModel() {
        return model;
    }

    public void setModel(PlaylistModel model) {
        this.model = model;
    }

    public PlaylistController() {
        frame = new MainFrame();
        model = new PlaylistModel();
        model.loadFromFile(FILE_NAME);
        refreshTable();

        // Listener
        frame.getpPanel().getBtnAdd().addActionListener(this::addSong);
        frame.getpPanel().getBtnRemove().addActionListener(this::removeSong);
        frame.getpPanel().getBtnSave().addActionListener(this::savePlaylist);

        frame.setVisible(true);
    }
    //Song adden, falls nicht beide Felder ausgefüllt werden kommt eine message
    private void addSong(ActionEvent e) {
        SongDialog dialog = new SongDialog(frame);
        dialog.setVisible(true);

        if (dialog.isConfirmed()) {
            String title = dialog.getTitleInput();
            String artist = dialog.getArtistInput();

            if (!title.isEmpty() && !artist.isEmpty()) {
                Song s = new Song(title, artist);
                model.addSong(new Song(title, artist));
                refreshTable();
            } else {
                JOptionPane.showMessageDialog(frame, "Bitte beide Felder ausfüllen!");
            }
        }
    }
    //Funktion zum Löschen eines Songs, indem man ihn anklickt
    private void removeSong(ActionEvent e) {
        int row = frame.getpPanel().getTable().getSelectedRow();
        if (row != -1) {
            model.removeSong(row);
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(frame, "Bitte einen Song auswählen!");
        }
    }
    //Playlist wird in Songspeicher.dat gespeichert
    private void savePlaylist(ActionEvent e) {
        model.saveToFile(FILE_NAME);
        JOptionPane.showMessageDialog(frame, "Playlist gespeichert!");
    }
    //refreshed nachdem ein Song eingefügt wurde damit er angezeigt wird
    private void refreshTable() {
        var tableModel = frame.getpPanel().getModel();
        tableModel.setRowCount(0);
        for (Song s : model.getSongs()) {
            tableModel.addRow(new Object[]{s.getTitle(), s.getArtist()});
        }
    }
}
