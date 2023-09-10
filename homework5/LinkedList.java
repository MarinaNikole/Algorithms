package homework5;
public class LinkedList {
    int value;
    LinkedList next;

    public LinkedList(int value){
        this.value = value;
        this.next = null;
    }
    public void push (int value){
       LinkedList current = this;
        while (current.next!=null){
            current = current.next;
        }
        current.next = new LinkedList(value);
    }

    public int length() {
        int count =1;
      LinkedList current = this;
        while (current.next!=null){
            current = current.next;
            count++;
        }
        return count;
    }

    public void removeByIndex(int index) {
        if (index < 0 || index > this.length()) {
            System.out.println("Wrong index");
            LinkedList current = this;
        }
        if (index == 0) {
            this.value = this.next.value;
            this.next = this.next.next;
            return;
        }
       LinkedList current = this;
        for (int i=1;i<index;i++){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public boolean find (int value){
       LinkedList current = this;
        while (current!=null){
            if (current.value==value)
                return true;
            current = current.next;
        }
        return false;
    }

    public void removeByValue(int value) {
        if (!this.find(value)) {
            System.out.println("The value can't be found");return;}
        if (this.value == value) {
            this.value = this.next.value;
            this.next = this.next.next;
            return;
        }
        LinkedList current = this;
        while (current.next.value!=value){
            current=current.next;
        }
        current.next = current.next.next;
    }

}