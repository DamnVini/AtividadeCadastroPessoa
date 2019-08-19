
public class Endereco {
	public String bairro;
	public String rua;
	public Integer numero;

	public Endereco() {
	super();

	}

	public Endereco(String bairro, String rua, Integer numero) {
	super();
	this.bairro = bairro;
	this.rua = rua;
	this.numero = numero;
	}

	public String getBairro() 
	{
		
		return bairro;
	
	}
	
	public void setBairro(String bairro) 
	{
		
		this.bairro = bairro;
	
	}
	
	public String getRua() 
	{
		
		return rua;
	
	}
	
	public void setRua(String rua) 
	{
		
		this.rua = rua;

	}
	
	public Integer getNumero() 
	{
		
		return numero;
	
	}
	
	public void setNumero(Integer numero) 
	{
		
		this.numero = numero;
	
	}
	
}

