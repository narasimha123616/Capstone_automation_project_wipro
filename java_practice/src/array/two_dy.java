package array;

public class two_dy {
	
	    public static void main(String[] args) {
	        int[][][] arr = new int[3][4][7]; 
	        int value = 1;

	       
	        for (int i = 0; i < arr.length; i++) {       
	            for (int j = 0; j < arr[i].length; j++) {
	            	for(int k=0;k < arr[i][j].length;k++) {
	                arr[i][j][k] = value;
	                value++;
	                System.out.print(arr[i][j][k] + "\t");
	            }
	            System.out.println(); 
	        }
	            System.out.println();
	        }
	        
	      

	    }
	}


