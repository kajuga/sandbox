package Focus_Start;

import java.io.FileWriter;
import java.io.IOException;

public class GeneratorRandomCoordinates {

    public static void main(String args[]) {
        StringBuilder builder = new StringBuilder();

        try (FileWriter writer = new FileWriter("/home/kajuga/projects/sandbox/src/main/java/Focus_Start/in2.txt")) {
            for (int i = 0; i < 1000; i++) {
                for (int j = 0; j < 6; j++) {
                    int random = (int) (Math.random() * 20 - j);
                    builder.append(random).append(" ");
                }
                writer.write(String.valueOf(builder.append('\n')));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
