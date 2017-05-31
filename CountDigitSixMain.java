/**
 * Created by 1002016 on 2017. 5. 31..
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

        System.out.println("countTarget isSuccess = " + (countTarget(57, 6) == 0));
        System.out.println("countTarget isSuccess = " + (countTarget(55, 6) == 0));
        System.out.println("countTarget isSuccess = " + (countTarget(1, 6) == 0));
        System.out.println("countTarget isSuccess = " + (countTarget(56, 6) == 1));
        System.out.println("countTarget isSuccess = " + (countTarget(66, 6) == 2));

        final int start = 50;
        final int end = 70;
        final int target = 6;

        System.out.println("isSuccess = " + (countTarget(start, end, target) == 12));
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
            System.out.println("i = " + i + ", target = " + target + ", count = " + count);
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
        int countDigit = maxDigit(n);
        int countTarget = 0;

        for (int digit = 1; digit <= countDigit; digit++) {
            int digitValue = getDigitValue(n, digit);

            if ((double) digitValue / target == 1) {
                countTarget ++;
            }
        }

        return countTarget;
    }

    /**
     * n 총자리의 수를 리턴한다.
     *
     * @param n
     * @return
     */
    private static int maxDigit(int n) {
        int j = n;
        int count = 0;

        while (j > 0) {
            j = j / 10;

           count++;
        }

        return count;
    }

    /**
     * n 정수의 digit 자리수 숫자를 리턴한다.
     *
     * @param n
     * @return
     */
    private static int getDigitValue(int n, int digit) {
        int count = 1;

        for (int i = 1; i < digit; i++) {
            count *= 10;
        }

        return n / count % 10;
    }
}
