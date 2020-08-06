import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Seoul");
        addInOrder(placesToVisit, "Busan");
        addInOrder(placesToVisit, "Gwangju");
        addInOrder(placesToVisit, "Sokcho");
        printList(placesToVisit);
    }


    private static void printList(List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList ,String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int elementToCompare = stringListIterator.next().compareTo(newCity);
            if (elementToCompare == 0){
                System.out.println("Input City already exists in the list!");
                return false;
            } else if (elementToCompare > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
