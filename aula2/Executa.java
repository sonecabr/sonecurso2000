public class Executa {
	public static void main(String[] args){
		OlaPais ola = new OlaPais();
		
		ola.setMyName("soneca");
		ola.setLinguagem("Ingles");
		String nome = ola.getMyName();
		String lng = ola.getLinguagem();
		
		System.out.println("continente::" + nome);
		System.out.println("linguagem do pais::" + lng);

	}
}