package ru.rakhmedov.spring.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author RakhmedovRS
 * @created 01-Nov-19
 */
public class RapMusic implements Music
{
	private static List<String> musicList;
	private static Random random;

	static
	{
		musicList = Arrays.asList("Gangstas paradise", "Lord give me a sign", "Candy shop");
		random = new Random();
	}

	private RapMusic()
	{
	}

	@Override
	public String getSong()
	{
		return musicList.get(random.nextInt(musicList.size()));
	}
}
