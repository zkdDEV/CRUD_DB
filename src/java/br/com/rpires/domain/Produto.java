/**
 * 
 */
package java.br.com.rpires.domain;


import java.anotacao.ColunaTabela;
import java.anotacao.Tabela;
import java.anotacao.TipoChave;
import java.br.com.rpires.dao.Persistente;
import java.math.BigDecimal;

/**
 * @author rodrigo.pires
 *
 */
@Tabela("TB_PRODUTO")
public class Produto implements Persistente {
	
	@ColunaTabela(dbName = "id", setJavaName = "setId")
	private Long id;

	@TipoChave("getCodigo")
	@ColunaTabela(dbName = "codigo", setJavaName = "setCodigo")
	private String codigo;
	
	@ColunaTabela(dbName = "nome", setJavaName = "setNome")
	private String nome;
	
	@ColunaTabela(dbName = "descricao", setJavaName = "setDescricao")
	private String descricao;
	
	@ColunaTabela(dbName = "valor", setJavaName = "setValor")
	private BigDecimal valor;

	/**
	 * NOVA PROPRIEDADE ADICIONADA - PESO_EM_KG do Produto
	 */
	@ColunaTabela(dbName = "peso_em_kg", setJavaName = "setPesoEmKg")
	private Long pesoEmKg;
	public Long getPesoEmKg() {
		return pesoEmKg;
	}
	public void setPesoEmKg(Long pesoEmKg) {
		this.pesoEmKg = pesoEmKg;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
