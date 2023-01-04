import java.util.Random;
import java.util.*;

public class Main {

  public static int[][] createRandom2DList(int numRows, int numCols) {
    int[][] list = new int[numRows][numCols];
    Random rand = new Random();

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        list[i][j] = rand.nextInt(101);
      }
    }

    return list;
  }
  
  public static int[][] sort2DList(int[][] list, int colIndex) {
    Arrays.sort(list, (row1, row2) -> row1[colIndex] - row2[colIndex]);
    return list;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int numRows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int numCols = sc.nextInt();

    int[][] randomList = createRandom2DList(numRows, numCols);

    for (int i = 0; i < randomList.length; i++) {
      for (int j = 0; j < randomList[i].length; j++) {
        System.out.print(randomList[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.print("Enter the column index to sort: ");
    int col = sc.nextInt();
    
    System.out.println();
    System.out.println("Here is the sorted 2D List:");
    
    int[][] sortedList = sort2DList(randomList, col);
    for (int i = 0; i < sortedList.length; i++) {
      for (int j = 0; j < randomList[i].length; j++) {
        System.out.print(randomList[i][j] + " ");
      }
      System.out.println();
    }
  }

}