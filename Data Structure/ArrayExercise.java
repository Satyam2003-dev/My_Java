public class ArrayExercise {

  public void arrayToUpperCase(String[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] = input[i].toUpperCase();
    }
  }
  
  public void incrementArray(int[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] = input[i] + 1;
    }
  }

  public static void main(String[] args) {
    ArrayExercise exercise = new ArrayExercise();
    
    // Test for arrayToUpperCase
    String[] stringArray = {"hello", "world", "java"};
    System.out.println("Original String Array:");
    for (String s : stringArray) {
      System.out.println(s);
    }
    
    exercise.arrayToUpperCase(stringArray);
    System.out.println("\nString Array after arrayToUpperCase:");
    for (String s : stringArray) {
      System.out.println(s);
    }
    
    // Test for incrementArray
    int[] intArray = {1, 2, 3, 4, 5};
    System.out.println("\nOriginal Integer Array:");
    for (int i : intArray) {
      System.out.println(i);
    }
    
    exercise.incrementArray(intArray);
    System.out.println("\nInteger Array after incrementArray:");
    for (int i : intArray) {
      System.out.println(i);
    }
  }
}
