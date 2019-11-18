import java.util.Iterator;

/**
 * Iterator for the Song array of object Album.
 * @author Nick Bautista
 *
 */
public class AlbumIterator implements Iterator<Song> {
	private Song song[];
	private int position;	
	
	/**
	 * Initalizes the array and sets position to -1.
	 * @param songs
	 */
	public AlbumIterator(Song songs[]) {
		this.song = songs;
		this.position = -1;
	}
	
	/**
	 * Checks whether or not the next index from current position has a Song object. Returns true if there is. Otherwise, returns false.
	 */
	public boolean hasNext() {
		if(song[position+1] != null)
			return true;
		return false;
	}
	
	/**
	 * Goes to the next index of the Song array then returns the song in the index.
	 */
	public Song next() {
		position++;
		return song[position];
	}
}
