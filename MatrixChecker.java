public class MatrixChecker{

	
		
	public boolean isSymmetrical(int[] arg) {
		
		if (arg == null) {
			return false;
		}
		if (arg.length == 0) {
			return false;
		}
		for(int i = 0; i < arg.length; i++) {
			if ()arg[0] != arg[arg.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isSymmetrical(int[][] arg) {
		
	}
	
	public boolean isTriangular(int[][] arg) {
		
	}
}