// import java.util.ArrayList;
// import java.util.List;

public class TheBigJazz {
  public String mName;
  public String mLocation;
  public int mLocationCost;
  public String mBand;
  public int mBandCost;
  public int mTotalCost;
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
    if (_location.equals("4")) {
      mLocation = "THE GREAT ORIENTAL";
      mLocationCost = 25;
    } else if (_location.equals("3")) {
      mLocation = "LE STARRY BLEU";
      mLocationCost = 10;
    } else if (_location.equals("2")) {
      mLocation = "THE BOURBON BAYOU";
      mLocationCost = 4;
    } else {
      mLocation = "TIKI TINA'S";
      mLocationCost = 2;
    }
  }


  public void tuneLayinDaddies(String _band) {
    if (_band.equals("4")) {
      mBand = "GALWAY GIL'S PERCUSSION EMPORIUM";
      mBandCost = 25;
    } else if (_band.equals("3")) {
      mBand = "APALACHEE ERIK AND THE SNOWGLOBIN' HATCHETS";
      mBandCost = 10;
    } else if (_band.equals("2")) {
      mBand = "THE SWINGIN JOHNNYS";
      mBandCost = 4;
    } else {
      mBand = "THE BONOBO BOYS";
      mBandCost = 2;
    }
  }

  public void theBigBusinessJive() {
    mTotalCost = mLocationCost + mBandCost;
  }

}
