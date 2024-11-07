package src;

public class Iteration {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Java is Awesome");
        }

        int x = 0;

        while(x<2) {
            System.out.println("Java is cool");
            x++;
        }

        int number = 2;

        while(number<20) {
            System.out.println("updated count" + number);
            if(number%2 == 0) {
                number = number + 5;
            }else{
                number = number -1;
            }
        }
    }
    
}
