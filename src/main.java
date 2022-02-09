public class main {
    public static void main (String [] args) {
        Printer a = new Printer();
        a.append1("name 1",3,"rfrrfr");
        a.append2("name 2", "ABCD");
        a.append3("name 3 ",1);
        a.print();
        a.clear();
        a.print();

    }
}
