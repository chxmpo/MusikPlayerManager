package models;

import java.io.*;
import java.util.ArrayList;

public class PlaylistModel {
    private ArrayList<Song> songs = new ArrayList<>();

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public PlaylistModel() {

    }

    //neuen Song adden
    public void addSong(Song s){
        songs.add(s);
    }

    //song nach Index löschen
    public void removeSong(int index){
        if (index >= 0 && index < songs.size()) {
            songs.remove(index);
        }
    }

    //Song und Artist in die Datei einlesen
    public void saveToFile(String filename){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SongSpeichern.dat"))) {
            out.writeObject(songs);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("SongSpeichern.dat"))) {
            songs = (ArrayList<Song>) in.readObject();
        } catch (Exception e) {
            System.out.println("Keine gespeicherte Datei gefunden - neue Playlist wird erstellt.");
            songs = new ArrayList<>();
        }
    }
}
