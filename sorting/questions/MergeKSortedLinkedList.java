package sorting.questions;

import sorting.ListNode;

public class MergeKSortedLinkedList {
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==1){
            return lists[0];
        }
        ListNode nodeToReturned = mergeSort(lists,0,lists.length-1);
        while (nodeToReturned!=null && nodeToReturned.val==-1){
            nodeToReturned = nodeToReturned.next;
        }
        return nodeToReturned;
    }

    static ListNode mergeSort(ListNode[] listNodes, int low, int high){
        if(low>=high){
           return listNodes[low];
        }
        int mid = (low+high)/2;
        ListNode leftMerged = mergeSort(listNodes,low,mid);
        ListNode rightMerged = mergeSort(listNodes,mid+1,high);
        return mergeSort(leftMerged,rightMerged);
    }
    static ListNode mergeSort(ListNode leftMerged, ListNode rightMerged){
        ListNode dummy =null;
        ListNode temp = dummy;
        while(leftMerged!=null && rightMerged!=null){
            if (leftMerged.val <= rightMerged.val){
                if(temp == null){
                    dummy = new ListNode(leftMerged.val);
                    temp = dummy;
                }else {
                    temp.next = leftMerged;
                    temp = temp.next;
                }
                leftMerged = leftMerged.next;
            }else{
                if(temp == null){
                    dummy = new ListNode(rightMerged.val);
                    temp = dummy;
                }else {
                    temp.next = rightMerged;
                    temp = temp.next;
                }
                rightMerged =rightMerged.next;
            }
        }
        while (leftMerged!=null){
            if(temp == null){
                dummy = new ListNode(leftMerged.val);
                temp = dummy;
            }else {
                temp.next = leftMerged;
                temp = temp.next;
            }
            leftMerged = leftMerged.next;
        }
        while (rightMerged!=null){
            if(temp == null){
                dummy = rightMerged;
                temp = dummy;
            }else {
                temp.next = rightMerged;
                temp = temp.next;
            }
            rightMerged =rightMerged.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);
        ListNode[] lists = {list1, list2, list3};
        ListNode node = mergeKLists(lists);
        System.out.println(node);
    }
}
