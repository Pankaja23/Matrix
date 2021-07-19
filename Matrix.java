package Matrix;

public class Matrix {

    public static void main(String args[])
    {
        int i,j;
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
        int res[][] = new int[3][3];

        for ( i= 0 ; i < a.length ; i++ ){
            for ( j= 0 ; j < b.length ;j++ ){
                res[i][j] = a[i][j] + b[i][j] ;
            }

        }

        System.out.println("Sum of matrices:-");

        for ( i= 0 ; i < a.length ; i++ )
        {
            for ( j= 0 ; j < b.length ;j++ )
                System.out.print(res[i][j]+"\t");

            System.out.println();
        }

        for ( i= 0 ; i < a.length ; i++ ){
            for ( j= 0 ; j < b.length ;j++ ){
                res[i][j] = a[i][j] * b[i][j] ;
            }

        }

        System.out.println("Multiplication of matrices:-");

        for ( i= 0 ; i < a.length ; i++ )
        {
            for ( j= 0 ; j < b.length ;j++ )
                System.out.print(res[i][j]+"\t");

            System.out.println();
        }
    }

}
