import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Component;
import java.awt.Image;
import geom.*;
import java.awt.Graphics;
/**
 * Grafikdarstellung für einen Spieler
 */
public class Frame extends JFrame{
    private VektorI screenSize;
    private Player p;
    /**
     * Neuer Frame eines Spielers
     */
    public Frame(String name, VektorI screenSize, Player p)
    {
        //hier am besten keine weiteren Setup-Maßnahmen, es sei denn, sie sind absolut immer gleich
        super("SpaceCraft: "+name);
        this.screenSize = screenSize;
        this.p = p;
        setSize(screenSize.x,screenSize.y);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Image logo = ImageTools.get('a',"logo_s");
        if (logo!=null)setIconImage(logo);
        this.setFocusTraversalKeysEnabled(false);
    }

    /**
     * Nur zum testen
     */
    public Frame()
    {
        this("Singleplayer",new VektorI(960,640), null);
    }
    
    public VektorI getScreenSize(){
        return screenSize;
    }

    // Grafik:
    public void paint(Graphics g){
        if (p!= null && g!= null)
            p.paint(g, screenSize);
    }

}
