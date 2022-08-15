public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addEnd(13); //added in the end of list
        list.addEnd(14); //added in the end of list
        list.addEnd(15); //added in the end of list
        list.add(19); //added in the before of list
        list.addEnd(16); //added in the end of list
        list.add(17); //added in the before of list
        list.addElementOnIndex(5, 11); //added on six index in list
        list.addElementOnIndex(-1, 12); //index is negative number(invalid index)
        list.addElementOnIndex(8, 12); // index is bigger than size(invalid index)
        int removeElement = list.removeFirstElement(); //remove first element
        int removeElement1 = list.removeFirstElement(); //remove first element
        int removeElement2 = list.removeFirstElement(); //remove first element
        int removeElement3 = list.removeFirstElement(); //remove first element
        int removeElement4 = list.removeFirstElement(); //remove first element
        int removeElement5 = list.removeFirstElement(); //remove first element
        int removeElement6 = list.removeFirstElement(); //remove first element and size equal zero(List is empty)
        list.addEnd(21); //added in the end of list
        list.addEnd(22); //added in the end of list
        int removeLastElement = list.removeLastElement(); //remove last element
        int removeLastElement1 = list.removeLastElement(); //remove last element and size equal zero(List is empty)
        list.addEnd(31); //added in the end of list
        list.addEnd(32); //added in the end of list
        list.addEnd(33); //added in the end of list
        int removeOnSpecificIndexElement = list.removeOnSpecificIndex(1);//remove one index in the list
        int removeOnSpecificIndexElement1 = list.removeOnSpecificIndex(-1);//index is smaller than zero(Invalid index)
        int removeOnSpecificIndexElement2 = list.removeOnSpecificIndex(4);//index is bigger than size(Invalid index)
        int removeLastElement2 = list.removeLastElement(); //remove last element
        int removeLastElement3 = list.removeLastElement(); //remove last element(List is empty)
        list.addEnd(41); //added in the end of list
        list.addEnd(42); //added in the end of list
        list.addEnd(43); //added in the end of list
        int set = list.set(1, 18);
        list.addElementOnIndex(0, 10);
        list.addElementOnIndex(-1, 11);
        list.addElementOnIndex(4, 15);
        list.addElementOnIndex(6, 15);
        list.addElementOnIndex(3, 19);
        list.addElementOnIndex(2, 20);
        int removeFirst = list.removeFirstElement();
        int removeFirst1 = list.removeFirstElement();
        int removeFirst2 = list.removeFirstElement();
        int removeFirst3 = list.removeFirstElement();
        int removeLast = list.removeLastElement();
        int removeLast1 = list.removeLastElement();
        int removeLast2 = list.removeLastElement();
        int removeLast3 = list.removeLastElement();
        list.addEnd(13);
        list.addEnd(14);
        int removeOnIndex = list.removeOnSpecificIndex(0);
        int removeOnIndex1 = list.removeOnSpecificIndex(1);
        int removeOnIndex2 = list.removeOnSpecificIndex(2);
        int removeOnIndex3 = list.removeOnSpecificIndex(1);
        int removeOnIndex4 = list.removeOnSpecificIndex(0);
        int removeOnIndex5 = list.removeOnSpecificIndex(2);
        int set1 = list.set(1, 10);
        int set2 = list.set(2, 12);
        int set3 = list.set(0, 9);
        int set4 = list.set(1, 11);
        int set5 = list.set(-1, 11);
        int set6 = list.set(3, 13);
        list.addElementOnIndex(1, 10);
        list.addElementOnIndex(4, 13);
        list.addElementOnIndex(6, 15);
        int removeLast5 = list.removeLastElement();
        int removeLast6 = list.removeLastElement();
        int removeLast7 = list.removeLastElement();
        int removeLast8 = list.removeLastElement();
        list.set(5, 14);
        int removeOnSpecificIndex = list.removeOnSpecificIndex(1);
        list.addElementOnIndex(1, 11);
        int removeOnSpecificIndex1 = list.removeOnSpecificIndex(2);
        int removeOnSpecificIndex2 = list.removeOnSpecificIndex(2);
        list.set(0, 9);
        list.addElementOnIndex(0, 44);

        for (int num : list) {
            System.out.println(num);
        }
        System.out.println(list.count); //count
    }
}