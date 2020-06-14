public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Matrix!");
        MatrixHealper helper = new MatrixHealper();
        int[][] matrix = helper.readMatrix();
        helper.printMatrix(matrix);
    }
}
