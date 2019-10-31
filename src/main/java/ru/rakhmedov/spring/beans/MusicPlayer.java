package ru.rakhmedov.spring.beans;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class MusicPlayer
{
	private Music music;

	public MusicPlayer(Music music)
	{
		this.music = music;
	}

	public void playMusic()
	{
		System.out.println("playing " + music.getSong());
	}
}
