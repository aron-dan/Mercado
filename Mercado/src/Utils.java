import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
  static NumberFormat numberFomat = new DecimalFormat("R$ #,##00.0", new DecimalFormatSymbols(new Locale("pt", "BR")));

  public static String doubleToString(String value) {
    return numberFomat.format(value);
  }
}