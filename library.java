public class library {
    static class Book {
        private String title;
        private String author;
        private int year;
    
        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    
        public String getAuthor() {
            return author;
        }
    
        public void setAuthor(String author) {
            this.author = author;
        }
    
        public int getYear() {
            return year;
        }
    
        public void setYear(int year) {
            this.year = year;
        }
    
        public void displayDetails() {
            System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
        }
    }
    
    static class PrintedBook extends Book {
        private int pages;
    
        public PrintedBook(String title, String author, int year, int pages) {
            super(title, author, year);  
            this.pages = pages;
        }
    
        public int getPages() {
            return pages;
        }
    
        public void setPages(int pages) {
            this.pages = pages;
        }
    
        @Override
        public void displayDetails() {
            super.displayDetails();  
            System.out.println("Pages: " + pages);
        }
    }
    
    static class Ebook extends Book {
        private double fileSize;
    
        public Ebook(String title, String author, int year, double fileSize) {
            super(title, author, year);  
            this.fileSize = fileSize;
        }
    
        public double getFileSize() {
            return fileSize;
        }
    
        public void setFileSize(double fileSize) {
            this.fileSize = fileSize;
        }
    
        @Override
        public void displayDetails() {
            super.displayDetails(); 
            System.out.println("File Size: " + fileSize + " MB");
        }
    }
    
    static class AudioBook extends Book {
        private double duration;
    
        public AudioBook(String title, String author, int year, double duration) {
            super(title, author, year);  
            this.duration = duration;
        }
    
        public double getDuration() {
            return duration;
        }
    
        public void setDuration(double duration) {
            this.duration = duration;
        }
    
        @Override
        public void displayDetails() {
            super.displayDetails();  
            System.out.println("Duration: " + duration + " hours");
        }
    }
    
    public static void main(String[] args) {
        Book printedBook = new PrintedBook("Java Programming", "James Gosling", 1995, 500);
        Book ebook = new Ebook("Learn Java", "Herbert Schildt", 2020, 5.6);
        Book audioBook = new AudioBook("The Java Story", "John Doe", 2018, 8.5);

        printedBook.displayDetails();
        System.out.println("---------------------------");

        ebook.displayDetails();
        System.out.println("---------------------------");

        audioBook.displayDetails();
    }
}
