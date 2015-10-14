public class Matrix{

	private final int rows;
	private final int columns;
	private int[][] arrayField;
	
	private final String columnDelimiter = ",";
	private final String rowDelimiter = ";";

	public Matrix(int rows, int columns) {
		
		this.rows = rows;
		this.columns = columns;
		arrayField = new int[rows][columns];
	}
	
	public void setElement(int row, int column, int value) {
			
		if (row < 1|| column <= 1) {
			return;
		}
		if (this.rows <= row || this.columns <= column) {
			return;
		}
		arrayField[row-1][column-1] = value;
	}
	
	public void setRow(int row, String value) {
		
		if (row < 1) {
			return;
		}
		if (this.rows <= row) {
			return;
		}			
		int[] valueArray = columnBreaker(value);
		if (valueArray == null) {
			return;
		}
		arrayField[row-1] = valueArray;
	}
		
	public void setColumn(int column, String value) {
		
		if (column < 1) {
			return;
		}
		if (this.columns <= column) {
			return;
		}			
		int[] valueArray = columnBreaker(value);
		if (valueArray == null) {
			return;
		}
		for (int i = 0; i < this.rows; i++) {
			arrayField[i][column-1] = valueArray[i];
		}
	}
	public void setMatrix(String value) {
		
		if (value == null || value.isEmpty()) {
			return;
		}
		String[] rowValues = rowBreaker(value);
		if (rowValues == null || rowValues.length == 0 ) {
			return;
		}
		for (int i = 0; i < rows; i++) {
			if (i < rowValues.length) {
				setRow(i+1, rowValues[i]);
			}
		}
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int row = 0; row < this.rows; row++) {
			
			for (int column = 0; column < this.columns; column++) {
			
				sb.append(arrayField[row][column]).append(columnDelimiter);
			}
			sb.append(rowDelimiter);
		}		
		return sb.append("]").toString();
	}
	
	public void prettyPrint() {
		
		System.out.println("");
		for (int row = 0; row < this.rows; row++) {
			StringBuilder sb = new StringBuilder();
			for (int column = 0; column < this.columns; column++) {
				
				sb.append("\t").append(arrayField[row][column]);
			}
			System.out.println(sb.toString());
		}			
	}
	
	private String[] rowBreaker(String value) {
		
		if (value == null || value.isEmpty()) {
			return null;
		}
		return value.split(rowDelimiter);
	}
	
	private int[] columnBreaker(String value) {
		
		if (value == null || value.isEmpty()) {
			return null;
		}
		String[] parsedString = value.split(columnDelimiter);
		if (parsedString == null || parsedString.length == 0) {
			return null;
		}
		//	Exception handling normally implemented here
		int[] returnValue = new int[parsedString.length];
		for (int i = 0; i < parsedString.length; i++) {
			returnValue[i] = Integer.parseInt(parsedString[i]);
		}
		return returnValue;
	}
}