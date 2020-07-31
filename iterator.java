import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        myList.add("item 1");
        myList.add("item 2");
        myList.add("item 3");
        myList.add("item 4");
        myList.add("item 5");
        myList.add("item 6");
        myList.add("item 7");
        myList.add("item 8");

        printList(myList);
    }

    public static void printList(List<String> list){
        Iterator<String> iter = list.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("==================");
    }
}
//
