package LinkedList;

public class Main {
    public static void main(String[] args) {

         Employee janeJones = new Employee("jane","jones",123);
         Employee johnDoe = new Employee("john","doe",4567);
         Employee marrySmith = new Employee("marry","smith",345);
         Employee mikeWilson = new Employee("mike","wilson",567);
         Employee nandanHegde = new Employee("nandan","hegde",888);

         EmployeeLinkedList list = new EmployeeLinkedList();
         list.addToFront(janeJones);
         list.addToFront(johnDoe);
         list.addToFront(marrySmith);
         list.addToFront(mikeWilson);
         list.addToEnd(nandanHegde);
         list.removeFromFront();
         list.removeFromEnd();


         list.printList();



    }
}
