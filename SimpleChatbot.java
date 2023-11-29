


import java.util.Scanner;

public class SimpleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm a simple chatbot. What's your name?");
        
        String userName = scanner.nextLine();
        System.out.println("Nice to meet you, " + userName + "! Ask me anything or type 'exit' to end the conversation.");

        String userMsg;
        do {
            System.out.print("You: ");
            userMsg = scanner.nextLine();
            String botResponse = getBotResponse(userMsg);
            System.out.println("Bot: " + botResponse);
        } while (!userMsg.equalsIgnoreCase("exit"));

        System.out.println("Goodbye! Have a great day, " + userName + "!");
        scanner.close();
    }

    public static String getBotResponse(String userMsg) {
        // Simple responses based on user input
        if (userMsg.contains("hi") || userMsg.contains("hello")) {
            return "Hello there!";
        } else if (userMsg.contains("how are you")) {
            return "I'm just a computer program, but I'm functioning well. How can I help you?";
        } else if (userMsg.contains("thanks") || userMsg.contains("thank you")) {
            return "You're welcome!";
        } else if (userMsg.contains("weather")) {
            return "I'm not equipped to provide live weather updates, but you can check online!";
        } else {
            return "I'm sorry, I don't understand. Can you please rephrase or ask something else?";
        }
    }
}
