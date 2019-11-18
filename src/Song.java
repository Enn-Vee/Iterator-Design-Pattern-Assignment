/**
 * Song object.
 * @author Nick Bautista
 *
 */
public class Song {
	private String name;
	private String artist;
	private double length;
	private String genre;
	
	/**
	 * Initializes class with given paramenters.
	 * @param aName
	 * @param anArtist
	 * @param aLength
	 * @param aGenre
	 */
	public Song(String aName, String anArtist, double aLength, String aGenre) {
		this.name = aName;
		this.artist = anArtist;
		this.length = aLength;
		this.genre = aGenre;
	}
	/**
	 * Prints the attributes of the object.
	 */
	public void print() {
		System.out.println(this.name+ " by "+this.artist+ " category: "+this.genre+" length: "+this.length+ " min");
	}
}
