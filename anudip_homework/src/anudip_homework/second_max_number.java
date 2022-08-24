package anudip_homework;
import java.util.Arrays;


public class second_max_number {
	
	public static void main(String[] args) {
		
		int second_max=0;
		
	//initialization and declaration
	  int arr[]= {78,12,96,56,23,45,65,98};
	  
	  //sort array
       Arrays.sort(arr); 
      
       for(int i=0;i<arr.length;i++)
       {
    	 //After sorting check array length -1 
    	  if(arr[i]!=arr[arr.length-1])
    		  
    	   {
    		  
    		//assign the value in second_largest
    		  second_max=arr[i];
    	   }
       }
       
     //print second maximum number from array.
       System.out.println("The second maximum number is: "+ second_max);
	}

}
