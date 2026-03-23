import java.util.*;

public class CodingEcs {


    public static void main(String[] args) {


        int [] arr={2,6,7,3,22};
        String message="the numbers are: ";


        try {
            for (int i = 0; i < arr.length ; i++) {
                message+=arr[i]+" ";
            }
            System.out.println(message);

            List <Integer> list= Arrays.asList(13,45,22,14,55,45);
            int maxValue=Max(list);
            System.out.println(maxValue);

            Set <Integer> set = new HashSet<>(list);
            System.out.println(set);

            int value=list.get(4);
            boolean b= checkOdd(value);

            System.out.println("the number is odd "+b);



        }
        catch (ArithmeticException ex){
            System.out.println("Index exception");

        }
        catch (Exception e){
            System.out.println("exception main");

        }
        finally {
            System.out.println("Asha-Finally");
        }

        CodingEcs demo=new CodingEcs();

        int a=demo.message.length();

        System.out.println("message length "+a);


    }



   private String message="demo message";



    private static int Max(List <Integer> list )
    {
        int max=list.get(0);
        for (int i = 0; i <list.size() ; i++) {
            if (max< list.get(i))
                max=list.get(i);
        }
        return max;
    }

    private static boolean checkOdd(int a)
    {
        boolean b=false;
        int remainder=a%2;
        if (remainder!=0)
            b=true;

        return b;
    }






}
