
public class Main {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList(null);
		list.traverse(list.getRoot());
		
		String stringdata = "1 3 7 2 0 9 4 8 6 5";
		
		String[] data = stringdata.split(" ");
		
		for(String s : data) {
			list.addItem(new Node(s));
		}
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("3"));
		list.traverse(list.getRoot());
		
		list.removeItem(new Node("6"));
		list.traverse(list.getRoot());
		
		list.removeItem(new Node("0"));
		list.removeItem(new Node("2"));
		list.removeItem(new Node("4"));
		list.traverse(list.getRoot());
		

		
	}

}
