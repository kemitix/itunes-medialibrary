package net.kemitix.itunes.medialibrary;

import java.sql.SQLException;
import java.util.List;

public interface MediaLibrary {

    List<Album> getAlbums() throws SQLException;

    List<Artist> getArtists() throws SQLException;

    List<Item> getItems() throws SQLException;

    List<AlbumTrack> getAlbumTracks() throws SQLException;
}
