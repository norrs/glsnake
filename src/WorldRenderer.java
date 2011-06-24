import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:22
 */
public class WorldRenderer {
    private World world;
    OrthographicCamera camera;
    SpriteBatch batch;
    TextureRegion background;
    private static final float FRUSTUM_WIDTH = 50;
    private static final float FRUSTUM_HEIGHT = 50;

    public WorldRenderer(SpriteBatch batch, World world) {

        this.batch = batch;
        this.world = world;
        this.camera = new OrthographicCamera(FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
        this.camera.position.set(FRUSTUM_WIDTH / 2, FRUSTUM_HEIGHT / 2, 0);
        this.camera.update();

    }

    public void render() {
        renderBackground();


    }

    private void renderBackground() {
        batch.disableBlending();
        batch.begin();
        batch.draw(Assets.backgroundRegion, camera.position.x - FRUSTUM_WIDTH/2, camera.position.y-FRUSTUM_HEIGHT/2, FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
        batch.end();

    }
}
