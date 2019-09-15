package IDK_Y;

import java.sql.Array;
import java.util.Arrays;


public class correct {
	
		
	
	
	public static void main(String[] args) {
		//rows405(sudokuBoard);             
		//columns405(sudokuBoard);          
		//box405(sudokuBoard);
		//System.out.println(columns405(sudokuBoard)+"--------c");          //work alone and with the box405
		//System.out.println(box405(sudokuBoard)+"-----b");      	//work alone and with the colums405
		//System.out.println(rows405(sudokuBoard)+"-----a");      //works alone, affects the other two making them false
		System.out.println(sudokuChecker(sudokuBoard));
		

	}

	
	static int sudokuBoard[][]={
	        {5,3,4,6,7,8,9,1,2},
	        {6,7,2,1,9,5,3,4,8},
	        {1,9,8,3,4,2,5,6,7},
	        {8,5,9,7,6,1,4,2,3},
	        {4,2,6,8,5,3,7,9,1},
	        {7,1,3,9,2,4,8,5,6},
	        {9,6,1,5,3,7,2,8,4},
	        {2,8,7,4,1,9,6,3,5},
	        {3,4,5,2,8,6,1,7,9}
	        };
	
	//would have to check if all rows are equal
	//would have to check if all columns are equal
	//three by three box
	
	public static boolean sudokuChecker(int [][]suBoard){
		return false;

		
	}
	
	
	public static int[] bubbleSort(int[] array) {
	    boolean swapped = true;
	    int j = 0;
	    int tmp;
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < array.length - j; i++) {
	            if (array[i] > array[i + 1]) {
	                tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
		return array;
	}
	
	
	
	
	
}
