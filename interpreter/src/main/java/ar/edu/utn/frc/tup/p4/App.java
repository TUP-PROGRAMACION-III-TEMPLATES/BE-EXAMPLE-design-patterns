package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        PlaybackContext context = new PlaybackContext();

        // Simulate client commands
        String command1 = "play 'Bohemian Rhapsody'";
        String command2 = "volume 75";
        String command3 = "pause";
        String command4 = "play 'Hotel California'";
        String command5 = "stop";

        System.out.println("--- Interpreting command: '" + command1 + "' ---");
        ActionInterpreter.parse(command1, context).values().forEach(expression -> expression.interpret(context));

        System.out.println("\n--- Interpreting command: '" + command2 + "' ---");
        ActionInterpreter.parse(command2, context).values().forEach(expression -> expression.interpret(context));

        System.out.println("\n--- Interpreting command: '" + command3 + "' ---");
        ActionInterpreter.parse(command3, context).values().forEach(expression -> expression.interpret(context));

        System.out.println("\n--- Interpreting command: '" + command4 + "' ---");
        ActionInterpreter.parse(command4, context).values().forEach(expression -> expression.interpret(context));

        System.out.println("\n--- Interpreting command: '" + command5 + "' ---");
        ActionInterpreter.parse(command5, context).values().forEach(expression -> expression.interpret(context));
    }
}
