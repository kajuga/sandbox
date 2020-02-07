package testing.filesExploration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) throws IOException, InterruptedException {
//        Path newfile = Files.createFile(Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/111.txt"));
//        Path newfile2 = Files.createFile(Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/222.txt"));
//        Path newfile3 = Files.createFile(Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/333.txt"));
//        Path newDirectory = Files.createDirectory(Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/SASHOK"));
//        Thread.sleep(5000);
//        Files.move(newfile, Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/SASHOK/111.txt"));
//        Files.move(newfile2, Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/SASHOK/222.txt"));
//        Files.move(newfile3, Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/SASHOK/333.txt"));

//        Stream<String> stream = Files.lines(Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/SASHOK/111.txt"));
//        List<String> result = stream.filter(line -> line.startsWith("tr"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        result.forEach(System.out::println);

        Files.walkFileTree(Paths.get("/home/kajuga/projects/sandbox/src/main/java/testing/filesExploration/SASHOK/"), new MyFileVisitor());


    }





}
