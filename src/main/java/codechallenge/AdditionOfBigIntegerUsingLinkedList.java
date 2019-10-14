// perform sum of two big integer number stored in the linked list.
class Scratch15 {
    public static void main(String[] args) {
        MyLinkedList<Integer> number1 = new MyLinkedList<>();
        number1.addFirst(9);
        number1.addFirst(8);
        number1.addFirst(9);
        number1.addFirst(6);
        number1.printList();

        MyLinkedList<Integer> number2 = new MyLinkedList<>();
        number2.addFirst(9);
        number2.addFirst(9);
        number2.addFirst(9);

        number2.printList();
        final MyLinkedList result = MyLinkedList.addTwoNumbers(number1, number2);
        result.printList();
    }
}


class MyLinkedList<T> {

    private Node<T> head;
    
    public MyLinkedList() {
    }

    public static MyLinkedList addTwoNumbers(MyLinkedList list1, MyLinkedList list2) {
        Node result = null;
        Node last = null;
        Node number1 = list1.head;
        Node number2 = list2.head;
        int carry = 0;
        while (number1 != null || number2 != null) {
            int sum = (number1 == null ? 0 : (int) number1.data) + (number2 == null ? 0 : (int) number2.data) + carry;
            int digit = sum % 10;
            carry = sum / 10;
            Node newNode = new Node(digit);
            if (result == null) {
                result = last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
            if (number1 != null) {
                number1 = number1.next;
            }
            if (number2 != null) {
                number2 = number2.next;
            }
        }
        if (carry > 0) {
            Node newNode = new Node(carry);
            last.next = newNode;
        }
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = result;
        return myLinkedList;
    }

    public void addFirst(T data) {
        if (head == null) {
            head = new Node(data, head);
        } else {
            Node newNode = new Node(data, head);
            head = newNode;
        }
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.printf("%d <- ", temp.data);
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println(temp.data);
        }
    }

    static class Node<T> {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
        }
    }

}
