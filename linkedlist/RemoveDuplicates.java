package linkedlist;

public class RemoveDuplicates {

	//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	
	public Node deleteDuplicates(Node head) {
        Node temp=head;
        while(temp!=null){
        	
        	//if i use if statement 1,1,1 returns 1,1 instead of 1
        	//because in the next statement im updating 
        	//temp=temp.next after temp.next=temp.next.next;
        	//that means after the 1st 1....im going to the third 1 
        	//because of  temp.next=temp.next.next;
        	//now the if condition becomes false for the third 1
        	//therefore it is still present in the LL
        	//the solution is to stay on the first 1 itself and remove all the 1's
        	//after removal only i should go to next number
        	//therefore use a loop
        	//or put temp=temp.next in else condition
        	//that way it only gets updated when they are not equal
        	
        	//temp.next!=null becuz we cant access temp.next.val if it is null
        	//to avoid runtime error
            while(temp.next!=null && temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
            
            //or
            
            //Node temp=head;
            //while(temp!=null && temp.next!=null  ){
            //   if( temp.val==temp.next.val){
            //      temp.next=temp.next.next;
            //   }
            //   else
            //   {
            //      temp=temp.next;
            //   }
            //                
            //}
            //return head;
            
        }
        return head;
    }
}

class Node {
	int val;
	Node next;
	
	Node(){
		
	}
	
	Node(int val){ 
		this.val = val; 
	}
	
	Node(int val, Node next){
		this.val = val; this.next = next;
	}
}



