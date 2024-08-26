/**
 * 
 */
package java.br.com.rpires.dao;


import java.br.com.rpires.dao.generic.IGenericDAO;
import java.br.com.rpires.domain.Venda;
import java.br.com.rpires.exceptions.DAOException;
import java.br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
