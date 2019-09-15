package IDK_Y;

public class Rows implements Runnable {
	
	
	
	
	public static  boolean rows405(int [][]suBoard){

		int [] checkArray = new int [9];
		for(int i = 0 ; i< 9;i++){
			checkArray = suBoard[i];

	//		System.out.println("==================");
	//		Arrays.sort(checkArray);
			checkArray = bubbleSort(checkArray);
			//Thread t = new Thread();-------------------------------------------add suntin like this

			if( comp(checkArray)== true){ // put in function that sorts
			//	System.out.println(false);
				//t.equals(false);------------------------------------------------add suntin like this
				return false;
			}else{
			//	System.out.println(true);
			}
			
			
		}
		//System.out.println(true);
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

	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		
	}

}
