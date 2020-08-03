import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Seoul");
        placesToVisit.add("Busan");
        placesToVisit.add("Jeju Island");
        placesToVisit.add("Daegu");
        placesToVisit.add("Haenam");
        placesToVisit.add("Dokdo");

        main.printList(placesToVisit);

        placesToVisit.addFirst("Gwangju");
        main.printList(placesToVisit);

        placesToVisit.remove("Seoul");
        main.printList(placesToVisit);

    }

    public void printList(LinkedList<String> list){
        System.out.println("List of Places to Visit in Korea");
        for (int i = 0; i < list.size(); i ++){
            System.out.println("#" + (i+1) + ": " + list.get(i));
        }
    }
}
