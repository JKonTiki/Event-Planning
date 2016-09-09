// import java.util.ArrayList;
// import java.util.List;

public class TheBigJazz {
  public String mName;
  public String mLocation;
  public String mBand;
  public String[] yesArray = {"Y", "y","YES", "yes","yeah", "yee-haw"};
  public String yes = String.join(" ", yesArray);

  public boolean jiveOrNoJive(String _downtownness) {
    boolean jiveness;
    if (yes.indexOf(_downtownness) != -1) {
      jiveness = true;
    } else {
      jiveness = false;
    }
    return jiveness;
  }

  public void callingCard(String _name) {
    mName = _name;
  }

  public void theHotSpot(String _location) {
    mLocation = _location;
  }

  public void tuneLayinDaddies(String _band) {
    mBand = _band;
  }

  public String theBigBusinessJive() {
    String cost = mName + mLocation + mBand;
    return cost;
  }

}
