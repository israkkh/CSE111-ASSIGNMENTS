package Reader;

public class Reader {
    String name;
    int Capacity;
    String[] Books;
    int bookCount;

    public Reader(String name) {
        this.name = name;
        this.Capacity = 2;
        this.Books = new String[Capacity];
        System.out.println("A new reader is created!");
    }

    public Reader(String name, int Capacity) {
        this.name = name;
        this.Capacity = Capacity;
        this.Books = new String[Capacity];
        System.out.println("A new reader is created!");
    }

    public void addBook(String book) {
        if (bookCount >= Capacity) {
            System.out.println(name + " cannot add \"" + book + "\": capacity of " + Capacity + " reached.");
            return;
        }
        Books[bookCount] = book;
        bookCount++;
       
    }

    public void updateCapacity(int newCapacity) {
        String[] newBooks = new String[newCapacity];
        int keep = Math.min(bookCount, newCapacity);
        for (int i = 0; i < keep; i++) {
            newBooks[i] = Books[i];
        }
        Books = newBooks;
        Capacity = newCapacity;
        bookCount = keep;
        System.out.println("Capacity has Changed to "  + Capacity + ".");
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + Capacity);
        System.out.println("Books ");
        if (bookCount == 0) {
            System.out.println("  No books added yet");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println("  - " + Books[i]);
            }
        }
    }
}
