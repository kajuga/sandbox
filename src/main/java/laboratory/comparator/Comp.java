package laboratory.comparator;


class Comp implements Comparable {

    String str;
    int number;

    Comp(String str, int number) {
        this.str = str;
        this.number = number;
    }

    @Override
    public int compareTo(Object obj) {
        Comp entry = (Comp) obj;

        int result = this.str.compareTo(entry.str);
        if(result != 0) {
            return result;
        }

        result = this.number - entry.number;
        if(result != 0) {
            return result / Math.abs( result );
        }
        return 0;
    }
}