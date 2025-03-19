package aston.com.homework_3;

public class MyQuickSort {

    public static <T extends Comparable<T>> void sort(MyLinkedList<T> list) {
        if (list.size() > 1) {
            list.setHead(quickSort(list.getHead()));
        }
    }

    private static <T extends  Comparable<T>> MyLinkedList.Node<T> quickSort(MyLinkedList.Node<T> start) {
        if (start == null || start.next == null) {
            return start;
        }

        MyLinkedList.Node<T> pivot = start;
        MyLinkedList.Node<T> less = null, greater = null;
        MyLinkedList.Node<T> current = start.next;

        while (current != null) {
            MyLinkedList.Node<T> next = current.next;
            if (current.data.compareTo(pivot.data) < 0) {
                current.next = less;
                less = current;
            } else {
                current.next = greater;
                greater = current;
            }
            current = next;
        }

        less = quickSort(less);
        greater = quickSort(greater);

        pivot.next = greater;
        if (less == null) {
            return pivot;
        }

        MyLinkedList.Node<T> temp = less;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = pivot;
        return less;
    }
}
