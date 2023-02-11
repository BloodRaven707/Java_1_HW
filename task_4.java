import java.util.Scanner;


public class task_4 {
    public static void main( String[] args ) {
        print( "\nПрограмма проверяет может ли быть верно введенное выражение\n" );

        Scanner iScanner = new Scanner( System.in );

        print( "\nВведите выражение вида: 2? + ?5 = 69 >\n$ " );
        String expression = iScanner.nextLine();

        iScanner.close();

        String[] expression_arr = expression.split( " " );
        String q = expression_arr[ 0 ];
        String w = expression_arr[ 2 ];
        String z = expression_arr[ 4 ];
        //String operator = expression_arr[ 1 ];

        // Попытка решить через проверки не увенчалась успехом, т.к. слишком много вариантов...
        for ( int i = 0; i < 10; i++ ) {
            int qn = Integer.parseInt( q.replace( "?", Integer.toString( i ) ) );
            for ( int j = 0; j < 10; j++ ) {
                int wn = Integer.parseInt( w.replace( "?", Integer.toString( j ) ) );
                for ( int k = 0; k < 10; k++ ) {
                    int zn = Integer.parseInt( z.replace( "?", Integer.toString( k ) ) );
                    if ( qn + wn == zn ) {
                        print( "\nРешение уравнения " + qn + " + " + wn + " = " + zn + "\n\n" );
                        return;
                    }
                }
            }
        }

        print( "\nРешения нет\n\n" );
    }


    // Тест реализации Python подобной функции print (упрощенной)
    public static void print( String message ) {
        System.out.printf( message );
    }
}
