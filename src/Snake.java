/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:08
 */
public class Snake extends DynamicGameObject{


    public static final float SNAKE_MOVE_VELOCITY = 20;
    public static final float SNAKE_WIDTH = 0.8f;
    public static final float SNAKE_HEIGHT = 0.8f;

    public static final int SNAKE_STATE_RUN = 0;
    public static final int SNAKE_STATE_GROW = 1;














    int state;
    float stateTime;

    public Snake(float x, float y) {
        super(x, y, SNAKE_WIDTH, SNAKE_HEIGHT);
        bounds.x = position.x - bounds.width / 2;
        bounds.y = position.y - bounds.height / 2;

        stateTime = 0;
    }


    public void update(float deltaTime) {

    }
}
