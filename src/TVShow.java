import java.util.ArrayList;

public class TVShow extends Media{
    private int viewers;

    public TVShow(String n, ArrayList<String> j, double m, int v) {
        super(n, j, m);
        this.viewers = v;
    }

    public int getViewers()
    {
        return viewers;
    }
}
