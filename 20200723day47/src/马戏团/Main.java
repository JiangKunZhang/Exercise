package 马戏团;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/23 23:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Person[] arr = new Person[n];
            for (int i = 0; i < n; i++) {
                int index = scanner.nextInt();
                arr[index - 1] = new Person(scanner.nextInt(), scanner.nextInt());
            }
            Arrays.sort(arr, new Comparator<Person>() { //由于Person类本身没有实现内部比较器Comparable接口，所以需要传入一个外部比较器Comparator
                public int compare(Person p1, Person p2) {
                    int res1 = Integer.compare(p1.height, p2.height);  //取得按身高排序的结果
                    if (res1 != 0) {
                        return res1;
                    } else {   //身高相同的情况下，按体重升序排序
                        return Integer.compare(p1.weight, p2.weight);
                    }
                }
            });
            int[] F = new int[n];
            F[0] = 1;
            int max = 0;
            for (int i = 1; i < n; i++) {
                F[i] = 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i].weight > arr[j].weight || (arr[i].weight == arr[j].weight && arr[i].height == arr[j].height)) {
                        F[i] = Math.max(F[i], F[j] + 1);
                    }
                }
                max = Math.max(max, F[i]);
            }
            System.out.println(max);
        }
    }
}

class Person {
    int weight;
    int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}
