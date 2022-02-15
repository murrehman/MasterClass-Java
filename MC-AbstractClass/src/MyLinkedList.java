
public class MyLinkedList implements NodeList {
	
	private ListItem root = null;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}
	
	public ListItem getRoot() {
		return this.root;
	}
	
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(newItem));
			if(comparison < 0) {
				//means item is greater,so in ascending move right
				if(currentItem.next() != null) {
					// continue process
					currentItem = currentItem.next();
				} else {
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					return true;
				}
			} else if(comparison  > 0) {
				//means item is less than current so move left
				if(currentItem.previous() != null) {
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
				} else {
					//means current item is root/head
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				}
				return true;
			}else {
				System.out.println(newItem.getValue() + " already presend, not added");
				return false;
			}
		}
		return false;
		
	}
	public boolean removeItem(ListItem item) {
		if(item != null) {
			System.out.println("Deleting Item "+ item.getValue());
		}
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(item));
			if(comparison == 0) {
				if(currentItem == this.root) {
					this.root = currentItem.next();
				} else {
					currentItem.previous().setNext(currentItem.next());
					if(currentItem.next() != null) {
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
			}
			else if(comparison < 0) {
					currentItem = currentItem.next();
				} else {
					return false; 
					} 
		}
		return false;
		
	}
	public void traverse(ListItem root) {
		if(root == null) {
			System.out.println("The list is Empty");
		} else {
			while(root != null) {
				System.out.println(root.getValue());
				root = root.next();
			}
		}
	}

}
