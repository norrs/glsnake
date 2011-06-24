import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GLCommon;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.LongMap;
import org.omg.PortableServer.POAManagerPackage.State;

import javax.swing.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 23.06.11
 *         Time: 23:57
 */
public class GameScreen extends Screen {
    private static final Logger log = Logger.getLogger(GameScreen.class.getName());

    private OrthographicCamera guiCam;
    private Vector3 touchPoint;
    private SpriteBatch batcher;
    private WorldListener worldListener;
    private World world;
    private WorldRenderer renderer;
    private int lastScore;
    private String scoreString;
    private GameState state;

    public GameScreen(Game game) {
        super(game);
        state = GameState.READY;
        guiCam = new OrthographicCamera(320, 480);
        guiCam.position.set(320 / 2, 480 / 2, 0);
        touchPoint = new Vector3();
        batcher = new SpriteBatch();

        worldListener = new WorldListener() {

            @Override
            public void turn(Turn turn) {

            }

            @Override
            public void crash() {

            }
        };

        world = new World(worldListener);
        renderer = new WorldRenderer(batcher, world);

        lastScore = 0;
        scoreString = String.format("SCORE: %s", lastScore);


    }

    @Override
    public void update(float deltaTime) {
        if (deltaTime > 0.1f) deltaTime = 0.1f;
        switch (state) {
            case READY:
                updateReady();
                break;
            case RUNNING:
                updateRunning(deltaTime);
                break;


        }
    }


    @Override
    public void present(float deltaTime) {
        GLCommon gl = Gdx.gl;
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        gl.glEnable(GL10.GL_TEXTURE_2D);

        renderer.render();

        guiCam.update();
        batcher.setProjectionMatrix(guiCam.combined);
        batcher.enableBlending();
        batcher.begin();
        switch (state) {
            case READY:
                presentReady();
                break;
            case RUNNING:
                presentRunning();
                break;
            case PAUSED:
                presentPaused();
                break;
            case LEVEL_END:
                presentLevelEnd();
                break;
            case GAME_OVER:
                presentGameOver();
                break;
        }
        batcher.end();
    }

    private void presentGameOver() {


    }

    private void presentLevelEnd() {
        //To change body of created methods use File | Settings | File Templates.
    }

    private void presentPaused() {
        //To change body of created methods use File | Settings | File Templates.
    }

    private void presentRunning() {
        //To change body of created methods use File | Settings | File Templates.
    }

    private void presentReady() {
        //To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public void pause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void dispose() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private void updateReady() {
        if (Gdx.input.justTouched())
            state = GameState.RUNNING;
    }

    private void updateRunning(float deltaTime) {
        if (Gdx.input.justTouched()) {
            guiCam.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0));
            log.log(Level.INFO, String.format("Current touchPoint %s", touchPoint.toString()));
        }


    }
}
