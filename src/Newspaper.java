import java.util.ArrayList;

public class Newspaper extends Media{
    private int volNum;
    public Newspaper(String n, ArrayList<String> j, double m, int v) {
        super(n, j, m);
        this.volNum = v;
    }

    public int getVolNum()
    {
        return volNum;
    }

}
