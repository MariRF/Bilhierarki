abstract class Bil {
  protected String registreringsnummer;

  Bil(String registreringsnummer) {
    this.registreringsnummer = registreringsnummer;
  }

  public void printInfo() {
    System.out.println("Reg.nr: " + registreringsnummer);
  }
}
