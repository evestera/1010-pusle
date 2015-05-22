class ReverseComparator<T> implements Comparator<T> {
    final Comparator<T> cmp;

    ReverseComparator(Comparator<T> cmp) {
        this.cmp = cmp;
    }

    public int compare(T t1, T t2) {
        return cmp.compare(t2, t1);
    }
}