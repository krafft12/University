
import java.util.Arrays;
import java.util.Scanner;

public class WorkMatrix {
	private int[][] matrix;

	public WorkMatrix(int[][] matrix) {
		this.setMatrix(matrix);
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
		
			int[] addElement(int[] org, int added) {
				int[] result = Arrays.copyOf(org, org.length + 1);
				result[org.length] = added;
				return result;
		
		
	}
	public int SumaMatrix(){
		int s = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				s=s+matrix[i][j];
			}
		}
		return s;
	}
	public int Pare(){
		int par = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]%2==0 )
						par=par+1;
				}
			}
		
		return par;
}
	public int imPare(){
		int impar = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]%2!=0 )
						impar=impar+1;
				
			}
		}
		return impar;
}
	


	public int [] AfisPare(int[][] matrix)
	{
		int temp[] = new int[0] ;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]%2==0 ) {
					temp = addElement(temp, matrix[i][j]);
				
}
		
			}
		}
		return temp; 
		
	}
	public int [] AfisimPare(int[][] matrix)
	{
		int temp[] = new int[0] ;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]%2==1 ) {
					temp = addElement(temp, matrix[i][j]);
				
}
		
			}
		}
		return temp; 
		
	}
	public int minim(){
		int min=10;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]<min)
					min=matrix[i][j];
			}
		}
		return min;
	}
		public int maxim(){
			int max=0;
					for (int i = 0; i < matrix.length; i++) {
						for (int j = 0; j < matrix.length; j++) {
							if (matrix[i][j]>max)
								max=matrix[i][j];
						}
						}
					return max;
		}
		public double PatratPerfect(){
			double p;
			int s=0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					p=Math.sqrt(matrix[i][j]);
					if (matrix[i][j]/p==p)
						s++;
				}
		}
			return s;
		} 


		public int[] AfisareP(int[][] matrix) {
			double p;
			int[] temp = new int[0];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					p = Math.sqrt(matrix[i][j]);
					if (p*p==matrix[i][j]) {
						temp = addElement(temp, matrix[i][j]);
		}
	}
			}
			return temp;
		}
		}
		
		
	
		
	
