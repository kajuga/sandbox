package stepic.JAVA_base_course;

/**
 *  Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так,
 чтобы equals() сравнивал экземпляры ComplexNumber по содержимому полей re и im,
 а hashCode() был бы согласованным с реализацией equals().
 Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 Пример
 ComplexNumber a = new ComplexNumber(1, 1);
 ComplexNumber b = new ComplexNumber(1, 1);
 // a.equals(b) must return true
 // a.hashCode() must be equal to b.hashCode()
 */

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static void main(String[] args) {
        ComplexNumber cmn1 = new ComplexNumber(1, 1);
        ComplexNumber cmn2 = new ComplexNumber(1, 1);
        System.out.println(cmn1.equals(cmn2));
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexNumber that = (ComplexNumber) o;

        if (Double.compare(that.re, re) != 0) return false;
        return Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
