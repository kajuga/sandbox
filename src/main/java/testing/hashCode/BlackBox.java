package testing.hashCode;




    public class BlackBox {
        int varA;
        int varB;


        @Override
                public int hashCode() {
            int result;
            result = 31 * varA + varB;
            return result;
        }

        @Override
                public boolean equals(Object obj) {
            if(obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BlackBox blackBox = (BlackBox)obj;
            if(blackBox.varA != ((BlackBox) obj).varA) {
                return false;
            }
            return varB == blackBox.varB;



        }



        BlackBox(int varA, int varB){
            this.varA = varA;
            this.varB = varB;
        }


        public static void main(String[] args) {
            BlackBox object1 = new BlackBox(5, 10);
            BlackBox object2 = new BlackBox(5, 10);

            System.out.println(object1.equals(object2));
        }

    }






















/*

public class Main {
	public static void main(String[] args) {
		Object object = new Object();
		int hCode;
		hCode = object.hashCode();
		System.out.println(hCode);
	}
}

 */