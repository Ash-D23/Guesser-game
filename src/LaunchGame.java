
class Guesser{
	int guessNum;
	
	Guesser(int num){
		guessNum = num;
	}

}

class Player{
	
	int guessNum;
	
	Player(int num){
		guessNum = num;
	}
}

class Umpire{
	
	void CalculateResults(Player[] players, int correctguessednum) {
		int flag = 0;
		for(int i=0; i<players.length; i++) {
			if(players[i].guessNum == correctguessednum ) {
				System.out.println("Player "+ (i+1) +" is winner");
				flag =1;
			}
		}
		
		if(flag == 0) {
			System.out.println("No players won");
		}
	}
}

public class LaunchGame {

	public static void main(String[] args) {
		
		Guesser g = new Guesser(5);
		
		Player p1 = new Player(2);
		Player p2 = new Player(3);
		Player p3 = new Player(5);
		
		Player[] playerarr = {p1, p2, p3};
		
		Umpire u = new Umpire();
		u.CalculateResults(playerarr, g.guessNum);
		
	}

}
