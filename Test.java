public class Test {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(0);
        linkedList.removeFirst();
        //1 2 3
        Node node = linkedList.get(2);
        boolean result = linkedList.set(2, 4);
        boolean result1 = linkedList.insert(2, 3);
        System.out.println(result);
        linkedList.printList();
        //        System.out.println(linkedList.removeLast());
//        System.out.println(linkedList.removeLast());
//        System.out.println(linkedList.removeLast());


//        //Find frequency of each character in a string using Java 8 streams
//        String inputString = "Java Concept Of The Day";
//        List<String> myList = new ArrayList<>(Arrays.asList(inputString.split(",")));
//
        //Find Duplicate in the Array
        //
//        int arr[] = {1, 1, 2, 3, 4, 5, 6, 7, 8, 8};
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int i : arr) {
//            int count = 1;
//            if (hm.containsKey(i)) {
//                hm.put(i, ++count);
//                System.out.println("duplicate " + i + " and its count is "+hm.get(i));
//            }
//            hm.put(i, count);
//        }
        // second highest salary of an employee
        // select salary from employee group by salary order by salary
    }
}
