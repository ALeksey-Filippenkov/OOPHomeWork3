/**
 * HomeWork3
 */
public class HomeWork3 {

    public static void main(String[] args) {
        ListNodes listNodes = new ListNodes();
        listNodes.addLast("aasd");
        listNodes.addLast(4);
        listNodes.addLast('s');
        listNodes.addFront(2462462);

        // listNodes.printList();

        for (var data : listNodes) {
            System.out.println(data);
        }
    }
}