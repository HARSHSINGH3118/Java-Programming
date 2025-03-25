
import java.io.File;

class Fileio {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String args[]) {
        File f1 = new File("Introduction.txt");

        if (f1.exists()) {
            p("File Name: " + f1.getName());
            p("Absolute Path: " + f1.getAbsolutePath());
            p("Parent Directory: " + f1.getParent());
            p("File Size: " + f1.length() + " bytes");
            p("Readable: " + f1.canRead());
            p("Writable: " + f1.canWrite());
            p("Executable: " + f1.canExecute());
            p("Is a File: " + f1.isFile());
            p("Is a Directory: " + f1.isDirectory());
        } else {
            p("File does not exist.");
        }
    }
}
