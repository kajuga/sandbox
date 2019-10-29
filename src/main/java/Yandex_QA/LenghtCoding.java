package Yandex_QA;

import java.io.*;

public class LenghtCoding {
    static String inputFile = "./src/resources/in.txt";
    static String outputFile = "./src/resources/out.txt";

    public static void main(String[] args) {
        try {
            String inputStr = readInputFile();
            int strLength = getEncodedStrLegth(inputStr);

            writeOutputFile(strLength);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static int getEncodedStrLegth(String str) {
        int length = 0;
        Character curChar = null;
        Character prevChar = null;
        StringBuilder curSeriesLength = new StringBuilder();

        while (str.length() > 0) {
            curChar = str.charAt(0);

            if (curChar >= '0' && curChar <= '9') {
                curSeriesLength.append(curChar);
                prevChar = null;
            } else {
                if (curSeriesLength.length() > 0) {
                    length += Integer.parseInt(curSeriesLength.toString());
                    curSeriesLength.delete(0, curSeriesLength.length());
                } else if (prevChar != null) {
                    length++;
                }

                prevChar = curChar;
            }

            if (str.length() > 1) {
                str = str.substring(1);
            } else {
                if (curSeriesLength.length() > 0) {
                    length += Integer.parseInt(curSeriesLength.toString());
                } else {
                    length++;
                }
                break;
            }
        }
        return length;
    }

    public static String readInputFile() throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
        String inputStr = null;
        inputStr = fileReader.readLine();
        fileReader.close();
        return inputStr;
    }

    public static void writeOutputFile(int length) throws IOException {
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile));

        fileWriter.write("" + length);

        fileWriter.close();
    }


}
