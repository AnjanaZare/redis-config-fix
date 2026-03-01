package com.example.palindrome;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {

    @GetMapping("/palindrome")
    public String checkPalindrome(@RequestParam String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            return "Yes, it is a palindrome!";
        } else {
            return "No, it is not a palindrome.";
        }
    }
}
 