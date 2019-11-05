package ru.rakhmedov.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import ru.rakhmedov.spring.common.Genre;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class MusicPlayer
{
	private Music rock;
	private Music classical;
	private Music rap;
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;

	@Autowired
	public MusicPlayer(@Qualifier("rockMusic") Music rock,
	                   @Qualifier("classicalMusic") Music classical,
	                   @Qualifier("rapMusic") Music rap)
	{
		this.rock = rock;
		this.classical = classical;
		this.rap = rap;
	}

	public String playMusic(Genre genre)
	{
		switch (genre)
		{
			case RAP:
				return "Playing: " + rap.getSong();
			case ROCK:
				return "Playing: " + rock.getSong();
			case CLASSIC:
				return "Playing: " + classical.getSong();
			default:
				throw new UnsupportedOperationException("Such value is not supported");
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
