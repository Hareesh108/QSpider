package com.MusicPlayer;

import java.util.ArrayList;

public class Album {
	
	String AlbumName;
	String Artist;
	ArrayList<Song> songs;
	
	public Album(String albumname, String artist) {
		super();
		AlbumName = albumname;
		Artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public void addSong(String title, double duration) {
		songs.add(new Song(title, duration));
	}
	
	
	
	

}
