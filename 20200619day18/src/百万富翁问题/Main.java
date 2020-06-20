package 百万富翁问题;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/20 8:52
 */
public class Main {
    public static void main(String[] args) {
        int rich = 0;
        int poor = 1;
        int money = 0;
        for (int i = 0; i < 30; i++) {
            rich += 10;
            money += poor;
            poor =  poor * 2;
        }
        System.out.println(rich + " " + money);
    }
}
