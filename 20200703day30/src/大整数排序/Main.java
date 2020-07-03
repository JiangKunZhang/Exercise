package 大整数排序;

import java.math.BigInteger;
import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/3 22:12
 */
public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        BigInteger[] arrays = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            arrays[i] = new BigInteger(s);
        }
        Arrays.sort(arrays,new Compare());

        for (int i = 0; i < n; i++) {
            System.out.println(arrays[i]);
        }
    }

    static class Compare implements Comparator<BigInteger> {

        @Override
        public int compare(BigInteger o1, BigInteger o2) {
            return o1.compareTo(o2);
        }
    }

}
