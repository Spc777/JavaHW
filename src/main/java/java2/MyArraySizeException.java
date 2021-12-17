package java2;

class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String msg) {
        super("Error array size.\n" + " " + msg);
    }
}