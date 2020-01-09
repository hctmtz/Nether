import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

public class DirectoryFilesList {

    public static void runApp(){

        File dir = new File("K:\\Imágenes\\");
        List<String> list = Arrays.asList(dir.list(
        new FilenameFilter() {
            @Override 
            public boolean accept(File dir, String name) {
                return name.matches("(?i).*bg*");
            }
        }
        ));
        System.out.println(list);

    }
    public static void main(String args[]){
        runApp();
    }

}