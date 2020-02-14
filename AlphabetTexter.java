import java.util.Scanner;

import javax.swing.*;

public class AlphabetTexter 
{
	JFrame frame;
	AlphabetTexter()
	{
		/*
		 * Starting GUI code elements
		 */
		frame = new JFrame();
		JButton b = new JButton("Reset AlphabetTexter Exercise");//creating instance of JButton
		JTextField inputBox = new JTextField(26);
		b.setBounds(130,100,230, 40);//x axis, y axis, width, height  
		frame.add(b);//adding button in JFrame  
		frame.setSize(400,500);//400 width and 500 height  
		frame.setLayout(null);//using no layout managers  
		frame.setVisible(true);//making the frame visible
		/*
		 * End GUI code elements
		 */
	}
	private static void Introduction()
	{
		System.out.println("Welcome to the Alphabet Texter.");
		System.out.println("This tool is designed to help you get better at typing the alphabet.");
		System.out.println("Just start typing!");
		return;
	}
	private static void Game()
	{
		System.out.println("Game Started");
		long[] timeDeltas = new long[25];
		Scanner cin = new Scanner(System.in);
		long start = System.currentTimeMillis();
		for(int i=0; i < 25; i++)
		{
			char c = cin.next().charAt(0);
			if(c != (98+i))
			{
				i--;
				System.out.println(i);
				System.out.println((int)c);
			}
			else
			{
				System.out.println("Recognized character!");
				long end = System.currentTimeMillis();
				long time = end - start;
				start = end;
				timeDeltas[i] = time;
			}
			
		}
		for(int i=0; i < 25; i++)
		{
			System.out.print((char)(i + 98));
			System.out.print(" ");
			System.out.println(timeDeltas[i]);
		}
		cin.close();
		return;
	}
	public static void main(String[] args) 
	{
		new AlphabetTexter();
		Introduction();
		Scanner cin = new Scanner(System.in);
		char c = cin.next().charAt(0);
		if(c=='a')
		{
			Game();
		}
		cin.close();
//		long start = System.currentTimeMillis();
//		// some time passes
//		long end = System.currentTimeMillis();
//		long elapsedTime = end - start;

	}

}
