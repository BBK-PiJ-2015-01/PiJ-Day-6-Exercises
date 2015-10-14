public class MatrixRunner {


	public static void main(String[] args) {
	
//		new MatrixRunner().testConstructor();
//		new MatrixRunner().testSetElement();
//		new MatrixRunner().testSetRow();
//		new MatrixRunner().testSetColumn();
//		new MatrixRunner().testPrint();
		new MatrixRunner().testSetMatrix();

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
}