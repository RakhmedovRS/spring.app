package ru.rakhmedov.spring.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author RakhmedovRS
 * @created 06-Nov-19
 */
public class DanceMusic implements Music
{
	private static List<String> musicList;
	private static Random random;

	static
	{
		musicList = Arrays.asList("Light between us", "Last train to Moscow", "Witchcraft");
		random = new Random();
	}

	public DanceMusic()
	{
	}

	@Override
	public String getSong()
	{
		return musicList.get(random.nextInt(musicList.size()));
	}
}
