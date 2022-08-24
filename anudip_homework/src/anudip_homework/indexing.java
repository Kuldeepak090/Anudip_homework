package anudip_homework;

public class indexing {
	public static void main(String[] args) {
		
		
		
   //initialization and declaration of array.	
   int array[]= {75,4,56,5,36,100,77,18,29,94};
   
   
    for(int i=0;i<array.length;i++) {
    	
    	//condition check 100 is available at which position.
    	if(array[i]==100) 
    		
    	{
    		
    		//print the index
    		System.out.print("Index of 100 is "+i);
    	}
    }
}
}
