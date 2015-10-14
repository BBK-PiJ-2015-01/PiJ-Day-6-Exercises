public class ArrayCopier{

	//
	private int[] shortArray = new int[5];
	private int[] middleArray = new int[10];
	private int[] longArray = new int[20];
	
	
	public static void main(String[] args) {
	
		new ArrayCopier().arrayCopierRunner();
	
		
	}

	private void arrayCopierRunner() {
	

		//
		initArrays();
		resultPrinter(copy(shortArray, shortArray));
		initArrays();
		resultPrinter(copy(shortArray, middleArray));
		initArrays();
		resultPrinter(copy(shortArray, longArray));
		//
		initArrays();
		resultPrinter(copy(middleArray, shortArray));
		initArrays();
		resultPrinter(copy(middleArray, middleArray));
		initArrays();
		resultPrinter(copy(middleArray, longArray));
		//
		initArrays();
		resultPrinter(copy(longArray, shortArray));
		initArrays();
		resultPrinter(copy(longArray, middleArray));
		initArrays();
		resultPrinter(copy(longArray, longArray));
	}
	private void initArrays() {
		
		for (int i = 0; i < shortArray.length; i++ ) {
			shortArray[i] = i;
		}
		for (int i = 0; i < middleArray.length; i++ ) {
			middleArray[i] = 50 + i;
		}
		for (int i = 0; i < longArray.length; i++ ) {
			longArray[i] = 100 + i;
		}
	}
	
	public int[] copy(int[] from, int[] to) {
		
		if (from == null || to == null) {
			System.out.println("Null array(s) passed to copy method");
			return null;
		}
		if (from == to) {
			return to;
		}
		for (int i = 0; i < to.length; i++) {
				to[i] = 0;
		}
		for (int i = 0; i < from.length; i++) {
			if (i < to.length) {
				to[i] = from[i];
			} else {
				break;
			}
		}
		return to;
	}
	
	private void resultPrinter(int[] result) {

		if (result == null) {
			System.out.println("Null array passed to print method");
		}		
		System.out.print(result.length + ": ");
		for (int i : result) {
			System.out.print(" " + i);
		}
		System.out.println("");
	}
}