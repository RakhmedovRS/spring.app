package ru.rakhmedov.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rakhmedov.spring.common.Genre;

/**
 * @author RakhmedovRS
 * @created 03-Nov-19
 */
@Component("computer")
public class Computer
{
	private int id;
	private MusicPlayer musicPlayer;

	@Autowired
	public Computer(MusicPlayer musicPlayer)
	{
		this.id = 1;
		this.musicPlayer = musicPlayer;
	}

	@Override
	public String toString()
	{
		System.out.println("Music player name: " + musicPlayer.getName());
		System.out.println("Music player volume: " + musicPlayer.getVolume());
		return "Computer id=" + id + ", musicPlayer=" + musicPlayer.playMusic(Genre.CLASSIC) + ", "
			+ musicPlayer.playMusic(Genre.RAP) + ", " + musicPlayer.playMusic(Genre.ROCK);
	}
}
