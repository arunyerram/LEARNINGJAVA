

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * A simple command-line DNS resolver application in Java.
 * This program takes a domain name from the user and prints its corresponding IP address(es).
 * It continues to ask for domain names until the user types 'exit'.
 */
public class dns {

    /**
     * The main method, which is the entry point of the program.
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user's console.
        Scanner scanner = new Scanner(System.in);

        // Display welcome messages and instructions to the user.
        System.out.println("Welcome to the Simple DNS Resolver!");
        System.out.println("Enter a domain name to resolve (or type 'exit' to quit):");

        // Start an infinite loop to continuously prompt the user for input.
        // The loop will be broken internally when the user types 'exit'.
        while (true) {
            System.out.print("Domain: ");
            // Read the full line of text entered by the user.
            String domain = scanner.nextLine();

            // Check if the user wants to exit the program.
            // .equalsIgnoreCase() checks the string without being case-sensitive.
            if ("exit".equalsIgnoreCase(domain)) {
                System.out.println("Exiting DNS Resolver. Goodbye!");
                break; // Exit the while loop.
            }

            // Use a try-catch block to handle potential network errors,
            // such as when a domain name cannot be found.
            try {
                // This is the core DNS lookup.
                // InetAddress.getAllByName() attempts to find all IP addresses for the given domain.
                InetAddress[] addresses = InetAddress.getAllByName(domain);

                // If the lookup is successful, print the results.
                System.out.println("IP addresses for " + domain + ":");

                // Loop through the array of found addresses.
                for (InetAddress address : addresses) {
                    // For each address object, get the IP address as a string and print it.
                    System.out.println("- " + address.getHostAddress());
                }

            } catch (UnknownHostException e) {
                // This block is executed if InetAddress.getAllByName() fails to find the host.
                // This usually means the domain name is invalid or does not exist.
                System.out.println("Could not resolve domain: " + e.getMessage());
            }
        }

        // Close the scanner to release system resources. This is important for preventing memory leaks.
        scanner.close();
    }
}