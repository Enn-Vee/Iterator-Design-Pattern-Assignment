/**
 * Album class which holds songs. Has a name.
 * @author covin
 *
 */
public class Album {
	private int count;
	private String name;
	private Song songs[];
	
	
	/**
	 * Constructs the class Album
	 * @param aName
	 */
	public Album(String aName) {
		this.name = aName;
		songs = new Song[20];
	}
	
	/**
	 * Adds a new song to the song array in the class.
	 * @param aName
	 * @param anArtist
	 * @param aLength
	 * @param aGenre
	 */
	public void addSong(String aName, String anArtist, double aLength, String aGenre) {
		for(int i = 0; i < songs.length; i++) {
			if(songs[i] == null) {
				songs[i] = new Song(aName, anArtist, aLength, aGenre);
				break;
			}
		}
	}
	/**
	 * Creates a new iterator for the array in the class.
	 * @return
	 */
	public AlbumIterator createIterator() {
		AlbumIterator iterator = new AlbumIterator(this.songs);
		return iterator;
	}
}
