abstract class Produto{

	private int    id;
	private String nome;
	private float  preco;
	private String marca;
	private String descricao;
	private String data_de_fabricacao;

	public Produto(int id, String nome, float preco, String marca, String descricao, String data_de_fabricacao){
		this.id                 = id;
		this.nome               = nome;
		this.preco              = preco;
		this.marca              = marca;
		this.descricao          = descricao;
		this.data_de_fabricacao = data_de_fabricacao;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setPreco(float preco){
		this.preco = preco;
	}

	public float getPreco(){
		return preco;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getMarca(){
		return marca;
	}

	public void setDescricao (String descricao){
		this.descricao = descricao;
	}

	public String getDescricao(){
		return descricao;
	}

	public void setData_de_fabricacao(String data_de_fabricacao){
		this.data_de_fabricacao = data_de_fabricacao;
	}

	public String getData_de_fabricacao(){
		return data_de_fabricacao;
	}

	public void imprimir(){
		System.out.println("Nome: "               + nome);
		System.out.println("Preço: "              + preco + " R$");
		System.out.println("Marca: "              + marca);
		System.out.println("descricao: "          + descricao);
		System.out.println("Data de fabricacao: " + data_de_fabricacao);
	}

	public abstract boolean is_disponivel();
}