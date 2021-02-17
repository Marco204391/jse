package m09.s06;

public class Main {
    public static void main(String[] args) {

        MyIntList mil = new MyIntList();

        if(!mil.isEmpty()){
            System.out.println("Inaspettato");
        }
        mil.add(23);
        mil.add(33);
        mil.addFirst(34);
        System.out.println(mil.toString());
    }


}
