package ru.rakhmedov.spring.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class RockMusic implements Music
{
	private static List<String> musicList;
	private static Random random;

	static
	{
		musicList = Arrays.asList("Show must go on", "Love is for suckers", "Separate ways");
		random = new Random();
	}

	public RockMusic()
	{
	}

	@Override
	public String getSong()
	{
		return musicList.get(random.nextInt(musicList.size()));
	}
}
