import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class task_2 {

    public static void main( String[] args ) {
        print( "\nПрограмма выводит все простые числа от 1 до N\n" );

        int number = int_input( "\nВведите положительное число: " );

        List<Integer> prime_numbers = new ArrayList<>();

        if ( number > 0 ) {
            prime_numbers.add( 1 );
        } else {
            print( "\nВы ввели число меньше 1 \n\n" );
            return;
        }

        for ( int i = 2; i <= number; i++ ) {
            boolean isPrimeNumber = true;

            for ( int j = 1; j < prime_numbers.size(); j++ ) {
                if ( i % prime_numbers.get( j ) == 0 ) {
                    isPrimeNumber = false;
                    break;
                }
            }
            print( "" + isPrimeNumber );
            if ( isPrimeNumber ) {
                prime_numbers.add( i );
            }
        }

        print( "\nСписок простых чисел: " + prime_numbers + "\n\n" );
    }


    // Тест реализации Python подобной функции print (упрощенной)
    public static void print( String message ) {
        System.out.printf( message );
    }


    // Тест реализации Python подобной функции input c конвертацией в int
    public static int int_input( String message ) {
        Scanner iScanner = new Scanner( System.in );

        print( message );
        int result = iScanner.nextInt();

        iScanner.close();
        return result;
    }
}
