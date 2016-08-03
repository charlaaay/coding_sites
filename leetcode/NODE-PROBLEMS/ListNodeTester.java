public class ListNodeTester
{


	public static void main(String[] args) { 
		//test_reverseList();
		test_addList();
	}

	protected static void test_reverseList() {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		ListNode result = node1.reverseList(node1);
	//	System.out.println("test");
		int i = 0;
		while(result != null){
			System.out.println(result.val);
			result = result.next;

		}		
	}

	protected static void test_addList() {

		int[] testList1 = {5,5,5,2,2,3,6,3,6};
		int[] testList2 = {5,3,4,9,7,9,2,6,9,1};

		//1962979435 + 636322555 = 2599301990
		
		ListNode node1_1 = new ListNode(5);
		ListNode node1_2 = new ListNode(5);
		ListNode node1_3 = new ListNode(5);
		ListNode node1_4 = new ListNode(2);
		ListNode node1_5 = new ListNode(2);
		ListNode node1_6 = new ListNode(3);
		ListNode node1_7 = new ListNode(6);
		ListNode node1_8 = new ListNode(3);
		ListNode node1_9 = new ListNode(6);

		node1_1.next = node1_2;
		node1_2.next = node1_3;
		node1_3.next = node1_4;
		node1_4.next = node1_5;
		node1_5.next = node1_6;
		node1_6.next = node1_7;
		node1_7.next = node1_8;
		node1_8.next = node1_9;

		ListNode node2_0 = new ListNode(5);
		ListNode node2_1 = new ListNode(3);
		ListNode node2_2 = new ListNode(4);
		ListNode node2_3 = new ListNode(9);
		ListNode node2_4 = new ListNode(7);
		ListNode node2_5 = new ListNode(9);
		ListNode node2_6 = new ListNode(2);
		ListNode node2_7 = new ListNode(6);
		ListNode node2_8 = new ListNode(9);
		ListNode node2_9 = new ListNode(1);

		node2_0.next = node2_1;
		node2_1.next = node2_2;
		node2_2.next = node2_3;
		node2_3.next = node2_4;
		node2_4.next = node2_5;
		node2_5.next = node2_6;
		node2_6.next = node2_7;
		node2_7.next = node2_8;
		node2_8.next = node2_9;
		
		
		ListNode result = node1_1.addTwoNumbers(node1_1, node2_0);
		while(result != null){
			System.out.print(result.val + "->");
			result = result.next;
		}
	}
}