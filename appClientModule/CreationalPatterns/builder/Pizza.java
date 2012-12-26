package CreationalPatterns.builder;

/** Product */
public class Pizza {
	private String dough = "";
	private String sauce = "";
	private String topping = "";
	
	public void setDough(String dough)     { this.dough = dough; }
    public void setSauce(String sauce)     { this.sauce = sauce; }
    public void setTopping(String topping) { this.topping = topping; }
	
    public String getDough(){ return dough; }
    public String getSauce(){ return sauce; }
    public String getTopping(){ return topping; }
}
