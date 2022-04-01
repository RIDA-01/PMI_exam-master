import java.util.ArrayList;

public class Matrix {

    public static int[] indexOfFirstNonZero(int[][] matrix) {
        int[] index = new int [2] ;

      for(int i=0; i < matrix.length; i++) {
          for (int j=0; j < matrix.length; j++) {
              if (matrix[i][j] != 0) {
                  index[0]=i;
                  index[1]=j;
                return index;
              }
          }
      }

        return index;
    }

    public static ArrayList<Integer> getMinimumOfRows(int[][] matrix) {

        ArrayList<Integer> rows = new ArrayList<>();

        for(int i=0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j=1; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rows.add(min);
        }
        return rows;
    }

}
