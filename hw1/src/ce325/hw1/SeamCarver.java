
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.io.IOException;


public class SeamCarver {


    /*Constructors*/

    public SeamCarver(BufferedImage image) throws IOException {

    }

    public SeamCarver(File file) throws IOException {

    }


    public SeamCarver(URL url) throws IOException {

    }



    public static void main(String[] args){
        
        String image_name;

        if (args.length>0){
            image_name = args[0];
        }else{
            System.out.println("Please give image name or url: ");
            Scanner scanIn = new Scanner(System.in);
            image_name = scanIn.nextLine(); 
        } 


    }
}
