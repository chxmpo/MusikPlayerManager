package models;

public class Song {
    private String title;
    private String artist;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public Song(String title, String artist) {

    }

    public Song(){

    }

    public String toString(){
        return this.getTitle()+ " - " + this.getArtist();
    }
}
