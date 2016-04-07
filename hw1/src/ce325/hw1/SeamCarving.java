
import java.util.Scanner;

public class SeamCarving {

    public static void main(String[] args){
        
        String image_name;

        if (args.length>0){
            image_name = args[0];
        }else{
            System.out.println("Please give image name or url: ");
            Scanner scanIn = new Scanner(System.in);
            image_name = scanIn.nextLine(); 
        } 
        SeamCarver image = new SeamCarver(image_name);


    }
}
