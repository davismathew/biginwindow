package smallinwindow;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileReader;
import java.util.Scanner;

public class Inputread {
	 int size=0;
     String inputFile =  "C:\\Users\\mattdave\\workspace\\biginwindow\\input.txt";// console.next();
     File file = new File(inputFile);

     /* this function calculates the size of array*/
     public int getSize(){
		try{
				Scanner in = new Scanner(file);

		        while(in.hasNext())
		        {
		            in.next();
		            size++;
		        }
     
				in.close();
		}catch(Exception e){System.out.println("Error inside getSize : "+e);}

		return size;
	}

     /* this function reads from a file and stores values to an array storing 
      * window size at location- [0] and numbers starting from location- [1]*/
     public int[] readFile(){
 		int[] arr=new int[size];
		try {
				Scanner scan = null;
				scan = new Scanner(file);
				int j=0;
				if(scan.hasNextInt()){ // to ensure the input is integer
			        while(scan.hasNext())
			        {
			            arr[j]=scan.nextInt();
			            j++;
			        }
				}
				else {
						System.out.println("Error, please enter integers only"); 
				}
		        scan.close();
		}catch(Exception e){}
		return arr;

	}
}
