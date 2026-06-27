import java.util.*;
public class wordcountertask1
{
    public static void main(String[] args)
    {
        String[] sentence={"the", "cat", "and", "the", "dog", "and", "the", "bird"};
        HashMap<String,Integer> words=new HashMap<>();
        for(String a:sentence)
        {
            if (words.containsKey(a))
            {
                int count = words.get(a);
                words.put(a, count + 1);
            }
            else
            {
                words.put(a, 1);
            }
        }
            System.out.println(words);
    }
}
