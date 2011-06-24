import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:22
 */
public class WorldRenderer {
    private SpriteBatch batcher;
    private World world;

    public WorldRenderer(SpriteBatch batcher, World world) {

        this.batcher = batcher;
        this.world = world;
    }
}
