import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    TheBigJazz theBigTime= new TheBigJazz();
    System.out.println();
    System.out.println("**************");
    System.out.println();
    System.out.println("Welcome to the baddest pad in the South Side, I'm Dominic Teedlegrass and this is THE JUNGLE bay-bay! Ride that cymbal to ecstasy, brother-man, it's time to fly down the river Jordan with jazzy zoots and doo-diddlin' alley-cats alike. Round here we aint' fool tokin' but we gun smokin', and everyones a king and queen in this dazzle shop. Now hold it one hot minute! You hear that hum-drum diddley dum?? The doo-dah-dee and the rattly-tat-tat??! The moons'a howlin' like a pastor george and that can only mean one thing: it's time to break those willies and drop those nillies cause here comes the sweet bomb-a-ramma of the star-shinin' - the shippin' crate pryin' -  the steel city cryin': STREET LIGHT BAND!");

    System.out.println();
    System.out.println();
    System.out.println("Now, you trott-tottlin' dog on fire - I hear your'a think-tink-ink-a-linkerin about opening up a jack in the box pop yourself - is that the sweet jazz word of the night or WHAT!");
    System.out.println("ANSWER (Y/N)");
    String confirm = myConsole.readLine();

    boolean jiveness = theBigTime.jiveOrNoJive(confirm);

    if(!jiveness) {
      System.out.println("Well, I must've skipped the skinny from sonny on the block 'cause I 'aint hearin' a righteous tune. Come find me if you want to jib that jive some other moon.");
    }
    while (jiveness) {
      System.out.println("Well call me a jackrabbit at a Cuban footrace! Sonny, you and me are gonna pop the top off this town. Now, what should we call this mad parade?");
      String name = myConsole.readLine();
      if (name.equals("quit")) {
        jiveness = false;
      }
      theBigTime.callingCard(name);

      System.out.println();
      System.out.println("**************");
      System.out.println();
      System.out.println("'" + name + "', I can dig it! You sure know how to lay the word like a cool sax, and I can respect a cat with a knife of a tongue like that.");
      System.out.println("Now, there's a few joints 'round this town that i think would be some real spots for a ball-roller like that, which one yanks your collar to the floor and 'round:");
      System.out.println();
      System.out.println("SELECT BY NUMBER (1 TIKI TINA'S / 2 THE BOURBON BAYOU / 3 LE STARRY BLEU / 4 THE GREAT ORIENTAL)");
      String location = myConsole.readLine();
      if (location.equals("quit")) {
        jiveness = false;
      }
      theBigTime.theHotSpot(location);

      System.out.println();
      System.out.println("**************");
      System.out.println();
      System.out.println("Ooooh-wee - this is gonna make for a night fine like a ripe grain of beach sand! But, of course, no doghouse is a home without some reeeaal bad tunes. If we want to turn a hot dime, we're gonna have to book the coolest cats from here to St. Louis. Who's gonna drop the blare and lay the jam-clam beat?");
      System.out.println();
      System.out.println("SELECT BY NUMBER (1 THE BONOBO BOYS / 2 THE SWINGIN JOHNNYS / 3 APALACHEE ERIK AND THE SNOWGLOBIN' HATCHETS / 4 GALWAY GIL'S PERCUSSION EMPORIUM)");
      String band = myConsole.readLine();
      if (band.equals("quit")) {
        jiveness = false;
      }
      theBigTime.tuneLayinDaddies(band);

      theBigTime.theBigBusinessJive();

      System.out.println();
      System.out.println("**************");
      System.out.println();
      System.out.println("Cut me some shampoo and call me Sampson - I think we're cullin' some of grandma's sweet tutti-frutti over here! This riot is gonna cut the lights outta this town - no doubts or dispatches - and you and me are gonna rake in the business like a couple of real good-time charlies. The " + name + " is gonna turn " + theBigTime.mLocation + " into a real groovy slide-time, and I can already feel " + theBigTime.mBand + " reelin' in the fish all night.");
      System.out.println();
      System.out.println("Now, a ball like this can't roll without catchin' a pretty penny. This grand-slam-momma-jam is gonna run us about " + theBigTime.mTotalCost + " large, but don't let that hold 'ya down. By the end of that night, you and me are gonna me a couple real Carnegies and won't nobody be callin' us a pair of slipaway jacksons then! We'll sure slam 'em then!");
      System.out.println();
      System.out.println("CONGRATULATIONS, YOU HAVE COMPLETED the big jazz. THANK YOU FOR PLAYING.");
      jiveness = false;
    }
  }
}
