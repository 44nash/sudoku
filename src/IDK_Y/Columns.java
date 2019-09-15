package IDK_Y;

public class Columns {
	
	
	public static  boolean columns405(int[][] suBoard){
		int [] checkArray = new int[9];
		int k = 0;
		while(k < 9){
			for(int i =0 ; i < 9;i++){
				for(int j = 0 ; j< 1;j++){
					checkArray[i] = suBoard[i][k];
					//System.out.println(checkArray[i]+"---"+i);
				}
			}	
			//System.out.println("==================");
			//Arrays.sort(checkArray);
			checkArray = bubbleSort(checkArray);
	
			if(comp(checkArray)== true){
	//			System.out.println(false);
				return false;
			}else{
	//			System.out.println(true);
			}
			k++;
		}
	//	System.out.println(true+" final--------------");
		return true;
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
	
	public static boolean comp(int [] array){
		boolean duplicates = false;
		for(int i = 0; i < 7; i++)
		{
		   if (array[i] == array[i+1])
		   {
		      return duplicates = true;
		      
		   }
		}
		return false;
	}

}
