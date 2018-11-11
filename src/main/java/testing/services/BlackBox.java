package testing.services;

public class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime *result + varB;
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        BlackBox temp = (BlackBox) o;
        if (varA != temp.varA) {
            return false;
        }
        if (varB != temp.varB) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        BlackBox bb1 = new BlackBox(1,5);
        BlackBox bb2 = new BlackBox(6,8);
        BlackBox bb3 = new BlackBox(1,5);
        System.out.println("bb1 хэш = " + bb1.hashCode() + "; " + "bb2 хэш = " + bb2.hashCode() + "; " + "bb3 хэш = " + bb3.hashCode());
        System.out.println("Проверка на равенство bb1 и bb2: " + bb1.equals(bb2));
        System.out.println("Проверка на равенство bb1 и bb3: " + bb1.equals(bb3));
        System.out.println(bb1.getClass());
        System.out.println(bb2.getClass());
        System.out.println(bb3.getClass());


    }
}


