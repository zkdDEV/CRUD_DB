/**
 * 
 */
package java.br.com.rpires.services;

import java.br.com.rpires.dao.IProdutoDAO;
import java.br.com.rpires.domain.Produto;
import java.br.com.rpires.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
