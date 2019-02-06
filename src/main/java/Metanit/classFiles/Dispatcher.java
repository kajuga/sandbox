package Metanit.classFiles;

import java.io.File;
import java.io.IOException;

public class Dispatcher {
    public static void main(String[] args) throws InterruptedException {

        File dir = new File(Dispatcher.class.getClassLoader().getResource("SomeDir").getPath());
        if (dir.isDirectory()) {
            System.out.println("!!!!!!!!");
        }

        File someTextRoot = new File(Dispatcher.class.getClassLoader().getResource("SomeTextRoot.txt").getPath());
        if(someTextRoot.isFile()) {
            System.out.println("YEP!");
        }

        File someText = new File(Dispatcher.class.getClassLoader().getResource("SomeDir/SomeText.txt").getPath());
        if(someText.isFile()) {
            System.out.println("НННННННН!");
        }

        System.out.println(new File("/home/kajuga/projects/sandbox/src/main/java/resources/SomeDir").exists());
        System.out.println("===============");


        File newFile = new File("/home/kajuga/projects/sandbox/src/main/java/resources/SomeDir/111.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        Thread.sleep(3000);
        System.out.println(newFile.delete());



    }



}


