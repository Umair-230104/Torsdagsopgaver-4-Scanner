// Task 1
// 1.a 
public class Main
{
	public static void main (String[] args)
	{
		// 1.g
		Team t1 = new Team ("Gryffindor", 1, "Harry Potter");
		// 1.i
		t1.setTeamRank(3);


		// 1.k 
		Team t2 = new Team ("Slytherin", 2, "Malfoy");
		Team t3 = new Team ("Rawenclaw", 5, "Cho Chang");
		Team t4 = new Team ("Hufflepuff", 4, "Cedric Diggory");
		Team t5 = new Team ("Gryffindor", 7, "Harry Potter");
		Team t6 = new Team ("Gryffindor", 6, "Harry Potter");

		//1.k
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
		
	}
}