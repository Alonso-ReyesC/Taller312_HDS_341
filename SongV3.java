public class SongV3 implements Comparable<SongV3>{
    private String title;
    private String artist;
    private double bpm;

    public SongV3(String title, String artist, double bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public int compareTo(SongV3 other) {
        return title.compareTo(other.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }

}
