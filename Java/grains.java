public class GrainsOnChessboard {

    public static long grainsOnSquare(int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("Square number must be between 1 and 64.");
        }
        return 1L << (square - 1);
    }

    public static long totalGrainsOnBoard() {
        long totalGrains = 0;
        for (int square = 1; square <= 64; square++) {
            totalGrains += grainsOnSquare(square);
        }
        return totalGrains;
    }

    public static void main(String[] args) {
        int squareNumber = 5;
        System.out.println("Grains on square " + squareNumber + ": " + grainsOnSquare(squareNumber));
        System.out.println("Total grains on the chessboard: " + totalGrainsOnBoard());
    }
}
