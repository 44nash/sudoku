package IDK_Y;

public class Box {
	
	
	public static  boolean box405(int [][]suBoard){

		int [] checkArray = new int[9];
		int across= 0;
		int across2= 3;
		int down= 0;
		int down2 = 3;
		int k=0;
		while(k < 9){      //Because of nine different checks
			int count = 0;
			if(k==3){
				across= 0;
				across2= 3;	
				down= 3;
				down2 = 6;
			}
			
			for(int i = across ; i< across2;i++){        // 0 - 3   3 - 6  6 - 9 across	
				
				for(int j = down ; j< down2;j++){    // 0-3  3 - 6  6 - 9 down
					checkArray[count] = suBoard[i][j];
	//				System.out.println(checkArray[count]+"---"+count);
					count++;
					
				}
			}	
	//		System.out.println("==================");
	
			//Arrays.sort(checkArray);
			checkArray = bubbleSort(checkArray);
	
	
			if(comp(checkArray)== true){
	//			System.out.println(false);
				return false;
			}else{
	//			System.out.println(true);
			}
			if(k<3){
				across= across + 3;
				across2= across2 + 3;

			}

			
			if(k < 6 && k>=3){

				across= across + 3;
				across2= across2 + 3;


			}
			if(k==5){
				across= 0;
				across2= 3;	
				down = 6;
				down2 = 9;
			}
			if(k < 9 && k>=6){
				across= across + 3;
				across2= across2 + 3;
			}

			
			
			k++;
		}
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


