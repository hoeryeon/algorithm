reated by 1002016 on 2017. 5. 31..
 */
public class CountDigitSixMain {
    public static void main(String[] args) {
//        System.out.println("countTarget isSuccess = " + (getDigitValue(12345, 1) == 5));
//        System.out.println("countTarget isSuccess = " + (getDigitValue(12345, 2) == 4));
//        System.out.println("countTarget isSuccess = " + (getDigitValue(12345, 3) == 3));
//        System.out.println("countTarget isSuccess = " + (getDigitValue(12345, 4) == 2));
//        System.out.println("countTarget isSuccess = " + (getDigitValue(12345, 5) == 1));

//        System.out.println("maxDigit isSuccess = " + (maxDigit(4) == 1));
//        System.out.println("maxDigit isSuccess = " + (maxDigit(44) == 2));
//        System.out.println("maxDigit isSuccess = " + (maxDigit(424) == 3));
//        System.out.println("maxDigit isSuccess = " + (maxDigit(42419124) == 8));

//        System.out.println("countTarget isSuccess = " + (countTarget(57, 6) == 0));
//        System.out.println("countTarget isSuccess = " + (countTarget(55, 6) == 0));
//        System.out.println("countTarget isSuccess = " + (countTarget(1, 6) == 0));
//        System.out.println("countTarget isSuccess = " + (countTarget(56, 6) == 1));
//        System.out.println("countTarget isSuccess = " + (countTarget(66, 6) == 2));

        final int start = 50;
        final int end = 70;
        final int target = 6;

        System.out.println("isSuccess = " + (countTarget(start, end, target) == 12));
        System.out.println("isSuccess = " + (countTarget2(start, end, target) == 12));
    }

    /**
     * start ~ end 사이에 target 출현 횟수를 구한다.
     * @param start
     * @param end
     * @param target
     * @return
     */
    private static int countTarget(int start, int end, int target) {
        if (end < start) {
            return 0;
        }

        int count  = 0;

        for (int i = start; i <= end; i++) {
            count += countTarget(i, target);
        }

        return count;
    }

    /**
     * n 에 target 출현횟수를 구한다.
     *
     * @param n
     * @param target
     * @return
     */
    private static int countTarget(int n, int target) {
        int count = 0;

        while (n > 0) {
            if ((n % 10) == target) {
                count ++;
            }

            n = n / 10;
        }

        return count;
    }

    private static int countTarget2(int start, int end, int target) {
        if (end < start) {
            return 0;
        }

        int prevCount = countTarget(start, target);
        int count = prevCount;

        for (int i = start + 1;  i <= end;  i++) {
            // xxxx9 -> xxx0
            if ((i-1)%10 == 9 ) {
                prevCount = countTarget(i, target);
            }

            // count(i, target) = prevCount -1
            else if ((i - 1) % 10 == target && i % 10 != target ) {
                prevCount -= 1;
            }

            // count(i, target) = prevCount + 1
            else if ((i - 1) % 10 != target && i % 10 == target ) {
                prevCount += 1;
            }

            count += prevCount;
        }

        return count;
    }
}
