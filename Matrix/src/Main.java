

import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		ReadMatrix readMatrix = new ReadMatrix("array.txt");

		WorkMatrix workSquare = new WorkMatrix(readMatrix.getMatrix());

		PrintWriter writer = new PrintWriter("src/out.txt", "UTF-8");
		int[][] matrix = readMatrix.getMatrix();
		System.out.println("ok");
		writer.print(readMatrix.toString());
		writer.println("Suma matrice= "+workSquare.SumaMatrix());
		writer.println("Pare sunt="+workSquare.Pare());
		writer.println("Impare sunt="+workSquare.imPare());
		writer.print("Numerele pare : ");
		for (int i = 0; i < workSquare.AfisPare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisPare(matrix)[i] + " ");
		}
		writer.println();
		writer.print("Numere impare : ");
		for (int i = 0; i < workSquare.AfisimPare(matrix).length; i++) 
		{
			writer.print(workSquare.AfisimPare(matrix)[i] + " ");
		}
		writer.println();
		writer.println("Minim este="+workSquare.minim());
		writer.println("Maxim este="+workSquare.maxim());
		writer.println("Patrate perfecte sunt="+workSquare.PatratPerfect());
		writer.print("Elemente patrate perfecte sunt= : ");
		for (int i = 0; i < workSquare.AfisareP(matrix).length; i++) 
		{
			writer.print(workSquare.AfisareP(matrix)[i] + " ");
		}
		writer.println();
;		writer.close();
	}
}
