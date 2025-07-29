
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// #1, For Loops://
public class Main {
  public static void main(String[] args) {
    System.out.println("For Loop");
    int NUMBER = 1;
    for (int i = 2; i < 20; i++) {
      int total = (NUMBER + i);
      System.out.println(NUMBER + " + " + i + " = " + total);
    }

    //#2, While Loops://
    System.out.println("While Loop");
    int j = 2;
    while (j < 20) {
      int total2 = (NUMBER + j);
      System.out.println(NUMBER + " + " + j + " = " + total2);
      j++;
    }
    
    //#3, Nested Loops://
    System.out.println("Nested Loop");
    for (int k = 1; k <= 2; k++) {
      System.out.println("OUTER LOOP:" + k);
      for (int l = 1; l <= 3; l++) {
        System.out.println("INNER LOOP:" + l);
        System.out.println("k:" + k + " l:" + l);
        System.out.println(k * l + " ");
      }
    }
    
    //#4, Star Pattern Loop://
    System.out.println("Star Pattern");
    for (int STAR = 1; STAR <= 10; STAR++) {
      for (int STAR2 = 1; STAR2 <= 12; STAR2++) {
        System.out.print(STAR * STAR2 + " * ");
      }
      System.out.println(); // New line after each row
    }
  }
}

// @Test
