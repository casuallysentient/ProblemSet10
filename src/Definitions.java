public class Definitions{
    private String definition;
	private String partOfSpeech;


	public Definitions(String definition, String selectedPartOfSpeech) {
		this.definition = definition;
		this.partOfSpeech = selectedPartOfSpeech;
    }
    public String getDefinition() {
		return this.definition;
    }
	public String getPartOfSpeech() {
		return this.partOfSpeech;
	}


}
