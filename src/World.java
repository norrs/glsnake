import com.badlogic.gdx.math.Vector3;

/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:04
 */
public class World {
    public static final float WORLD_WIDTH = 50;
    public static final float WORLD_HEIGHT = 50;

    private WorldListener worldListener;


    public final Snake snake;
    private Vector3 lastTouchpoint;

    public World(WorldListener worldListener) {
        snake = new Snake(1, 1);
        this.worldListener = worldListener;
        generateLevel();
    }

    private void generateLevel() {

    }


    public void update(float deltaTime, Vector3 touchPoint) {
        updateSnake(deltaTime, touchPoint);

        // check for Collisions here :-)
    }

    public void update(float deltaTime) {

    }


    private void updateSnake(float deltaTime, Vector3 touchPoint) {
        if (!touchPoint.equals(lastTouchpoint)) {
            lastTouchpoint = new Vector3(touchPoint);
            snake.calculateVelocity(lastTouchpoint);
        }
        snake.update(deltaTime);
    }


}
