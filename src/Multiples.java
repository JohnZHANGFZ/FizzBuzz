public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        int[] thePackage = {i, count};
        while (i < 1001) {
            thePackage = doFizzBuzz(i, count);
            i = thePackage[0];
            count = thePackage[1];
        }
        System.out.println(count);
    }

    public static int[] doFizzBuzz ( int i, int count){
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

        count++;

        } else if (divisibleBy3) {

        count++;

        } else if (divisibleBy5) {

        count++;

        }
        i++;
        return new int[]{i, count};
    }

}
