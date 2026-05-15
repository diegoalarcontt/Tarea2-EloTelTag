import java.util.ArrayList;

public class Territory {

    private ArrayList<Cellular> celulares;
    private ArrayList<EloTelTag> tags;
    private ArrayList<Tablet> tablets;

    public Territory() {

        celulares = new ArrayList<>();
        tags = new ArrayList<>();
        tablets = new ArrayList<>();
    }

    public void addCellular(Cellular cellular) {
        celulares.add(cellular);
    }

    public void addTag(EloTelTag tag) {
        tags.add(tag);
    }

    public void addTablet(Tablet tablet) {
        tablets.add(tablet);
    }

    public ArrayList<Cellular> getCelulares() {
        return celulares;
    }

    public ArrayList<EloTelTag> getTags() {
        return tags;
    }

    public ArrayList<Tablet> getTablets() {
        return tablets;
    }
}