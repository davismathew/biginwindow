/*
____________________________*********** Question************_____________________________________
 
We have a stream of numbers coming in and we have a sliding window of size N, which slides to the right. We need to output the smallest number in every window. For example consider the following stream of numbers and a window size of 3

10 4 18 2 6 19 24 1 20 
---------------------
The output must be 

4 2 2 2 6 1 1
-------------
Your input will from a file in which the first line wi ll contain the window size N, the second line will contain a stream of numbers separated by space. You need to output the smallest numbers in each window separated by space.

Sample Input:
------ ------
3
10 4 18 2 6 19 24 1 20

Expected Output:
-------- -------
4 2 2 2 6 1 1

______________________________*********************************_______________________________

*/


package smallinwindow;

/*  Main class 'SmallInWIndow' has the main function which gets input from 'Inputread' class.
 * Input includes size of array, window size, array having input numbers.
 * It then passes array with window sliding onto 'Findsmall' class and then the smallest in each
 * window frame is stored into an output array named 'smallnum'.
 */

public class SmallInWindow {
	public static void  main(String args[]){  //main function
			Inputread ir=new Inputread();     //object of Inputread
			Findsmall fl=new Findsmall();     //object of Findsmall
			int size=ir.getSize();            //returns the size of array to be created
			int start=1,end=0;
			int numbers[]=new int[size];      //array with size 'size' created for input
			numbers=ir.readFile();            //readFile returns the array with numbers from file
			int window=numbers[0];            //window size retrieved from array
			int nofit=size-window+1;          //number of iteration required for window sliding
			int smallnum[]=new int[nofit-1];  //array to store the output numbers
		
			/* this loop runs with a complexity of O(nofit*window)
			 * O(nofit) for this loop and O(window) for loop inside findsmall()
			 */
			for(int i=1;i<nofit;i++){
				end=start+window-1;
//				System.out.println("later start is : "+start+" later end is : "+end+" later window is : "+window);
				int small=fl.findsmall(numbers,start,end);   //smallest in each window frame
//				System.out.println("The minimum values are"+small);
				smallnum[i-1]=small;
				start++;
			}

			/* ---- Printing the output ---- */
			for(int k=0;k<nofit-1;k++){
				System.out.println("The small numbers in each window are : "+smallnum[k]);
			}
		}
}
