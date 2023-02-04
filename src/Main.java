import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
    }

    static void task1() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("\nВведите элемент любого типа для занесения его в лист или нажмите Enter для окончания ввода: ");
            str = scanner.nextLine();
            if (str.equals("")) break;
            else list.add(str);
        }
        System.out.println("Введённый Вами лист имеет вид: " + list);
        Iterator<String> iterator = list.descendingIterator();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Перевёрнутый список: ");
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next()).append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length()-1);
        System.out.print(stringBuilder);
    }

    static void task2() {
            MyQueue myQueue = new MyQueue();
            myQueue.add(1);
            myQueue.add("one");
            myQueue.add(1.323);
            myQueue.add(1.414f);
            myQueue.print();

            myQueue.enqueue("last");
            myQueue.print();

            System.out.println(myQueue.dequeue());
            myQueue.print();

            System.out.println(myQueue.first());
        }

    static void task3() {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(51212);
        list.add(131);
        list.add(-3123);

        Iterator<Integer> iterator = list.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println("Сумма чисел, введённых в лист " + Arrays.toString(list.toArray()) + " равна " + sum);
    }
}