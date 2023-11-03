class matrix{//to define class named amtrix
public static void main(String args[]){// The main method, the entry point of the program
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};// Define a 2D array called 'matrix' and initialize it with values
for (int i = 0; i < matrix.length; i++) {// Outer loop: Iterate through the rows of the matrix
    for (int j = 0; j < matrix[i].length; j++) {// Inner loop: Iterate through the columns of the current row
        System.out.print(matrix[i][j] + " "); // Print the current element in the matrix followed by a space
    }
    System.out.println();  // Move to the next line to start a new row
}
}
}