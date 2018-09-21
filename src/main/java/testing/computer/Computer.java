package testing.computer;

public class Computer {
    class CPU {
        private boolean isStart = false;

        public void start() {
            isStart = true;
        }

        public void shutSown() {
            isStart = false;
        }
    }

    class RAM {
    private boolean isStart = false;

    public void start() {
        isStart = true;
    }

    public void shutSown() {
        isStart = false;
    }
}
    CPU i7 = new CPU();
    RAM kingston = new RAM();
}


