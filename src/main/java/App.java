import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Event theBigJazz = new Event();
    System.out.println("Welcome to the baddest pad in the South Side - it's THE JUNGLE bay-bay! Ride that cymbal to ecstasy, brother-man, it's time to fly down the river Jordan with jazzy zoots and doo-diddlin' alley-cats alike. Round here we aint' fool tokin' but we gun smokin', and everyones a king and queen in this dazzle shop. Now hold it one hot minute! You hear that hum-drum diddley dum?? The doo-dah-dee and the rattly-tat-tat??! The moons'a howlin' like a pastor george and that can only mean one thing: it's time to break those willies and drop those nillies cause here comes the sweet bomb-a-ramma of the star-shinin' and steel city cryin' STREET LIGHT BAND!");
    System.out.println("Now, you trott-tottlin' dog on fire - I hear your think-tink-ink-a-linkerin about opening up a jack in the box pop yourself - is that the sweet jazz word of the night or WHAT!");
    System.out.println("ANSWER (Y/N)");
    String confirm = myConsole.readLine();
    if (!(confirm.equals("Y"))) {
      System.out.println("Well, I must've skipped the skinny from sonny on the block. Come find me if you want to jib that jive some other moon");
    } else {

      System.out.println("Well call me a jackrabbit at a Cuban footrace! Sonny, you and me are gonna pop the top off this town. Now, what should we call this mad parade?");
      String name = myConsole.readLine();
      theBigJazz.callingCard(name);

      System.out.println(name + ", I can dig it! You sure know how to lay the word like the cool sax, and I can respect a cat with a knifin' tongue like that.");
      System.out.println("Now, there's a few joints 'round this town that i think would be some real spots for a ball-roller like that, which one yanks your collar to the floor and 'round:");
      System.out.println("SELECT (THE GREAT ORIENTAL / TIKI TINA'S / THE BOURBON BAYOU / LE BLEU ROOM)");
      String location = myConsole.readLine();
      theBigJazz.theHotSpot(location);

      System.out.println("Ooooh-wee - this is gonna make for a night fine like a ripe grain of beach sand! But, of course, no doghouse is a home without some reeeaal bad tunes. If we want to turn a hot dime, we're gonna have to book the coolest cats from here to St. Louis. Who's gonna drop the blare and lay the jam-clam beat?");
      System.out.println("SELECT (THE BONOBO BOYS / THE SWINGIN JOHNNYS / APALACHEE ERIK AND THE SNOWGLOBIN' HATCHETS / GALWAY GARETH'S PERCUSSION EMPORIUM)");
      String band = myConsole.readLine();
      theBigJazz.tuneLayinDaddies(band);

      String cost = theBigJazz.theBigBusinessJive();

      System.out.println("Cut me some shampoo and call me Sampson - I think we're cullin' some of grandma's sweet tutti-frutti over here! This riot is gonna cut the lights outta this town - no doubts or dispatches - and you and me are gonna rake in the business like a couple of real good-time charlies. The " + name + " is gonna turn " + location + "into a real groovy slide-time, and I can already feel " + band + " reelin' in the fish all night.");
      System.out.println("Now, a ball like this can't roll without catchin' a pretty penny. This grand-slam-momma-jam is gonna run us about " + cost + " deep, but don't let that hold 'ya down. By the end of that night, you and me are gonna me a couple real Carnegies and won't nobody be callin' us a pair of slipaway jacksons then! We'll sure slam 'em then!");
      System.out.println("CONGRATULATIONS, YOU HAVE COMPLETED the big jazz. THANK YOU FOR PLAYING.");

    }

  }
}
