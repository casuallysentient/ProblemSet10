import java.io.FileNotFoundException;
import java.util.ArrayList;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
public class Words {
    ArrayList<Definitions> definitions = new ArrayList<Definitions>();
	ArrayList<String> synonyms = new ArrayList<String>();
	ArrayList<String> antonyms = new ArrayList<String>();

	public Words(String word, ArrayList<Definitions> definitions, ArrayList<String> synonyms, ArrayList<String> antonyms) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		this.word = word.substring(0, 1).toUpperCase() + word.substring(1, word.length()).toLowerCase();
		this.definitions = definitions;
		this.synonyms = synonyms;
		this.antonyms = antonyms;
    }
    public String getSpelling() {
		this.word = this.word.substring(0, 1).toUpperCase().concat(this.word.substring(1, word.length()).toLowerCase());
		return this.word;
    }
    public void setDefinition(Definitions definitions) {
		this.definitions.add(definitions);
	}
	public void addSynonym(String synonym) {
		this.synonyms.add(synonym);
    }
    public void addAntonym(String antonym) {
		this.antonyms.add(antonym);
	}

    public ArrayList<Definitions> getDefintion() {
		return this.definitions;
	}
	public String getADefinition(int index) {
		return this.definitions.get(index).getDefinition();
    }
    public ArrayList<String> getAllSynonyms() {
		return this.synonyms;
	}
	public ArrayList<String> getAllAntonyms() {
		return this.antonyms;
	}


}
