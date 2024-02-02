class Array implements Common{
    int [] arr = {1,2,3,4,5};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }
    private class ArrayIterator implements Iterator{
        int index=0;
        @Override
        public boolean hasNext() {
            return index < arr.length;
        }

        @Override
        public int getVal() {
            return arr[index++];
        }
    }
}