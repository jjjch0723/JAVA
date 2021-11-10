package arrayExam;

public class TwoDim {
	public static void main(String[] args) {
//		int [][] tdim = new int [3][4];
		int[][] tdim = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		
		System.out.println(tdim.length);
		System.out.println(tdim[0].length);
		
		for (int i = 0; i < tdim.length; i++) {
			for (int j = 0; j < tdim[0].length; j++) {
				System.out.print("tdim["+i+"]["+j+"] = " + tdim[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
