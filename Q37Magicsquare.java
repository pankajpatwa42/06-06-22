package Assignment0606;

import java.util.Scanner;

public class Q37Magicsquare {
	
	
	public static void isSquareMagic(int mat[][],int size)
	{
		int sumd1 = 0,sumd2 = 0;
		int rowsum =0, colsum =0 ;
		for(int i = 0;i<size;i++)
		{
			sumd1+=mat[i][i];             //left to right diagonal value
			sumd2+=mat[i][size-1-i];      //right to left diagonal value
		}
		
		for(int i = 0;i<1;i++)
		{
		
			for(int j=0;j<size;j++)
			{
//				System.out.print(mat[i][j]+" ");
				
				rowsum+=mat[i][j];   //adding row elements
				colsum+=mat[j][i];   //adding column elements
			}
			
		}
//		System.out.println(sumd1 +" "+sumd2+" "+rowsum+" "+colsum);
		System.out.println();
		if((sumd1==sumd2))
		{
			if(rowsum == colsum && colsum==sumd1)
				System.out.println("Magic Square");
			else
				System.out.println("Not a Magic Square");
			
		}else
			System.out.println("Not a Magic Square");	
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix : ");
		int size = sc.nextInt();
		int matrix[][] = new int[size][size];
		
		System.out.println("Enter the value in matrix :");
		for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					matrix[i][j] = sc.nextInt();
				}
			}
		isSquareMagic(matrix,size);
	}

}
