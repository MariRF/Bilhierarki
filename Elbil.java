class Elbil extends Bil {
  private double kapasitet;

  Elbil(String registreringsnummer, double kapasitet) {
    super(registreringsnummer);
    this.kapasitet = kapasitet;
  }

  @Override
  public void printInfo() {
    System.out.println("Type motorvogn: Elbil");
    super.printInfo();
    System.out.println("Batterikapasitet (kWh): " + kapasitet);
  }
}
