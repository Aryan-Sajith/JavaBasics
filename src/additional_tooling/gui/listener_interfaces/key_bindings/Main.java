package additional_tooling.gui.listener_interfaces.key_bindings;

// Key Bindings = Binds an action to a KeyStroke
// Differences vs. KeyListeners:
//      Don't require you to click a component to give it focus
//      All Swing components use Key Bindings
//      Increased flexibility than KeyListeners
//      Assign keystrokes to individual components.
//      Harder to set up than KeyListener ;(

public class Main {
    public static void main(String[] args) {
        new Game();
    }
}
