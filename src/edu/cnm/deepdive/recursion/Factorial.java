package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

/**
 * 
 * @author paulaschultz
 *
 */
public class Factorial {
  /**recursive method 
   * 
  */
  
  public static BigInteger factorial(int n) {
    return (n <= 1) ? BigInteger.ONE 
        : factorial(n-1).multiply(BigInteger.valueOf(n));
  }
  
  
}
