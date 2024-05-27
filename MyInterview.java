import javax.swing.text.StyleContext;
import java.util.*;
import java.util.stream.Collectors;

public class MyInterview {
    public static void main(String[] args) {
//        int[] nums1= {4,20,16,12,8};
//        int[] nums2 = {14,18,10};
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int j : nums1) {
//            Set<Integer> differenceList = new HashSet<>();
//            for (int k : nums2) {
//                int diff = k - j;
//                differenceList.add(diff);
//
//            }
//            for (int key:differenceList){
//                if (map.containsKey(key)) {
//                    map.put(key, map.get(key) + 1);
//                } else {
//                    map.put(key, 1);
//                }
//            }
//        }
//        for (Map.Entry<Integer,Integer> en:map.entrySet()){
//            if (en.getValue() == nums1.length-2){
//                System.out.println(en.getKey());
//            }
//        }
        Queue<Integer> queue = new LinkedList<>();
        /**
         * To Add element to a queue
         * we can also use queue.add(element) but the disadvantage is it will throw exception if it fails to add element
         * whereas .offer(element) return false for unsuccessful addition
         */
        queue.offer(30);
        queue.offer(20);
        System.out.println(queue);
        /**
         * queue.poll() used for removing the first element from queue and return the element
         * queue.remove() can also be used for removing the first element but for an empty queue it will throw error
         * queue.peek() used for returning the first element of the queue.
         * queue.element() can also be used to get the first element but will throw error for empty array
         */
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        //Priority Queue
        Queue<Integer> pq = new PriorityQueue<>();
        /**
         * To Add element to a queue
         * we can also use queue.add(element) but the disadvantage is it will throw exception if it fails to add element
         * whereas .offer(element) return false for unsuccessful addition
         */
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        /**
         *Here the result would be [12,36,24,40].
         * The reason for this difference from the entry order is as priority queue implements min heap internally
         */
        System.out.println(pq);
        /*
        This will result a priority queue which will apply max heap
         */
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());


        //ArrayDeque
        /**
         * ArrayDeque also implements queue
         * the difference is it is double-sided queue such as one can add element either from first or from last
         * for peek and poll applies the same logic as the above
         */
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(60);
        ad.offerFirst(80);
        ad.offerLast(90);
        /**
         * This will print [80,60,90]
         */
        System.out.println(ad);

        //Set

        //*************
        //HashSet
        Set<Integer> set = new HashSet<>();
        set.add(33);
        set.add(23);
        set.add(34);
        set.add(90);
        set.add(23);
        System.out.println(set);
        System.out.println(set);

        //LinkedHashSet
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(33);
        linkedSet.add(34);
        System.out.println(linkedSet);

        //TreeSet
        /**
         * The difference between HashSet,LinkedHashSet and TreeSet is as treeSet uses binary tree for storing the data it returns the set in a sorted format.
         * For LinkedHashSet the data stores in the order of entered elements
         * For HashSet the order of elements keeps changing
         * The operations for HashSet and LinkedHashSet performs in O(1) and for TreeSet it takes O(logn)
         */
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(60);
        treeSet.add(50);
        treeSet.add(98);
        System.out.println(treeSet);

        /**
         * To create a set of elements of custom objects we need to implement hashCode() and equals() on the object class
         */

        new ArrayList<>(linkedSet).sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    }
}
