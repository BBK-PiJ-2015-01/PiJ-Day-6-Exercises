public class MatrixChecker{

	
		
	public boolean isSymmetrical(int[] arg) {
		
		if (arg == null) {
			return false;
		}
		if (arg.length == 0) {
			return false;
		}
		for(int i = 0; i < arg.length; i++) {
			if (arg[i] != arg[arg.length-(1+i)]) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isSymmetrical(int[][] arg) {
		
		// Assumes array matrix is n x n
		if (arg == null) {
			return false;
		}
		if (arg.length == 0) {
			return false;
		}
		for(int i = 0; i < arg.length; i++) {
			
			for (int j = 0; j < arg[i].length; j++) {
				
				if (arg[i][j] != arg[j][i]) {
					return false;
				}
			}			
		}
		return true;
	}
	
	public boolean isTriangular(int[][] arg) {
		return false;
	}
}