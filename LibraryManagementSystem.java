abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Item " + itemID + " checked out.");
        } else {
            System.out.println("Item " + itemID + " is already checked out.");
        }
    }

    public void checkIn() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Item " + itemID + " checked in.");
        } else {
            System.out.println("Item " + itemID + " is already checked in.");
        }
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
        System.out.println("Checked out: " + (checkedOut ? "Yes" : "No"));
    }
}

class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
    }
}

class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
}

class LibraryMember {
    private String memberID;
    private String name;

    public LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create 5 objects of the Book class
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        // Create 5 objects of the Magazine class
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        // Create 5 objects of the LibraryMember class
        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");

        // Set properties using setter methods (if available)

        // Example: Set author of book1 using a setter method
        // book1.setAuthor("New Author");

        // Call checkOut() and checkIn() methods on one of the library items
        book1.checkOut();
        book1.checkIn();

        // Display the details of all the library items and library members
        LibraryItem[] libraryItems = {book1, book2, book3, book4, book5, magazine1, magazine2, magazine3, magazine4, magazine5};
        LibraryMember[] libraryMembers = {member1, member2, member3, member4, member5};

        System.out.println("Library Items:");
        for (LibraryItem item : libraryItems) {
            item.displayItemDetails();
            System.out.println();
        }

        System.out.println("Library Members:");
        for (LibraryMember member : libraryMembers) {
            member.displayMemberDetails();
            System.out.println();
        }
    }
}
