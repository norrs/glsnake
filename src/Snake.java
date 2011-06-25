import com.badlogic.gdx.math.Vector3;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:08
 */
public class Snake extends DynamicGameObject {


    public static final float SNAKE_MOVE_VELOCITY = 10;
    public static final float SNAKE_WIDTH = 0.8f;
    public static final float SNAKE_HEIGHT = 0.8f;

    public static final int SNAKE_STATE_RUN = 0;
    public static final int SNAKE_STATE_GROW = 1;


    int state;
    float stateTime;
    private static final Logger log = Logger.getLogger(Snake.class.getName());

    public Snake(float x, float y) {
        super(x, y, SNAKE_WIDTH, SNAKE_HEIGHT);
        bounds.x = position.x - bounds.width / 2;
        bounds.y = position.y - bounds.height / 2;
        velocity.set(0.0f,0.0f);
        stateTime = 0;
    }


    public void update(float deltaTime) {
        position.add(velocity.x * deltaTime * SNAKE_MOVE_VELOCITY, velocity.y * deltaTime * SNAKE_MOVE_VELOCITY);
        bounds.x = position.x - bounds.width / 2;
        bounds.y = position.y - bounds.height / 2;
       // log.log(Level.INFO, String.format("snake position %s", position.toString()));
    }

    public void calculateVelocity(Vector3 touchPoint) {

        float xSide = touchPoint.x - position.x;
        float ySide = touchPoint.y - position.y;
        float length = (float) Math.sqrt(Math.pow(xSide, 2) + Math.pow(ySide, 2));
        velocity.x = xSide / length;
        velocity.y = ySide / length;

    }
}
