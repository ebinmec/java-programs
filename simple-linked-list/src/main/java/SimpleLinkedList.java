import java.lang.reflect.Array;
import java.util.*;

class SimpleLinkedList<T> {

    LinkedList<T> list = new LinkedList<>();
   SimpleLinkedList() {

    }

    SimpleLinkedList(T[] values) {
        list.addAll(Arrays.asList(values));
    }

    void push(T value) {
       list.add(value);
    }

    T pop() {
      return list.removeLast();
    }

    void reverse() {
        Collections.reverse(list);
    }

    T[] asArray(Class<T> clazz) {
        reverse();
        T[] array = (T[]) Array.newInstance(clazz, list.size());
        return list.toArray(array);
    }

    int size() {
        return list.size();
    }
}
