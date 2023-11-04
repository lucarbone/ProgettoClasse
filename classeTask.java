

public class classeTask{
	private String NomeTask="";
	private String DipendenteAssegnato = "";
	private int Priorita = 0;
	
	classeTask(){
		this.NomeTask="";
		this.DipendenteAssegnato = "";
		this.Priorita = 0;
	}
	classeTask(String n, String d){
		this.NomeTask = n;
		this.DipendenteAssegnato = d;
	}
	classeTask(String n, String d, int p){
		this.NomeTask = n;
		this.DipendenteAssegnato = d;
		this.Priorita = p;
	}
	
	public String getNomeTask(){
		return this.NomeTask;
	}
	public String getDipendenteAssegnato(){
		return this.DipendenteAssegnato;
	}
	public int getPriorita(){
		return this.Priorita;
	}
	
	public void setNomeTask(String n){
		this.NomeTask = n;
	}
	public void setDipendenteAssegnato(String d){
		this.DipendenteAssegnato = d;
	}
	public void setPriorita(int p){
		this.Priorita = p;
	}
	
	public String toString(){
		return this.Priorita + "-" + this.NomeTask + "-" + this.DipendenteAssegnato;
	}
}