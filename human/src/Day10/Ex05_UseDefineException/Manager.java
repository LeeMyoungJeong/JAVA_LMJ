package Day10.Ex05_UseDefineException;

public class Manager {

	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		try {
		
		storage.in(10);
		storage.out(20);

		} catch(StorageOverflowException e) {
			e.printStackTrace();
		}
}		
}
