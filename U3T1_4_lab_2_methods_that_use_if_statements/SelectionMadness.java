package U3T1_4_lab_2_methods_that_use_if_statements;

public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
       /* implement this method */
       int fortune = (int) (Math.random() * 5 + 1);
       if(fortune == 1) {
        return "Take a break, charge your energy!";

       }
       else if(fortune == 2) {
        return "Why sigh? Luck is at the next corner!";

       }
       else if(fortune == 3) {
        return "Nothing is better than some music after dinner time";

       }
       else if(fortune == 4) {
        return "Think deep on what you really are, be yourself!";

       }
       else if(fortune == 5) {
        return "Wave goodbye to yesterday, say hello to the next day!";

       }
       else{
        return "";

       }
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       /* implement this method */
        if(num1 >= num2) {
            if(num1 >= num3) {
            return num1;

            }
            else{
                return num3;

            }
        }
        else{
            if(num2 >= num3) {
                return num2;

            }
            else {
                return num3;
                
            }
       }
    }
    /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
    */
    public boolean rightTriangle(int side1, int side2, int side3) {
        /* implement this method */
        double c = largest(side1, side2, side3);
        double b = 0;
        double a = 0;
        if(c == side1) {
            a = side2;
            b = side3;
        }
        else if(c == side2) {
            a = side1;
            b = side3;
        }
        else{
            a = side1;
            b = side2;
        }
        double hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if(hypo == c) {
            return true;

        }
        else {
            return false;
            
        }
        

    }

  
  }
  