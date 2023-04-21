package com.MusicPlayer;

public class Song {
	
	private String Song_name;
	private double Duration;
	
	public Song(String song_name, double duration) {
		super();
		Song_name = song_name;
		Duration = duration;
	}

	public String getSong_name() {
		return Song_name;
	}

	public void setSong_name(String song_name) {
		Song_name = song_name;
	}

	public double getDuration() {
		return Duration;
	}

	public void setDuration(double duration) {
		Duration = duration;
	}

	@Override
	public String toString() {
		return "Song [Song_name=" + Song_name + ", Duration=" + Duration + "]";
	}
	
	
	

	
 
}
