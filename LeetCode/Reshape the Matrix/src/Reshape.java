public class Reshape {
    //This is my first solution
    public int[][] matrixReshapeOne(int[][] mat, int r, int c) {
        //If the demanded size of the reshape is impossible
        //we should return the original array
        int sizeOfMatrix = mat.length * mat[0].length;
        if(sizeOfMatrix != r * c)
            return mat;

        //We initialise our new matrix
        int[][] newMat = new int[r][c];
        int row = 0, col = 0;

        for (int[] ints : mat) {
            /*The idea of this loop is for us
            to loop through the ith row and the jth column
            of the original array and fill it in to the current position
            of the new matrix that we are pointing to

            The cursor of the new array is managed by row and col
            If col goes past the length of the current row we know we
            are on to the next row. So we then increment row and set col
            to 0, the start of the next row.*/
            for (int j = 0; j < ints.length && row < newMat.length; j++) {
                newMat[row][col] = ints[j];
                col++;
                if (col >= newMat[row].length) {
                    row++;
                    col = 0;
                }
            }
        }
        //This solution wil be O(n^2) in terms of time complexity
        return newMat;
    }


}
