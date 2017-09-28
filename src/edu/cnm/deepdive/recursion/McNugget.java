package edu.cnm.deepdive.recursion;

public class McNugget {
  
  private static final int[] PACK_SIZES = {20, 9, 6};
  
//overload method taking and int and returning a boolean  
  public static boolean test(int n) {
    if (n < 0) {
      return false;
    }else if (n == 0) {
      return true;
    }else {
      return test (n, PACK_SIZES, 0);
    } 
  }
 // 
  private static boolean test(int n, int [] packSizes, int offset) {
    if (n < 0) {
      return false;
    }
    if (n == 0) {
      return true;
    }
    boolean trial = false;
    /**
     * int i refers to index in array, if meets true, breaks; if false calls test method
     */
    for (int i = offset; i < packSizes.length; i++) {
      trial = test(n - packSizes[i], packSizes, i);
      if(trial) {
       break;
      }
    }
      return trial;
  } 
  //to print out you would need to use a list
  public static void main(String[] args) {
   // System.out.println(test(33));
    //packSizes = new int[4];
    //packSizes [0] = 5;
    //packSizes = new int{} {5, 7, 13, 15};
    
    System.out.println(test(95, new int [] {15, 12, 8}, 0));
  }
  }


