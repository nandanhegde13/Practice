package LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("jane","jones",123);
        Employee johnDoe = new Employee("john","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee nandanHegde = new Employee("nandan","Hegde",6789);


        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addFront(janeJones);
        list.addFront(johnDoe);
        list.addFront(marySmith);
        list.addFront(mikeWilson);
        list.addFront(nandanHegde);


        list.printList();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.countNodes());

        list.removeFromFront();
        list.printList();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.countNodes());

    }
}
