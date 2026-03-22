import java.util.*;

public class Duplicate {

    public static void main(String[] args) {

        List <Integer> booked=List.of(1,3,5);

        Duplicate dup = new Duplicate();

       int avail= dup.free(5,booked);
        System.out.println(avail);


    }
    public int free(int n,List<Integer> booked)
    {
        for (int i = 1; i <=n; i++) {
            if (!booked.contains(i))
            {
                return i;
            }

        }
        return 0;

    }

}