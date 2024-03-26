import java.util.ArrayList;

public class LibraryTester {

    abstract static class Publication {
        private String title;
        private int isbn;

        public Publication(String title, int isbn) {
            this.title = title;
            this.isbn = isbn;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getIsbn() {
            return this.isbn;
        }

        public void setIsbn(int isbn) {
            this.isbn = isbn;
        }
    }

    static class Book extends Publication {
        private String author;

        public Book(String title, String author, int isbn) {
            super(title, isbn);
            this.author = author;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    static class Journal extends Publication {
        private String editorInCheif;
        private int volumn;

        public Journal(String title, String editorInCheif, int isbn, int volumn) {
            super(title, isbn);
            this.editorInCheif = editorInCheif;
            this.volumn = volumn;
        }

        public String getEditorInCheif() {
            return this.editorInCheif;
        }

        public void setEditorInCheif(String e) {
            this.editorInCheif = e;
        }

        public int getVolumn() {
            return this.volumn;
        }

        public void setVolumn(int v) {
            this.volumn = v;
        }
    }

    static class Library {
        private String name;
        private ArrayList<Publication> publications = new ArrayList<>();

        public Library(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void add(Publication p) {
            if (publications.contains(p)) {
                System.out.println("The item already exists.");
            } else {
                publications.add(p);
            }
        }

        public void remove(Publication p) {
            if (publications.contains(p)) {
                publications.remove(p);
            } else {
                System.out.println("The item does not exist.");
            }
        }

        public void listItem() {
            for (Publication p : publications) {
                System.out.println(p.getTitle());
            }
        }

        public int getSize() {
            return publications.size();
        }
    }

    public static void main(String[] args) {
        Library kmuttLib = new Library("KMUTT Library");
        Book b1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 439708184);
        Book b2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 544003415);
        Book b3 = new Book("Introduction to Java", "Y. Liang and Y. Daniel Liang", 244073613);
        Journal j11 = new Journal("nature", "Magdalena Skipper", 14764687, 575);
        Journal j12 = new Journal("nature", "Magdalena Skipper", 14764687, 576);
        Journal j13 = new Journal("nature", "Magdalena Skipper", 14764687, 577);
        Journal j21 = new Journal("Business Process Management Journal", "Majed Al-Mashari", 14637154, 25);
        Journal j22 = new Journal("Business Process Management Journal", "Majed Al-Mashari", 14637154, 26);
        Journal j23 = new Journal("Business Process Management Journal", "Majed Al-Mashari", 14637154, 27);
        kmuttLib.add(b1);
        kmuttLib.add(b2);
        kmuttLib.add(j11);
        kmuttLib.add(j12);
        kmuttLib.add(j13);
        kmuttLib.add(j21);
        kmuttLib.add(j22);
        kmuttLib.add(j23);
        kmuttLib.add(j23);
        kmuttLib.remove(j12);
        kmuttLib.remove(j22);
        kmuttLib.remove(b3);
        System.out.println("The KMUTT Library has " + kmuttLib.getSize() + ".");
        kmuttLib.listItem();
    }
}
