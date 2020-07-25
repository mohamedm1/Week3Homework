public class Box {
	
	public int size = 0;
	
	public void printBox() {

		for (int i = 0; i<size; i++) { 
			for (int a = 0; a<size; a++) { 
			System.out.print("*");
	}
			System.out.println();
	}
}

public static void main(String[] args) {
	Box box= new Box();
	box.size = 5;
	box.printBox();

}

}
