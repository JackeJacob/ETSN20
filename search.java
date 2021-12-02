import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class search {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(args[1]));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase();
            if(line.contains(args[0])){
                System.out.println(line);
            }
        }
    }
}
