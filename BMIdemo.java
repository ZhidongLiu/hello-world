/**
  BMIdemo - this calculates the Body Mass Index
  and displays the results in various forms.
  @author Tim Hickey
  @version 0.0.1

*/
public class BMIdemo{

  /**
  main() tests some of the method calls
  */
  public static void main(String[] args){
    double w=165.0;
    double h=67.5;
    System.out.printf("weight=%.1f height=%.1f bmi=",w,h);
    printBMI(w,h);
    System.out.println();
  }

  /**
  *  printBMI calculates and prints the BMI from the weight and height
  *
  * @param weight the weight in pounds
  * @param height the height in inches
  */
  public static void printBMI(double weight, double height){
    double bmi = 703*weight/(height*height);
    System.out.printf("%6.1f",bmi);
  }
}e
