import java.util.Scanner;

// Для использования JS функции eval аналога eval из python
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class task_3_v1 {

    public static void main( String[] args ) throws ScriptException {
        print( "\nПрограмма калькулятор, работает на основе функции eval из JS\n" );
        print( "Программа работает с операциями +, -, *, / и распознает ()...\n" );

        String expression = input( "\nВведите ниже выражение для рассчета>\nCalc $ " );

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval( expression );

        print( "\n" + expression + " = " + result + "\n\n" );
    }


    // Тест реализации Python подобной функции print (упрощенной)
    public static void print( String message ) {
        System.out.printf( message );
    }


    // Тест реализации Python подобной функции input c конвертацией в int
    public static String input( String message ) {
        Scanner iScanner = new Scanner( System.in );

        print( message );
        String result = iScanner.nextLine();

        iScanner.close();
        return result;
    }
}
