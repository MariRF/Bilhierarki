class Lastebil extends Fossilbil {
  private double nyttevekt;

  Lastebil(String registreringsnummer, double utslipp, double nyttevekt) {
    super(registreringsnummer, utslipp);
    this.nyttevekt = nyttevekt;
  }

  @Override
  public void printInfo() {
    System.out.println("Type motorvogn: Lastebil");
    super.printInfo();
    System.out.println("Nyttevekt: " + nyttevekt);
  }
}
