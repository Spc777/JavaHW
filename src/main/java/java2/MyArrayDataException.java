package java2;

class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String msg) {
        super("Error when converting an array element to an integer.\n" + " " + msg);
    }
}