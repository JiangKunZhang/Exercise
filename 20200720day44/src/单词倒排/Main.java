package 单词倒排;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/20 23:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] strings = s.split("[^a-zA-Z]+");
            for (int i = strings.length - 1; i >= 0; i--) {
                System.out.print(strings[i]);
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String input = scan.nextLine();
            // 第一步统一分隔符把只要不是字母的都换成空格
            char[] charArray = input.toCharArray();
            for(int i=0;i<charArray.length;i++){
                if(!isAlphaBelta(charArray[i])){
                    charArray[i]=' ';
                }
            }
            // 去掉两段的空格
            input=String.valueOf(charArray).trim();

            String[] split = input.split("\\s+");
            StringBuilder sb=new StringBuilder();
            int i;
            for( i=split.length-1;i>0;i--){
                sb.append(split[i]+" ");
            }
            sb.append(split[i]);
            System.out.println(sb.toString());
        }
    }

    public static boolean isAlphaBelta(char c){

        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            return true;
        }
        return false;
    }
}
