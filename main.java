import jester.*;
import java.io.IOException;
class Main extends TApplication {
   
  public MyApplication() throws Exception {
    super(BackendType.SWING); // Could also use BackendType.XTERM

    // Create standard menus for File and Window
    addFileMenu();
    addWindowMenu();

    // Add a custom window, see below for its code.  The TWindow
    // constructor will add it to this application.
    new MyWindow(this);
    
}

public static void main(String [] args) {
    try {
        MyApplication app = new MyApplication();
        (new Thread(app)).start();
    } catch (Throwable t) {
        t.printStackTrace();
    }
}
}
    }