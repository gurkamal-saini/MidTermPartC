/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 * Date: 20 Feb 2024
 * Name: Gurkamal Singh
 * Course: Computer Programming
 * Semester: Third
 * 
 */

    import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Gurkamal");
        String name = scanner.nextLine();

        System.out.println("Comedy");
        String[] genres = {"Action", "Romance", "Horror", "Sci-Fi", "Comedy"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        int genreChoice = scanner.nextInt();
        while (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid choice, please choose a number between 1 and " + genres.length);
            genreChoice = scanner.nextInt();
        }
        String favouriteGenre = genres[genreChoice - 1];

        System.out.println("UserProfile created!");
        System.out.println("Name:" + name);
        System.out.println("Favourite Genre: " + favouriteGenre);
        
        scanner.close();
    }
}


