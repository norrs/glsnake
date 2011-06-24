import com.badlogic.gdx.math.Vector2;

/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:10
 */
public class DynamicGameObject extends GameObject {
    public final Vector2 velocity;
    public final Vector2 accel;


    public DynamicGameObject(float x, float y, float width, float height) {
        super(x,y,width,height);
        velocity = new Vector2();
        accel = new Vector2();

    }
}
