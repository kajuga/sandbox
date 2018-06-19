package laboratory.stack.enumz;

import java.util.Arrays;

public class EnumTesting {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Test.values()));


    }


    public enum Test {
        A1(0, 0), A2(0, 1), F7(5, 6), F8(5, 7),
        G1(6, 0), G3(6, 2), G4(6, 3), G5(6, 4);

        public final int x;
        public final int y;

        Test(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
