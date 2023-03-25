public class task4 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        int y = 2001;
        b1.setYear(y);
        Author a1 = new Author();
        Author a2 = new Author();
        a2.Author("Виктор Пелевин", "Мужской", "finances@pelevin.nov.ru");
        b2.Book(a2, 1993);
        a1.setName("Михаил Елизаров");
        a1.setSex("Мужской");
        a1.setEmail("ru.elizarov@gmail.com");
        b1.setAuthor(a1);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(a1.getName());
        System.out.println(a1.getSex());
        System.out.println(a1.getEmail());
        System.out.println(a1);
        System.out.println(b1.getAuthor());
        System.out.println(b1.getYear());
        System.out.println(b1);
    }
}