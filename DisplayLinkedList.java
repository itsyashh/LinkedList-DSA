package LearnLinkedList;
import java.util.Scanner;

public class DisplayLinkedList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size(){
            // write code here
            return size;
        }

        public void display(){
            // write code here
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        String str = scn.next();
        while(str.equals("quit") == false){
            if(str.startsWith("addLast")){
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }
            str = scn.next();
        }
    }
}

