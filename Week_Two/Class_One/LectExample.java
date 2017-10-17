

public class LectExample{

    public static void main(String[] args){

	Scanner input = new Scanner(System.out);
        System.out.printlin("How fair do you want your coin?"):
       	Coin fred = new Coin(input.nextDouble());
        final double TRIALS = 10.0;
        int success=0;
        for (int i = 1;i<=TRIALS;i++){
            int count=0;
            for (int j=0;j<5;j++){
                fred.flip();
                if (fred.isHeads())
                    count++;
            }
            if (count==5)
                success++;
        }
    System.out.println("our estimate is: " + success/TRIALS);
    }
}
        
