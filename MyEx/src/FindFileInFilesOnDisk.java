import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindFileInFilesOnDisk {
    //Поиск файлов в папках на диске.
    public static void main(String[] args) {
        ArrayList<File> fileArrayList = new ArrayList<>();
        searchFile(new File("c:\\"), fileArrayList);
        for (File file : fileArrayList) {
            System.out.println(file.getAbsoluteFile());
        }

    }
//проходим по всем файлам по папкам на диске, и ищет картинкы по условию.
    private static void searchFile(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println(rootFile.getAbsoluteFile());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFile(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
