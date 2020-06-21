package 成绩排序;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/21 21:34
 */

class Student {
    private int score;
    private String name;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


public class Main {

    public static void bubbleSortUp(Student[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].getScore() > array[j+1].getScore()) {
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void bubbleSortDown(Student[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].getScore() < array[j+1].getScore()) {
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void swap(Student[] array, int i, int j) {
        Student tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int type = sc.nextInt();
            sc.nextLine();
            Student[] array = new Student[n];
            for (int i = 0; i < n; i++) {

                String name = sc.next();
                int score = sc.nextInt();
                Student student = new Student(name, score);
                array[i] = student;
            }
            if (type == 0) {
                bubbleSortDown(array);
            } else {
                bubbleSortUp(array);
            }
            for (Student student : array) {
                System.out.println(student.getName() + " " + student.getScore());
            }
        }
    }
}
