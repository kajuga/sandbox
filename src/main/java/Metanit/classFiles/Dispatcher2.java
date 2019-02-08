package Metanit.classFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Dispatcher2 {
    public static void main(String[] args) {
        File dir = new File((Dispatcher2.class.getClassLoader().getResource("SomeDir").getPath()));

        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            for (File file : list) {
                System.out.println(file);

            }
            System.out.println();
            String[] list2 = dir.list();
            for (String file : list2) {
                System.out.println(file);

            }
        }
        System.out.println("==============================");
        File[] directories = new File(String.valueOf(dir)).listFiles(File::isDirectory);
        for (int i = 0; i < directories.length; i++) {
            System.out.println(directories[i]);
        }
        System.out.println("==================================");

        File file = new File((Dispatcher2.class.getClassLoader().getResource("SomeDir").getPath()));
        String[] realDirectories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
            }
        });
        System.out.println(Arrays.toString(directories));


    }
}
