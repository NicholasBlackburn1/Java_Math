import com.googlecode.lanterna.*;
class Main{
    public static void main(String[] args) {
        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
        Terminal terminal = null;
try {
    terminal = defaultTerminalFactory.createTerminal();
    terminal.putCharacter('H');
    terminal.putCharacter('e');
    terminal.putCharacter('l');
    terminal.putCharacter('l');
    terminal.putCharacter('o');
    terminal.putCharacter('\n');
    terminal.flush();

}
finally{}
    }
}