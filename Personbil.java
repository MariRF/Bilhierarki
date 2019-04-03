class Personbil extends Fossilbil {
  private int antallSeter;

  Personbil(String registreringsnummer, double utslipp, int antallSeter) {
    super(registreringsnummer, utslipp);
    this.antallSeter = antallSeter;
  }

  @Override
  public void printInfo() {
    System.out.println("Type motorvogn: Personbil");
    super.printInfo();
    System.out.println("Seter: " + antallSeter);
  }
}
