import java.util.Scanner;


public class task_3_v2 {
    public static void main( String[] args ) {
        print( "\nПрограмма калькулятор, очень простой...\n" );

        // Не может получить System.in, если он ранее был закрыт... бяка какая...
        Scanner iScanner = new Scanner( System.in );

        print( "\nВведите первое число: " );
        int number_1  = iScanner.nextInt();

        print( "\nВведите оператор -, +, *, /: " );
        String operator = iScanner.next();

        print( "\nВведите второе число: " );
        int number_2  = iScanner.nextInt();

        iScanner.close();

        //print( "Не удобное г...." );

        // Знаю... знаю работает и без этого... но дико не удобно, после 3 лет на Python...
        if ( operator.equals( "/" ) ) {
            int result = number_1 / number_2;

            print( String.format( "\n%d %s %d = %d\n\n", number_1, operator, number_2, result ) );
        } else {
            int result = very_simple_calculator( operator, number_1, number_2 );

            print( "\n" + number_1 + " " + operator + " " + number_2 + " = " + result + "\n\n" );
        }
    }


    // метод получения результата
    static int very_simple_calculator( String operator, int number_1, int number_2 ) {
        int result = 0;

        switch ( operator ) {
            case "+":
                result = number_1 + number_2;
                break;
            case "-":
                result = number_1 - number_2;
                break;
            case "*":
                result = number_1 * number_2;
                break;
            // Тестировал...
            case "/":
                result = number_1 / number_2;
                break;
            default:
                print( "\nВведите оператор: -, +, *, /\n\n" );
                break;
        }
        return result;
    }


    // Тест реализации Python подобной функции print (упрощенной)
    public static void print( String message ) {
        System.out.printf( message );
    }
}
