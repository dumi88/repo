public class Covid extends Vacuna{
	private String efectesSecundaris;
	
	public Covid(){
		this.efectesSecundaris ="";
	}
	public Covid(String efectesSecundaris){
		this.efectesSecundaris=efectesSecundaris;
	}
	
	public String toString() {
		return "Efectos secundarios: " +this.efectesSecundaris;
	}
	
}