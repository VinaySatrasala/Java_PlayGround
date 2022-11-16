public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));;
    }
    static String interpret(String command) {
        command=command.replace("(al)","al");
        return command.replace("()", "o");
    }
}
