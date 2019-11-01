package ru.rakhmedov.spring.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class MusicPlayer
{
	private List<Music> musics = new ArrayList<>();
	private String name;
	private int volume;

	public MusicPlayer()
	{
	}

	public MusicPlayer(List<Music> musics)
	{
		this.musics = musics;
	}

	public void playMusic()
	{
		System.out.println("Player name: " + getName());
		System.out.println("Player volume: " + getVolume());
		for (Music music: musics)
		{
			System.out.println("Playing: " + music.getSong());
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getVolume()
	{
		return volume;
	}

	public void setVolume(int volume)
	{
		this.volume = volume;
	}
}
