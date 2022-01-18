package VehicleProperties;

public class Tyres {
    private TyreType tyreType;
    private int numberOfTyres;

    public Tyres(TyreType tyreType, int numberOfTyres) {
        this.tyreType = tyreType;
        this.numberOfTyres = numberOfTyres;
    }

    public TyreType getTyreType() {
        return tyreType;
    }

    public void setTyreType(TyreType tyreType) {
        this.tyreType = tyreType;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

}
