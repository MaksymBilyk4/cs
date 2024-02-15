package lib;


import lib.exception.*;

public class Catalog {

    private Book[] books;

    public Catalog() {
        this.books = new Book[]{};
    }


    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


    private Book[] copyBooksIncrement() {
        Book[] booksCopy = new Book[this.books.length + 1];

        for (int i = 0; i < this.books.length; i++) {
            booksCopy[i] = this.books[i];
        }

        return booksCopy;
    }

    private Book findBookByName(String name) {

        Book foundBook = null;

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getName().equals(name)) {
                foundBook = this.books[i];
                break;
            }
        }

        return foundBook;

    }

    private Book[] findBooksByAuthor(String author) {

        int count = 0;

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getAuthor().equals(author)) {
                count++;
            }
        }

        Book[] foundBooks = new Book[count];
        // index of foundBooks
        count = 0;

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getAuthor().equals(author)) {
                foundBooks[count] = this.books[i];
                count++;
            }
        }

        return foundBooks;

    }

    public Book[] addNewBook(Book book) throws
            BookAlreadyExistsException,
            CantAddBookException,
            InvalidBookYearException
    {
        try {
            if (book.getYear() <= 0) throw new InvalidBookYearException("Can't add book with issue year " + book.getYear());
            RegExUtil.validateBookName(book.getName());
            RegExUtil.validateAuthorName(book.getAuthor());

            Book foundBook = this.findBookByName(book.getName());

            if (foundBook == null) {

                Book[] copy = this.copyBooksIncrement();
                copy[copy.length - 1] = book;
                this.books = copy;

                return this.books;

            } else throw new BookAlreadyExistsException("Book with name " + book.getName() + " already exists.");
        } catch (IncorrectBookNameException | IncorrectAuthorNameException ibne) {
            ibne.printStackTrace();
            throw new CantAddBookException("Error while creating book...");
        }

    }

    public boolean deleteBookByName(String bookName) throws BookNotFoundException{

        boolean isFound = false;

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getName().equals(bookName)) {
                isFound = true;
                break;
            }
        }

        if (!isFound) throw new BookNotFoundException("Can't delete a book.\nBook with name " + bookName + " not found.");
        else {
            int updatedBooksIndex = 0;
            Book[] updatedBooks = new Book[this.books.length - 1];

            for (int i = 0; i < this.books.length; i++) {
                if (!this.books[i].getName().equals(bookName)) {
                    updatedBooks[i] = this.books[i];
                    updatedBooksIndex++;
                }
            }

            this.books = updatedBooks;
            return true;
        }
    }

    public Book findByIndex (int bookIndex) throws IndexOutOfBoundsException{
        if (bookIndex >= this.books.length || bookIndex < 0) throw new IndexOutOfBoundsException("Incorrect index of books");
        return this.books[bookIndex];
    }

}
