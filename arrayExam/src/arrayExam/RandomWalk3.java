package arrayExam;

public class RandomWalk3 {

	public static void main(String[] args) {
		int x = 5, y = 5;
		boolean [][] tiles = new boolean[10][10];
		int steps;
		
		tiles[5][5] = true;
		for (steps = 0; steps < 10; steps++) {
			int direction = (int)(Math.random()*4);
			
			if(direction == 0 && x > 0)
				x--;
			else if(direction == 1 && x < 9)
				x++;
			else if(direction == 2 && y > 0)
				y--;
			else if(y < 9)
				y++;
			
			tiles[x][y] = true;
//--------------------------------------------------------------------
			
			System.out.println("-----------------------------");
			for (int i = 0; i < tiles.length; i++) {
				for (int j = 0; j < tiles.length; j++) {
					if(tiles[i][j] == true)
						System.out.println("# ");
					else
						System.out.println(". ");
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
		}
		System.out.println("전체 이동 수는 : " + steps);
	}
}
