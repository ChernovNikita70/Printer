public class Printer {
    private String queue = "";
    private int PendingPagesCount = 0;
    private int printdocs = 0;

    public void append1 (String name, int pages, String text){
        queue= queue + "\n" + name + " " + pages + " " +  text;
        PendingPagesCount = PendingPagesCount + pages;
        printdocs = printdocs + pages;
        System.out.println("Документы в очереди на печать");
    }

    public void append2 (String name, String text) {
        append1(name,3, text);
    }

    public void append3 (String name, int pages) {
        append1(name,2, "" );
    }

    public void clear (){
        queue = "";
        PendingPagesCount = 0;
        System.out.println("Очередь пустая");
    }

    public void print () {
        System.out.println( " Напечатаны документы" + " Всего " + PendingPagesCount );
        clear();
    }
}
