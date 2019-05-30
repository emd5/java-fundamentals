package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linter {

    /**
     * This method prints an error whenever it finds a line that doesn’t end in a semi-colon.
     *
     * @param path the path
     * @return the string
     */
    public int linter(String path){

        int count = 0;

        try{
            Scanner sc = new Scanner(new File(path));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(!line.isEmpty() && !line.contains("{") && !line.contains("}") && !line.contains("if")
                        && !line.contains("else") && !line.contains(";")){
                    count++;
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }
}
