public class Main {
    public static void main(String[] args) {
       Author author1 = new Author("Михаил Юрьевич ", " Лермонтов.");
       Author author2 = new Author("Михаил Юрьевич ", " Лермонтов.");

 Book book1= new Book( "Мцири", 1832, author1);
 Book book2= new Book( "Демон", 1857, author2);


        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println(author1.equals(author2));
        System.out.println(author2.equals(author1));

        System.out.println(author1);
        System.out.println(author2);

             // System.out.println();

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book1));
        System.out.println(book1.equals(book2));

        System.out.println(book1);
        System.out.println(book2);
    }
}