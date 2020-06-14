import java.util.Scanner;

public class MatrixHealper {

    public int[][] readMatrix()
    {
        Scanner in = null;
        //int matrix[][];
        try{
                in = new Scanner(System.in);
                System.out.println("Enter Rows");
                int row = in.nextInt();
                System.out.println("Enter Columns");
                int column = in.nextInt();

                int matrix[][] = new int[row][column];
                System.out.println("Enter the elements of the matrix");
                for(int i=0; i<row; i++)
                    for (int j=0; j<column; j++)
                    {
                        matrix[i][j] = in.nextInt();
                    }
                return matrix;
        }catch(Exception e)
        {

        }
        return null;
    }

    public void printMatrix(int[][] matrix)
    {
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
