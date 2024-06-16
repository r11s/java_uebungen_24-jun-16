
/*******************************************************************************
 *   für diverse Übungen : globale Hilfsfunktionen für die Tastatur-Eingabe    *
 ******************************************************************************* 
 *      2005-02-16     Version 1                                               *
 *      2012-09-06     Version 2 (+readChar)                                   *
 *      2022-05-24     Version 3 (replaced deprecated elements)                *
 *******************************************************************************/

import java.io.*;

public class Terminal {

  public static float readFloat() {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    String eingabe = null;
    try {
      eingabe = console.readLine();
    } catch (IOException e) {
    }
    return (Float.parseFloat(eingabe));
  }

  static double readDouble() {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    String eingabe = null;
    try {
      eingabe = console.readLine();
    } catch (IOException e) {
    }
    return (Double.parseDouble(eingabe));
  }

  public static char readChar() {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    String eingabe = null;
    try {
      eingabe = console.readLine();
    } catch (IOException e) {
    }
    return (eingabe.charAt(0));
  }

  public static int readInt() {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    String eingabe = null;
    try {
      eingabe = console.readLine();
    } catch (IOException e) {
    }
    return (Integer.parseInt(eingabe));
  }

  public static String readString() {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    String eingabe = null;
    try {
      eingabe = console.readLine();
    } catch (IOException e) {
    }
    return (eingabe);
  }

  public static boolean readBool() {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    String r = null;
    try {
      r = console.readLine();
    } catch (IOException e) {
    }
    if ("jJtT1".indexOf(r) >= 0) { // indexOf() ist Member von String
      return true;
    } else {
      return false;
    }
  }
}
