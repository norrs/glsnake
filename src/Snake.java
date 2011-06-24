/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:08
 */
public class Snake extends DynamicGameObject{


    public static final float SNAKE_MOVE_VELOCITY = 20;
    public static final float SNAKE_WIDTH = 0.8f;
    public static final float SNAKE_HEIGHT = 0.8f;

    int state;
    float stateTime;

    public Snake(float x, float y, float width, float height) {
        super(x, y, width, height);
        bounds.x = position.x - bounds.width / 2;
        bounds.y = position.y - bounds.height / 2;
    }
}
