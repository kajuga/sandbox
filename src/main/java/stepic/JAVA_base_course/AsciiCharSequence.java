package stepic.JAVA_base_course;
/*
Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт.
По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.
Класс AsciiCharSequence должен:
    -реализовывать интерфейс java.lang.CharSequence;
    -иметь конструктор, принимающий массив байт;
    -определять методы length(), charAt(), subSequence() и toString()
Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
*/

public class AsciiCharSequence implements java.lang.CharSequence {
    byte[] charSequence;

    public AsciiCharSequence(byte[] charSequence) {
        this.charSequence = charSequence;
    }

    @Override
    public char charAt(int index) {
        return (char) charSequence[index];
    }

    @Override
    public int length() {
        return charSequence.length;
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subSeqArr = new byte[end - start];
        for (int ind = start; ind < end; ++ind) {
            subSeqArr[ind - start] = charSequence[ind];
        }
        AsciiCharSequence subSeq = new AsciiCharSequence(subSeqArr);
        return subSeq;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int ind = 0; ind < this.length(); ++ind) {
            s.append(this.charAt(ind));
        }
        return s.toString();
    }
}