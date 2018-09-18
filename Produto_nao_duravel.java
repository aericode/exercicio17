abstract class Produto_nao_duravel extends Produto{
	private String data_de_validade;
	private String genero;

	public Produto_nao_duravel(int id, String nome, float preco, String marca, String descricao, String data_de_fabricacao, String data_de_validade, String genero){
		super(id,nome,preco,marca,descricao,data_de_fabricacao);
		this.data_de_validade = data_de_validade;
		this.genero           = genero;
	}

	public void setData_de_validade(String data_de_validade){
		this.data_de_validade = data_de_validade;
	}

	public String getData_de_validade(){
		return data_de_validade;
	}

	public void setGenero(String genero){
		this.genero =  genero;
	}

	public String getGenero(){
		return genero;
	}

	public void imprimir(){
		super.imprimir();
		System.out.println("Data de Validade: " + data_de_validade);
		System.out.println("Genero: "           + genero);
	}

	public abstract boolean is_vencido(String data_hoje);
}