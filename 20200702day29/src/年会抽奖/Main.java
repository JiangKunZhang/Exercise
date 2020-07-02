package 年会抽奖;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/2 22:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            double a = count(n);
            double b = fun(n);
            double res = (a / b) * 100;
            System.out.println(String.format("%.2f",res)+"%");
        }
    }

    public static double fun(int n) {
        double sum=1;
        while(n>1){
            sum=sum*n;
            n--;
        }
        return sum;
    }

    private static double count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
}
