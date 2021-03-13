package PlayList;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artist;
    private List<Song> songs;

    public Album(String albumName, String artist){
        this.albumName = albumName;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addSong(String songTitle, double duration){
        try {
            if(findSong(songTitle)==null) {
                songs.add(new Song(songTitle, duration));
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private Song findSong(String songTitle){
        for(Song song: songs){
            if(song.getSongTitle().equals(songTitle)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList){
        try {
            playList.add(songs.get(trackNumber));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean addToPlayList(String songTitle, List<Song> playList){
            Song song = findSong(songTitle);
            if(song != null && song.getSongTitle()==songTitle){
                playList.add(song);
                return true;
            }else {
                return false;
            }
    }
}
