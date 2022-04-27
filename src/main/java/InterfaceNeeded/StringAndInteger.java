package InterfaceNeeded;

class StringAndInteger implements GenericInterface<String, Integer> {

    public Integer doSomeOperations(String string){
        return Integer.parseInt(string);
    }

    public String doReverseOperations(Integer integer) {
        return integer.toString();
    }
}

class IntegerAndString implements GenericInterface<Integer, String> {

    public String doSomeOperations(Integer integer){
        return integer.toString(integer);
    }

    public Integer doReverseOperations(String string) {
        return Integer.parseInt(string);
    }
}
