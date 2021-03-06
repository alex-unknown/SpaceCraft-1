import java.awt.event.KeyEvent;
/**
 * Alle Tastenkürzel werden hier als static int vermerkt
 * Tastenkürzel Abfragen (mit KeyEvent e):
 * if (e.getKeyCode() == Shortcuts.move_left ) {...}
 */
public abstract class Shortcuts
{
    public static final int move_left = KeyEvent.VK_A;
    public static final int move_up = KeyEvent.VK_W;
    public static final int move_right = KeyEvent.VK_D;
    public static final int move_down = KeyEvent.VK_S;
    public static final int open_escape_menu = KeyEvent.VK_ESCAPE;
    public static final int change_space_craft = KeyEvent.VK_TAB;
}