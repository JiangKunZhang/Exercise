package DNA序列;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/20 8:33
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        int len = sc.nextInt();
        int index = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < dna.length() - len; i++) {
            count = 0;
            for (int j = i; j < i + len; j++) {
                if (dna.charAt(j) == 'G' || dna.charAt(j) == 'C') {
                    count++;
                }
            }
            if (count > max) {
                index = i;
                max = count;
            }

        }

        System.out.println(dna.substring(index,index+len));
    }
}
