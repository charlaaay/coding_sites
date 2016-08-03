/*Deletion: O(n) Insertions: O(n)
 * current state of the stack when the operation is performed
*/
import java.util.Stack;

class MyQueue {
    // Push element x to the back of LinkedList.
	
	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();
    public void push(int x) {
        
    	while(s1.size() != 0){
    		s2.push(s1.pop());
    	}
    	s2.push(x);
    	while(s2.size() != 0){
    		s1.push(s2.pop());
    	}
    }

    // Removes the element from in front of LinkedList.
    public void pop() {
        s1.pop();
    }

    // Get the front element.
    public int peek() {
        
    	return s1.peek();
    }

    // Return whether the LinkedList is empty.
    public boolean empty() {
        
    	return s1.size() == 0 ? true : false;
    }
}