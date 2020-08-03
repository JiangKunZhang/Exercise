package 餐馆;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/8/3 10:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] table = new int[n];
        People[] peoples = new People[m];
        for (int i = 0; i < n; i++) {
            table[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int money = sc.nextInt();
            People people = new People(num, money);
            peoples[i] = people;
        }
        Arrays.sort(table);
        Arrays.sort(peoples, new Comparator<People>() {
            @Override
            public int compare(People p1, People p2) {
                if (p2.money != p1.money) {
                    return p2.money - p1.money;
                } else {
                    return p1.num - p2.num;
                }
            }
        });

        long value = 0L;
        int index = 0;
        boolean[] tableUsed = new boolean[n];
        for(int i = 0; i < m; i++){
            if(peoples[i].getNum() > table[n - 1])
                continue;
            index = binarySearch(peoples[i].getNum(), table);
            while(index < n && tableUsed[index] == true)
                index++;
            if(index < n){
                value += peoples[i].getMoney();
                tableUsed[index] = true;
            }
        }

        System.out.println(value);
    }

    public static int binarySearch(int num, int[] a){
        int left = 0;
        int right = a.length - 1;
        int mid = 0;
        while(left <= right){
            mid = (right + left) / 2;
            if(num <= a[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

}



class People {
    int num;
    int money;
    public People(int num, int money) {
        this.num = num;
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
