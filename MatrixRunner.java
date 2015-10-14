public class MatrixRunner {

	private final int[] symmetricArray = {1,2,3,4,5,4,3,2,1};
	private final int[] asymmetricArray = {1,2,3,4,5,6,7,8,9};
	private final int[] zeroesArray = new int[9];
//	private final int[] zeroesArray = {0,0,0,0,0,0,0,0,0};
	
	public static void main(String[] args) {
	
//		new MatrixRunner().testConstructor();
//		new MatrixRunner().testSetElement();
//		new MatrixRunner().testSetRow();
//		new MatrixRunner().testSetColumn();
//		new MatrixRunner().testPrint();
//		new MatrixRunner().testSetMatrix();
//		new MatrixRunner().testCheckSymmetry();
		new MatrixRunner().testCheckSymmetryMultiDimensional();
		

	}

	private void testConstructor() {
	
		Matrix m = new Matrix(4,5);
		m.prettyPrint();
	}

	private void testSetElement() {
	
		Matrix m = new Matrix(4,5);
		m.setElement(2,2,-99);
		m.prettyPrint();
	}
	
	private void testSetRow() {
	
		Matrix m = new Matrix(4,5);
		m.setRow(2,"1,2,3,4,5");
		m.prettyPrint();
	}
	
	private void testSetColumn() {
	
		Matrix m = new Matrix(4,5);
		m.setColumn(2,"1,2,3,4");
		m.prettyPrint();
	}
	
	private void testPrint() {
		
		Matrix m = new Matrix(4,5);
		m.setRow(2,"1,2,3,4,5");
		m.setColumn(2,"1,2,3,4");
		m.prettyPrint();
		System.out.println(m);
	}
	
	private void testSetMatrix() {
		
		String value = "0,1,0,0,0;1,2,3,4,5;0,3,0,0,0;0,4,0,0,0";
		Matrix m = new Matrix(4,5);
		m.setMatrix(value);
		m.prettyPrint();
	}
	
	private void testCheckSymmetry() {
		
		MatrixChecker m = new MatrixChecker();
		String msg = m.isSymmetrical(symmetricArray) ? "IS symmetric" : "is NOT symmetric";
		System.out.println(msg);
		msg = m.isSymmetrical(asymmetricArray) ? "IS symmetric" : "is NOT symmetric";
		System.out.println(msg);
	}
	
	private void testCheckSymmetryMultiDimensional() {
		
		int[][] symmetricMultiArray = new int[zeroesArray.length][zeroesArray.length];
		for (int i = 0; i < zeroesArray.length; i++) {
			symmetricMultiArray[i] = zeroesArray;
		}	
		MatrixChecker m = new MatrixChecker();
		String msg = m.isSymmetrical(symmetricMultiArray) ? "IS symmetric" : "is NOT symmetric";
		System.out.println(msg);
		
		int[][] asymmetricMultiArray = new int[symmetricArray.length][symmetricArray.length];
		for (int i = 0; i < symmetricArray.length; i++) {
			asymmetricMultiArray[i] = symmetricArray;
		}	
		msg = m.isSymmetrical(asymmetricMultiArray) ? "IS symmetric" : "is NOT symmetric";
		System.out.println(msg);
	}
}