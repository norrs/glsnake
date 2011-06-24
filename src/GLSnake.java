/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 25.06.11
 *         Time: 00:55
 */
public class GLSnake extends Game {
    @Override
    public Screen getStartScreen() {
        return new GameScreen(this);
    }

    @Override
    public void create() {
        //Settings.load();
        Assets.load();
        super.create();
    }
}
