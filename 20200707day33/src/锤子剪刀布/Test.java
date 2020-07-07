package 锤子剪刀布;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/7 23:29
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] array = new String[n][2];
        int[] first = new int[3];//按照锤子 剪刀 布 的顺序统计胜利的次数
        int[] second = new int[3];
        int win = 0;
        int ping = 0;
        int mistake = 0;
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            array[i][0] = a;
            array[i][1] = b;
        }

        for (int i = 0; i < n; i++) {
            if(array[i][0].equals("C")&&array[i][1].equals("J") || array[i][0].equals("J")&&array[i][1].equals("B") || array[i][0].equals("B")&&array[i][1].equals("C")){
                first = func(first,array[i][0]);
                win++;
            }else if(array[i][0].equals("C")&&array[i][1].equals("C") || array[i][0].equals("J")&&array[i][1].equals("J") || array[i][0].equals("B")&&array[i][1].equals("B")){
                ping++;
            }else{
                second = func(second,array[i][1]);
                mistake++;
            }
        }

        System.out.println(win + " " + ping + " " + mistake);
        System.out.println(mistake + " " + ping + " " + win);
        judge(first);
        System.out.print(" ");
        judge(second);
        System.out.println();

    }

    public static int[] func(int[] array, String s) {
        if (s.equals("C"))
            array[0]++;
        else if (s.equals("J"))
            array[1]++;
        else if (s.equals("B"))
            array[2]++;
        return array;
    }

    public static void judge(int[] arr){
        int max=0;
        String s = "Z";
        String[] mapping = new String[] {"C","J","B"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && mapping[i].compareTo(s) < 0) {
                max = arr[i];
                s = mapping[i];
            }
        }
        System.out.print(s);
    }
}
