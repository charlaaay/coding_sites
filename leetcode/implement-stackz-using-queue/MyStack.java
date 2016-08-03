/*This method will provide O(n) insertions and O(1) deletions
 * 
 * 
 * Since I'm using java, I will be using a linked list,
 * but only using valid LinkedList methods( ie adding to back
 * removing from front)*/
import java.util.LinkedList;

class MyStack {
    // Push element x to the back of LinkedList.
	
	private LinkedList<Integer> q1 = new LinkedList<Integer>();
	private LinkedList<Integer> q2 = new LinkedList<Integer>();
	private LinkedList<Integer> queue = new LinkedList<Integer>();
    public void push(int x) {
        
    	if(q1.size() == 0){
    		q1.addLast(x);
    		while(q2.size()!=0){
    			q1.addLast(q2.remove());
    		}
    		queue = q1;
    	}
    	else{
    		q2.addLast(x);
    		while(q1.size()!= 0 ){
    			q2.addLast(q1.remove());
    		}
    		queue = q2;
    	}
    }

    // Removes the element from in front of LinkedList.
    public void pop() {
        
    	queue.remove();
    }

    // Get the front element.
    public int top() {
        
    	return queue.peek();
    }

    // Return whether the LinkedList is empty.
    public boolean empty() {
        
    	return queue.size() == 0 ? true : false;
    }
}
