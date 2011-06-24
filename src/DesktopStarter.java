import com.badlogic.gdx.backends.jogl.JoglApplication;

/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 23.06.11
 *         Time: 23:47
 */
public class DesktopStarter  {
    public static void main(String[] args) {
        new JoglApplication(new Game(), "GL SNaKE", 320, 480, false);
    }
}
