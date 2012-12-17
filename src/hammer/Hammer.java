package hammer;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
import java.util.logging.Logger;


/**
 * This is the primary class for the game. Its constructor is called
 * when the game is launched.
 *
 */
public class Hammer extends SimpleApplication {
    
    /**
     * Use logger variable for printing useful statements. The logger
     * instance must be instantiated once per file (i.e., per class).
     * <br>
     * See http://jmonkeyengine.org/wiki/doku.php/jme3:advanced:logging
     * 
     */
    private static final Logger logger = Logger.getLogger(Hammer.class.getName());
    
    private Geometry geom;
    
    public static void main(String[] args) {
        Hammer app = new Hammer();
        
        app.setShowSettings(false);
        AppSettings settings = getGameSettings();
        app.setSettings(settings);
        
        app.start();
    }
    
    /**
     * Set the game settings to good values. This could include, for 
     * example, resolution and antialiasing.
     * <br>
     * See http://jmonkeyengine.org/wiki/doku.php/jme3:intermediate:appsettings
     * for more information.
     */
    public static AppSettings getGameSettings() {
        AppSettings settings = new AppSettings(true);
        settings.setTitle("Hammer");
        settings.setResolution(800, 600);
        settings.setSamples(2);
        return settings;
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(Vector3f.ZERO, 1, 1, 1);
        geom = new Geometry("Box", b);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);

        rootNode.attachChild(geom);
    }

    @Override
    public void simpleUpdate(float tpf) {
        geom.rotate(0, tpf, 0);
    }
    
}
