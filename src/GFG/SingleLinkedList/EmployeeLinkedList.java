package LinkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;

    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
          return null;
        }
        EmployeeNode node = head;
        head = head.getNext();
        size--;
        node.setNext(null);
        return node;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        return size;
    }

    public void printList(){
       EmployeeNode current;
       current=head;
        System.out.print("Head-> ");
        while(current!=null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


    public int countNodes(){
        EmployeeNode current;
        current=head;
        int count =0;
        while(current!=null)
        {
            count++;
            current = current.getNext();
        }
       return count;
    }





}
