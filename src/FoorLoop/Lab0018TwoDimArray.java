package FoorLoop;

public class Lab0018TwoDimArray {
    public static void main(String[] args) {
        int[][] marks = {{1,2,3}, {4,5,6}, {7,8,9}};
//        marks[0][0] = 85;
//        marks[0][1] = 65;
//        marks[0][2] = 65;
//        marks[1][0] = 75;
//        marks[1][1] = 90;
//        marks[1][2] = 65;
//        marks[2][0] = 22;
//        marks[2][1] = 33;
//        marks[2][2] = 65;

        for(int i = 0 ; i <marks.length; i++)
        {
            for(int j= 0; j<marks[i].length; j++)
            {
                System.out.print(marks[i][j]);
            }
            System.out.println( );
        }

    }
}
