package homework5;

public class Main {
    public static void main(String[] args) {
        LinkedList train = new LinkedList(10);
        train.push(20);
        train.push(30);
        train.push(40);
        train.push(50);
        System.out.println(train.value);
        System.out.println(train.next.value);
        System.out.println(train.next.next.value);

        System.out.println(train.length());

        train.removeByIndex(0);
        System.out.println(train.value);
        System.out.println(train.length());

        System.out.println(train.find(30));
        train.removeByValue(30);
    }

}