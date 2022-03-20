import java.util.ArrayList;

public class Media {

    private String name;
    private ArrayList<String> journalists;
    private double money;

    public Media(String n, ArrayList<String> j, double m)
    {
        this.name = n;
        this.journalists = j;
        this.money = m;
    }

    public String getName()
    {
        return name;
    }

    public String getJournalists()
    {
        String output = "";
       for (String v : journalists)
       {
           output = (v + "/n");
       }
       return output;
    }

    public double getMoney()
    {
        return money;
    }


}
