package 餐馆;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/8/3 11:11
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int num = 4;
        System.out.println(binarySearch(num,a));
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
