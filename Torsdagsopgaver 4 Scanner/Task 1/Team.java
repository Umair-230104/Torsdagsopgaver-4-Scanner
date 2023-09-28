// 1.b
public class Team
{

// 1.c
private String teamName; 
// 1.d
private int teamRank; 
//1.e
private String namesOfPlayer;
	
	//1.f
	public Team (String teamName, int teamRank, String namesOfPlayer)
	{
		this.teamName = teamName;
		this.teamRank = teamRank;
		this.namesOfPlayer = namesOfPlayer; 
	}
			

		//1.h
		public int getTeamRank()
		{
			return teamRank;
		}

		public void setTeamRank(int teamRank)
		{
			this.teamRank = teamRank;
		}

		// 1.j
		public String toString ()
		{
			return "Hold: " + teamName + ", Rang: " + teamRank;

		}

}	

