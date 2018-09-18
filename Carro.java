class Carro extends Produto_duravel{
	public int ano;
	public int portas;
	public boolean is_automatico;

	public Carro(int id, String nome, float preco, String marca, String descricao, String data_de_fabricacao, String material_predominante, int durabilidade, Boolean avaria, int ano, int portas, boolean is_automatico){
		super(id,nome,preco,marca,descricao,data_de_fabricacao,material_predominante,durabilidade,avaria);
		this.ano           = ano;
		this.portas        = portas;
		this.is_automatico = is_automatico;
	}

	public boolean is_eletronico(){
		return true;
	}

	public boolean is_disponivel(){
		return true;
	}
}