package aston.com.homework_3;

public class MyMergeSort {

    public static <T extends Comparable<T>> void sort(MyArrayList<T> list) {
        if (list.size() > 1) {
            Object[] temp = new Object[list.size()];
            mergeSort(list, 0, list.size() - 1, temp);
        }
    }

    private static <T extends Comparable<T>> void mergeSort(MyArrayList<T> list, int left, int right, Object[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(list, left, mid, temp);
            mergeSort(list, mid + 1, right, temp);
            merge(list, left, mid, right, temp);
        }
    }

    private static <T extends Comparable<T>> void merge(MyArrayList<T> list, int left, int mid, int right, Object[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = list.get(i);
        }

        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (((Comparable<T>) temp[i]).compareTo((T) temp[j]) <= 0) {
                list.set(k++, (T) temp[i++]);
            } else {
                list.set(k++, (T) temp[j++]);
            }
        }

        while (i <= mid) {
            list.set(k++, (T) temp[i++]);
        }
    }
}