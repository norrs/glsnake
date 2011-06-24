/**
 * @author Roy Sindre Norangshol <roy.sindre at norangshol dot no>
 *         Date: 24.06.11
 *         Time: 00:04
 */
public class World {


    private WorldListener worldListener;



    public final Snake snake;

    public World(WorldListener worldListener) {
        snake = new Snake();
        this.worldListener = worldListener;
    }






}
