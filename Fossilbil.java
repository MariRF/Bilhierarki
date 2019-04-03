class Fossilbil extends Bil {
  protected double utslipp;

  Fossilbil (String registreringsnummer, double utslipp) {
    super(registreringsnummer);
    this.utslipp = utslipp;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("CO2-utslipp: " + utslipp);
  }
}
