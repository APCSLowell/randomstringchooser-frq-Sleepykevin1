import java.util.*;

public class RandomStringChooser
{
    private ArrayList<String> arr;

    public RandomStringChooser(String[] wordArray)
    {
        arr = new ArrayList<String>();
        for (String n : wordArray)
            arr.add(n);
    }

    public String getNext()
    {
        if (arr.size() == 0)
            return "NONE";
        int i = (int)(Math.random() * arr.size());
        return arr.remove(i);
    }
}
