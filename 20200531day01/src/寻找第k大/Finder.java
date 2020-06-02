package 寻找第k大;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/31 23:35
 */
import java.util.*;

public class Finder {

    public static void quickSort(int[] array) {
        quickSortInternal(array,0,array.length - 1);
    }

    public static void quickSortInternal(int[] array,int left,int right) {
        if (left == right) {
            return;
        }
        if (left > right) {
            return;
        }
        int pivoIndex = partition(array,left,right);
        quickSortInternal(array,left,pivoIndex - 1);
        quickSortInternal(array,pivoIndex + 1,right);
    }

    public static int partition(int[] array,int left,int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            while (i < j && array[i] <= pivot) {
                i++;
            }
            Swap(array,i,j);
        }
        Swap(array,i,left);
        return i;
    }

    public static void Swap(int[] array,int i,int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int findKth(int[] a, int n, int K) {
        // write code here
        quickSort(a);
        int index = a.length - K;
        return a[index];
    }
}
