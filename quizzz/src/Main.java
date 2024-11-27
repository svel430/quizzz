// Partner A: Sriya Veluri
// Partner B; Medha Iyer

public class Main {
  // Partner A: Sriya Veluri
  // Partner B; Medha Iyer
  
    public static void main(String[] args)
    {
        Addition add = (num1,num2) -> {
            int sum = 0;
            for(int i = num1; i <= num2; i++)
            {
                sum+=i;
            }
            return sum;
        };

        System.out.println(add.addNumsinRange(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
    }
}