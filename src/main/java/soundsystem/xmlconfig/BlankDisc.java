package soundsystem.xmlconfig;

import java.util.List;

import soundsystem.autoconfig.CompactDisc;

/**
 * 黑唱片
 * */
public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc(String title, String artist, List<String> tracks) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " By " + artist);
		for(String track : tracks){
			System.out.println("-Track: " + track);
		}
	}

}
