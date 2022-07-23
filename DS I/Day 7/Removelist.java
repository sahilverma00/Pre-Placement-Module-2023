class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
			return null;

		ListNode curr = head;
		ListNode prev = null;

		while (curr != null)
		{
			if (curr.val == val)
			{
				if (prev != null)
					prev.next = curr.next;
				else
					head = head.next;
			}
			else
			{
				prev = curr;
			}
			curr = curr.next;
		}
		return head;
        
    }
}