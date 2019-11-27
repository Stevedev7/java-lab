import java.io.*;
import java.util.*;

class FileCopy {
    public static void main(String[] args) {
        try{
            FileInputStream file1 = new FileInputStream("first.md");
            FileInputStream file2 = new FileInputStream("second.md");
            FileOutputStream result = new FileOutputStream("result.md");
            int i;
            while((i = file1.read()) != -1){
                result.write(i);
            }
            file1.close();
            while((i = file2.read()) != -1){
                result.write(i);
            }
            file2.close();
            result.close();
        }catch(FileNotFoundException e){
            System.out.println("Check for filre existance");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
