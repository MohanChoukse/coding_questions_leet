/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = head.val;
            head = head.next;
        }
        int n = arr.length-1;
        int swap;
      

        swap = arr[k-1];
        arr[k-1] = arr[n - k + 1];
        arr[n-k+1] = swap;


if (arr.length == 0) return null;
        
     
        ListNode head2 = new ListNode(arr[0]);
        ListNode current = head2;
        
       
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        
        return head2; 
    }
    }
