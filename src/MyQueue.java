/* Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() -
возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
*/

import java.util.*;
public class MyQueue {
    private LinkedList<Object> list;

    MyQueue(){
        list = new LinkedList<>();
    }

    void add(Object element) {
        list.add(element);
    }

    void enqueue(Object element) {
        list.add(element);
    }

    Object dequeue() {
        var temp = list.getFirst();
        list.removeFirst();
        return temp;
    }

    Object first() {
        return list.getFirst();
    }

    void print() {
        Iterator<Object> iterator = list.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next()).append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length()-1);
        System.out.println(stringBuilder);
    }

}
