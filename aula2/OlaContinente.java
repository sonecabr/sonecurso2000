public class OlaContinente {


	private String nome = "America";


	//construtor
	public OlaContinente(){
		System.out.println("objeto construido");
	}

	public OlaContinente(String frase){
		System.out.println(frase);	
	}

	public void sayMyName(){
		System.out.println(nome);
	}

	public String getMyName(){
		return nome;
	}

	public void setMyName(String nome){
		if(nome.equals("andre")){
			this.nome = "taerrado";
		} else if(nome.equals("soneca")){
			this.nome = nome;	
		} 
		
	}
}