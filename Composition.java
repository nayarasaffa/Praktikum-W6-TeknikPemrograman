/**
 * <h1> Kasus 3 : Composition </h1>
 * 
 * Kasus Lagu di dalam Album.
 * Program Composition mengimplementasikan program dengan mengilustrasikan
 * konsep komposisi dengan kasus menampilkan daftar lagu yang ada di suatu
 * Album
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-03-20
 */

package composition;
import java.util.*;

/* Class Song */
// Berfungsi untuk menyusun data lagu berupa judul lagu dan penyanyi
class Song{
	public String title;
	public String singer;
	Song(String title, String singer){
		this.title = title;
		this.singer = singer;
	}
}

/* Class Album */
// Mengandung list of songs
// Berfungsi untuk menyusun daftar lagu dalam sebuah album
class Album{
	private final List<Song> songs;
	Album (List<Song> songs){
		this.songs = songs;
	}
	public List<Song> getTotalSongInAlbum(){
		return songs;
	}
}

/* Class Composition */
// Berfungsi untuk menyusun daftar lagu yang ada dalam Album
// Main method
class Composition {
	public static void main(String[] args) {
		// Menciptakan objek dari Song class
		Song s1 = new Song("Child", "Mark");
		Song s2 = new Song("Lathi", "Bad Genius");
		Song s3 = new Song("Paris", "The Chainsmokers");
		
		// Menciptakan daftar yang mengandung judul lagu dan penyanyi
		List<Song> songs = new ArrayList<Song>();
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		Album list = new Album(songs);
		List<Song> sg = list.getTotalSongInAlbum();
		
		// Menampilkan judul lagu dan penyanyinya ke layar
		for(Song song : sg) {
			System.out.println("Title: " +song.title+ "   Singer: " +song.singer);
		}
	}
}
