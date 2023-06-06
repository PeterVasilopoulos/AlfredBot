import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.Format;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    // Overload guest greeting method
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    // Sensei bonus overload guest greeting method
    public String guestGreeting() {
        SimpleDateFormat hourInDay = new SimpleDateFormat("H");
        String date = hourInDay.format(new Date());
        int hour = Integer.parseInt(date);

        if(hour < 11) {
            return "Good morning!";
        } else if(hour >= 11 && hour < 5) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date today = new Date();
        return String.format("It is currently " + today + ".");
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    // Sensei bonus
    public String angryAlfred() {
        return "No! I won't do it and you can't make me!";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

