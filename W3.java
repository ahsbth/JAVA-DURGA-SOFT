public class W3 {
    public static void main(String[] args) {
      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[1]);
        System.out.println(myNumbers[2]);

      } catch (Exception e) {
        System.out.println("Something went wrong.");
      } 
    }
  }