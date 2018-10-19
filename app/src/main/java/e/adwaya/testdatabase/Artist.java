package e.adwaya.testdatabase;

/**
 * Created by Adwaya on 10/13/2018.
 */

public class Artist {

    String artistId;
    String artistName;
    String artistGenre;

    public Artist()
    {

    }

    public Artist(String artistId, String artistName, String artistGenre)
    {
      this.artistId=artistId;
      this.artistName=artistName;
      this.artistGenre=artistGenre;

    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setArtistGenre(String artistGenre) {
        this.artistGenre = artistGenre;
    }
}
