package q_160intersection_of_two_linked_lists;

import java.util.HashMap;

public class Solution {

    // Input: head = [3,2,0,-4], pos = 1
    // Output: true
    public void test_1() {
        System.out.println("*** Start test_1");

        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);

        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);

        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        c1.next = c2;
        c2.next = c3;

        ListNode expectedOutput = c1;
        ListNode intersectionNode = this.getIntersectionNode(a1, b1);

        if (intersectionNode != null && expectedOutput == intersectionNode)
            System.out.println("test pass: " + intersectionNode.val);
        else
            System.out.println("test not pass");

        System.out.println("*** End test_1");
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashMap<Integer, ListNode> hashMap = new HashMap<>(); // head.hashCode()
        ListNode runA = headA;
        ListNode runB = headB;

        while (runA != null) {
            hashMap.put(runA.hashCode(), runA);
            runA = runA.next;
        }

        while (runB != null) {

            if(hashMap.containsKey(runB.hashCode())) {
                return runB;
            }

            runB = runB.next;
        }

        return null;
    }

}
