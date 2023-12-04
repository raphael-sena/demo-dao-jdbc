package model.entities;

import java.io.Serializable;
import java.util.Objects;

//implements serializable é para os objetos serem transformados em sequencia de bytes. na
//linguagem java tem que fazer implements serializable se quisermos que o nosso objeto seja 
//guardado em arquivos, trafegado em rede, etc..
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//atributos
	private Integer id;
	private String name;
	
	//construtores
	public Department() {
	}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	//getters setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//hashcode e equals para que os objetos possam ser comparados pelo conteudo 
	//e nao pela referencia de ponteiros
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	//toString para facilidade de imprimir os valores do objeto para teste
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
