package q_141_linked_list_cycle;

import java.util.HashMap;

public class Solution {

    // Input: head = [3,2,0,-4], pos = 1
    // Output: true
    public boolean hasCycle(ListNode n) {

        HashMap<Integer, ListNode> hashMap = new HashMap<>(); // head.hashCode()

        return hasCycleHelper(n, hashMap);
    }

    private boolean hasCycleHelper(ListNode n, HashMap<Integer, ListNode> hashMap) {

        if(n == null)
            return false;

        int hashCode = n.hashCode();

        if(hashMap.containsKey(hashCode))
            return true;

        hashMap.put(hashCode, n);
        return hasCycleHelper(n.next, hashMap);
    }
}
