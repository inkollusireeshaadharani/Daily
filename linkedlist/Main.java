package linkedlist;



class Main {

	public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        
//      DLL list = new DLL();
//      list.insertFirst(3);
//      list.insertFirst(2);
//      list.insertFirst(8);
//      list.insertFirst(17);
//      list.insertLast(99);
//      list.insert(8, 65);
//
//      list.display();

		
		
		
	}

}



//LinkedList<Integer> list = new LinkedList<>();
//list.add(0);
//which is fine but we want to implement our own linkedlist
//we want to see how the add method works 