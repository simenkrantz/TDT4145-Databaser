
public class Frittstaende extends Ovelse{

    private String beskrivelse = null;

    public Frittstaende(int ovelseID, String navn, Ovelsesgruppe gruppe, String beskrivelse){
        super(ovelseID, navn,gruppe);
        this.beskrivelse = beskrivelse;
    }

    public String getBeskrivelse(){
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse){
        this.beskrivelse = beskrivelse;
    }
}