package 组个最小数;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/15 22:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != 0) {
                stringBuffer.append(i);
                list.set(i, list.get(i) - 1);
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                for (int j = 0; j < list.get(i); j++) {
                    stringBuffer.append(i);
                }
            }
        }

        System.out.println(stringBuffer.toString());
    }
}
