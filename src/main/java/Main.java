import java.util.Scanner;

class RunAgainContainer {
    public boolean bool;
}


public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner scanner = new Scanner(System.in);
        RunAgainContainer runAgain = new RunAgainContainer();

        Library library = new Library();
        runAgain.bool = true;

        while(runAgain.bool) {
            System.out.println("Hello User, lets add a book to the Library!");
            System.out.println("What is the name of the book you are adding? :");
            String titleInput = scanner.nextLine();
            
            System.out.println("Great, now lets label the genre of this book.");
            System.out.println("What is the genre of this book? :");
            String genreInput = scanner.nextLine();

            System.out.println("Now all we need is the number of pages of this book, for good record keeping of course.");
            System.out.println("How many pages are in this book? :");
            int numPagesInput = scanner.nextInt();

            System.out.println("We will now proceed to compile your book submission!");
            Book bookCompiled = new Book(titleInput, genreInput, numPagesInput);
            
            System.out.println("Your book is finished compiling! Lets take a look at it: ");
            System.out.println("Book Title: " + bookCompiled.getTitle());
            System.out.println("Book Genre: " + bookCompiled.getGenre());
            System.out.println("Book Page Length: " + bookCompiled.getNumPages());

            library.addBookToLibrary(bookCompiled);

            System.out.println(library);

            //  Run Again/Exit Process
            runAgainInstructions();
            int userReply = scanner.nextInt();
            runAgainFunc(userReply, runAgain);

        }
        scanner.close();
    }

    public static void runAgainFunc(int userChoice, RunAgainContainer runAgainBool) {
        if (userChoice == 1) {
            runAgainBool.bool = true;
        }
        else {
            runAgainBool.bool = false;
            System.out.println("Thank you, Library is now finished!");
        }
    }

    public static void runAgainInstructions() {
        System.out.println("Would you like to add another book to the library?");
        System.out.println("1. Create another book");
        System.out.println("Any Other Number: Exit process");
    }
}
