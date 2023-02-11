import java.util.Scanner;


public class task_1 {
    public static void main( String[] args ) {
        print( "\nПрограмма вычисляет n-ое треугольного число и n!\n" );

        int number = int_input( "\nВведите первое число: " );

        print( "\nТреугольное число: " + triangular_numbers( number ) );
        print( "\nn! при n = " + number + " == " + factorial( number ) + "\n\n" );
    }


    // Тест реализации Python подобной функции input c конвертацией в int
    public static int int_input( String message ) {
        Scanner iScanner = new Scanner( System.in );

        print( message );
        int result = iScanner.nextInt();

        iScanner.close();
        return result;
    }


    // Тест реализации Python подобной функции print (упрощенной)
    public static void print( String message ) {
        System.out.printf( message );
    }


    // Функция рассчета суммы ряда от 1 до number
    public static int triangular_numbers( int number ) {
        return ( number * ( number + 1 ) ) / 2;
    }


    // Функция рассчета суммы ряда от 1 до number
    public static int factorial( int number ) {
        int result = 1;
        for ( int i = 1; i <= number; i++ ) {
            result *= i;
        }
        return result;
    }
}
