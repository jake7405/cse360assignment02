package cse360assignment02; // assignment pkg

/**
 * @author Jacob Blackstone
 * @version 1.0
 */

 /** Class that contains various arithmetic operations */
public class AddingMachine {
  private int total;
  private String opHistory;
  
  /** 
   * Constructor, sets total to 0
   *  @return AddingMachine object
   */
  public AddingMachine () {
    total = 0;
    opHistory = "0"; 
  }
  
  /**
   * @return int value of total
   */
  public int getTotal() {
    return total;
  }
  
  /** 
   * @return void
   * @param value integer to be added to total
   */
  public void add (int value) {
    total += value;
    opHistory += " + " + value;
  }

  /**
   * @return void
   * @param value integer to be subtracted from total
   */
  public void subtract (int value) {
    total -= value;
    opHistory += " - " + value;
  }

  /**
   * @return String of operations performed
   */
  public String toString () {
    return opHistory;
  }

  /**
   * @return void
   * Clears "memory" (String of operations)
   */
  public void clear() {
    System.out.println("MEMORY CLEARED");
    opHistory = "0";
  }

  /** Main method */
  public static void main(String[] args){
   AddingMachine am = new AddingMachine();

    /** Test code */
   int i = 1;
   while(i <= 5){
    am.add(i);
    i++;
   }

   System.out.println("\nHistory: " + am.toString());
   System.out.println("Total: " + am.getTotal());

   am.subtract(3);
   System.out.println("\nHistory: " + am.toString());
   System.out.println("Total: " + am.getTotal());

   am.add(am.getTotal());
   System.out.println("\nHistory: " + am.toString());
   System.out.println("Total: " + am.getTotal());

   am.clear();
   System.out.println("\nHistory: " + am.toString());
   System.out.println("Total: " + am.getTotal());
  
  }
}

