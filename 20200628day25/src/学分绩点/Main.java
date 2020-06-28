package 学分绩点;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/28 22:25
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> score = new ArrayList<>(n);
        List<Integer> grate = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            score.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            grate.add(sc.nextInt());
        }
        double sumScore = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double tmp = getResult(grate.get(i)) * score.get(i);
            sumScore += tmp;
            sum += score.get(i);
        }
        System.out.printf("%.2f",sumScore / sum);
    }

    public static double getResult(int num) {
        if (num <= 100 && num >= 90) {
            return 4.0;
        }else if (num <= 89 && num >= 85) {
            return 3.7;
        }else if (num <= 84 && num >= 82) {
            return 3.3;
        }else if (num <= 81 && num >= 78) {
            return 3.0;
        }else if (num <= 77 && num >= 75) {
            return 2.7;
        }else if (num <= 74 && num >= 72) {
            return 2.3;
        }else if (num <= 71 && num >= 68) {
            return 2.0;
        }else if (num <= 67 && num >= 64) {
            return 1.5;
        }else if (num <= 63 && num >= 60) {
            return 1.0;
        }else {
            return 0;
        }
    }
}
