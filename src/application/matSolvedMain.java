package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class matSolvedMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n;i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
			
		}
		
		int count = 0;
		List<Integer> negNum = new ArrayList<>();
		
		
		for (int i=0; i<n;i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					count++;
					negNum.add(mat[i][j]);
					
				}
			}
			
		}
		
		System.out.println("Negative Numbers: " + count);
		System.out.println("Negatives: " + negNum);
		
		sc.close();

	}

}
