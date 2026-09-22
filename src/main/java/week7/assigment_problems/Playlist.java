public class Playlist {

    private String[] songs;
    private int count;

    public Playlist(int maxSize) {
        songs = new String[maxSize];
        count = 0;
    }

    public void addSong(String title) {
        songs[count] = title;
        count++;
    }

    @SuppressWarnings("ManualArrayToCollectionCopy")
    public String[] getSongs() {
        String[] copy = new String[count];
        for (int i = 0; i < count; i++) {
            copy[i] = songs[i];
        }
        return copy;
    }

    public int getSongCount() {
        return count;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("Original still: " + p.getSongs()[0]);
        System.out.println("Song count: " + p.getSongCount());
    }
}