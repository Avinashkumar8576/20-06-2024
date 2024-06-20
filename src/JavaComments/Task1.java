package JavaComments;

public class Task1 {//class begins

	public static void main(String[] args) {//main method start
		/*
		 * Write a java program area of Rectangle and Parameter, comments entire program,
         *using java comments() */
		
		
		/*
		 *  Area of Rectangle = l*w , Parameter of Rectangle = 2*(l+w)
		 *  where l = length and w = width
		 */
        
		int l =4, w = 8 ;//values of length and width
		 
		int area = l*w ;//formula for area of rectangle
		
		int perimeter = 2*(l+w);// formula for parameter
		 
		System.out.println("Area = " + area); // print area of rectangle / output for area is 32
		
		System.out.println("Perimeter = " + perimeter);// print parameter of rectangle / output for parameter is 24
		
	}//main method end

}// class ends