package core_java;

import java.util.Scanner;

//Custom Exceptions
class InvalidBookException extends Exception
{
 public InvalidBookException(String message) 
 {
     super(message);
 }
}

class InvalidUserException extends Exception
{
 public InvalidUserException(String message) 
 {
     super(message);
 }
}

class InvalidIdException extends Exception 
{
 public InvalidIdException(String message) 
 {
     super(message);
 }
}

//Book Class
class Book 
{
 private int id;
 private String title;

 public Book(int id, String title) throws InvalidBookException, InvalidIdException
 {
     if (id <= 0) throw new InvalidIdException("Book ID must be positive.");
     if (title == null || title.trim().isEmpty()) throw new InvalidBookException("Book title cannot be empty.");
     this.id = id;
     this.title = title;
 }

 public void display() {
     System.out.println("Book ID: " + id + ", Title: " + title);
 }
}

//User Class
class User
{
 private int id;
 private String email;

 public User(int id, String email) throws InvalidUserException, InvalidIdException
 {
     if (id <= 0) throw new InvalidIdException("User ID must be positive.");
     if (email == null || !email.contains("@")) throw new InvalidUserException("Invalid email address.");
     this.id = id;
     this.email = email;
 }

 public void display() {
     System.out.println("User ID: " + id + ", Email: " + email);
 }
}

//Main Class
public class CustomException {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Book input
         System.out.print("Enter Book ID: ");
         int bookId = scanner.nextInt();
         scanner.nextLine(); // consume newline
         System.out.print("Enter Book Title: ");
         String bookTitle = scanner.nextLine();

         Book book = new Book(bookId, bookTitle);
         book.display();

         // User input
         System.out.print("Enter User ID: ");
         int userId = scanner.nextInt();
         scanner.nextLine(); // consume newline
         System.out.print("Enter User Email: ");
         String userEmail = scanner.nextLine();

         User user = new User(userId, userEmail);
         user.display();
     } 
     
     catch (InvalidBookException | InvalidUserException | InvalidIdException e)
     {
         System.out.println("Validation Error: " + e.getMessage());
     } catch (Exception e) 
     {
         System.out.println("Unknown Error: " + e.getMessage());
     } finally 
     {
         scanner.close();
     }
 }
}