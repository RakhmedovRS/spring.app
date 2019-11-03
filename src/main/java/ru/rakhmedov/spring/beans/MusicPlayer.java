package ru.rakhmedov.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class MusicPlayer
{
	private ClassicalMusic classicalMusic;
	private RapMusic rapMusic;
	private RockMusic rockMusic;
	private String name;
	private int volume;

	@Autowired
	public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic, RockMusic rockMusic)
	{
		this.classicalMusic = classicalMusic;
		this.rapMusic = rapMusic;
		this.rockMusic = rockMusic;
	}

	public String playMusic()
	{
		return "Player name: " + getName() +
			" \nPlayer volume: " + getVolume() +
			" \nPlaying: " + classicalMusic.getSong() +
			" \nPlaying: " + rapMusic.getSong() +
			" \nPlaying: " + rockMusic.getSong();
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
