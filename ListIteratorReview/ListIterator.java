import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Seoul");
        addInOrder(placesToVisit, "Busan");
        addInOrder(placesToVisit, "Gwangju");
        addInOrder(placesToVisit, "Sokcho");
        printList(placesToVisit);

        visit(placesToVisit);
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

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        String cityToCheck = scanner.nextLine();
        boolean flag = false;
        for (String city : cities){
            if (city.toLowerCase().equals(cityToCheck.toLowerCase())){
                flag = true;
            }
        }
        if (flag){
            System.out.println("You have visited " + cityToCheck);
        } else{
            System.out.println("You have not visited " + cityToCheck);
        }
    }

}
