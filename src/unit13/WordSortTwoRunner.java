package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import static java.lang.System.*;
import java.io.FileNotFoundException;
public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:/Users/Jensen/git/awayFromSchool-Unit-13-/awayFromSchool-Unit-13-/awayFromSchool-Unit-13-/src/wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			WordSortTwo w = new WordSortTwo(sentence);
			w.sort();
			System.out.println(w);
		}
	}
}