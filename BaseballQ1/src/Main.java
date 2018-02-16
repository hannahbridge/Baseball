import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("player name?");
		String name = keyboard.nextLine();
		
		System.out.println("player hits?");
		int hits = keyboard.nextInt();
		
		System.out.println("player doubles?");
		int doubles = keyboard.nextInt();
		
		System.out.println("player triples?");
		int triples = keyboard.nextInt();
		
		System.out.println("player home runs?");
		int hRuns = keyboard.nextInt();
		
		System.out.println("player walks?");
		int walks = keyboard.nextInt();
		
		System.out.println("player at bats?");
		int atBats = keyboard.nextInt();
		
		System.out.println("player hits by pitch?");
		int hByPitch = keyboard.nextInt();
		
		System.out.println("player sacrifice flys?");
		int sFlys = keyboard.nextInt();
		
		BaseballStat BABERUTH = new BaseballStat(hits, atBats, walks, hByPitch, sFlys, doubles, triples, hRuns);
		
		/* Babe Ruth Stats: 
		 * 
		 * Hits: 2873
		 * AB: 8399
		 * BB: 2062
		 * HBP: 43
		 * SF: 0
		 * 2B: 506
		 * 3B: 136
		 * HR: 714
		 * 
		 */
		
		System.out.println("Statistics for " + name + ": ");
		System.out.println("hits: " + hits);
		System.out.println("at bats: " + atBats);
		System.out.println("walks: " + walks);
		System.out.println("hits by pitch: " + hByPitch);
		System.out.println("sacrifice flys: " + sFlys);
		System.out.println("doubles: " + doubles);
		System.out.println("triples: " + triples);
		System.out.println("home runs: " + hRuns);
		System.out.println("BA: " + BABERUTH.getBA());
		System.out.println("OBP: " + BABERUTH.getOBP());
		System.out.println("SLG: " + BABERUTH.getSLG());
		System.out.println("OBS: " + BABERUTH.getOBS());
		System.out.println("TB: " + BABERUTH.getTB());
		
	}
}
