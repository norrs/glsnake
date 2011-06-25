import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


import java.lang.reflect.GenericDeclaration;

/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 25.06.11
 *         Time: 00:45
 */
public class Assets {
    public static Texture background;
    public static TextureRegion backgroundRegion;

    public static Texture snake;
    public static TextureRegion snakeRegion;


    public static Texture loadTexture(String file) {
        return new Texture(Gdx.files.internal(file));
    }

    public static void load() {
        background = loadTexture("data/background.png");
        backgroundRegion = new TextureRegion(background, 0,0, 320, 480);
        snake = loadTexture("data/snake.png");
        snakeRegion = new TextureRegion(snake, 0,0, 16,16);


    }
}
