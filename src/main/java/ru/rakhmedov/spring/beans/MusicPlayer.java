package ru.rakhmedov.spring.beans;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class MusicPlayer
{
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	private List<Music> musicList;
	private Random random = new Random();

	public MusicPlayer(List<Music> musicList)
	{
		this.musicList = musicList;
	}

	public String playMusic()
	{
		return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong();
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
