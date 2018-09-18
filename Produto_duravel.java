abstract class Produto_duravel extends Produto{
	private String   material_predominante;
	private int      durabilidade;
	private Boolean  avaria;

	public Produto_duravel(int id, String nome, float preco, String marca, String descricao, String data_de_fabricacao, String material_predominante, int durabilidade, Boolean avaria){
		super(id,nome,preco,marca,descricao,data_de_fabricacao);
		this.material_predominante = material_predominante;
		this.durabilidade          = durabilidade;
		this.avaria                = avaria;
	}

	public void setMaterial_predominante(String material_predominante){
		this.material_predominante = material_predominante;
	}

	public String getMaterial_predominante(){
		return material_predominante;
	}

	public void setDurabilidade(int durabilidade){
		this.durabilidade = durabilidade;
	}

	public int getDurabilidade(){
		return durabilidade;
	}

	public void setAvaria(Boolean avaria){
		this.avaria = avaria;
	}

	public Boolean setAvaria(){
		return avaria;
	}

	public void imprimir(){
		super.imprimir();
		System.out.println("Material predominante: " + material_predominante);
		System.out.println("Durabilidade: "          + durabilidade);
		System.out.println("Avaria: "                + avaria);
	}

	public abstract boolean is_eletronico();
}