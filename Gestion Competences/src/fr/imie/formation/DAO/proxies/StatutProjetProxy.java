package fr.imie.formation.DAO.proxies;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import fr.imie.formation.DAO.StatutProjetDAO;
import fr.imie.formation.DAO.exceptions.DAOException;
import fr.imie.formation.DAO.interfaces.IStatutProjetDAO;
import fr.imie.formation.DTO.StatutProjetDTO;
import fr.imie.formation.transactionalFramework.ITransactional;
import fr.imie.formation.transactionalFramework.exception.TransactionalConnectionException;

public class StatutProjetProxy implements IStatutProjetDAO{

	StatutProjetDAO statutProjetDAO;
	ITransactional caller = null;
	
	public StatutProjetProxy(StatutProjetDAO statutProjetDAO, ITransactional caller){
		super();
		this.caller = caller;
		this.statutProjetDAO = statutProjetDAO;
	}
	
	public StatutProjetProxy(StatutProjetDAO statutProjetDAO){
		this.statutProjetDAO = statutProjetDAO;
	}
	
	@Override
	public Connection getConnection() {
		
		return statutProjetDAO.getConnection();
	}

	@Override
	public void setConnection(Connection connection) {
		statutProjetDAO.setConnection(connection);
		
	}

	@Override
	public void putInTransaction(ITransactional transactional)
			throws TransactionalConnectionException {
		statutProjetDAO.putInTransaction(caller);
		
	}

	@Override
	public void putOffTransaction() {
		statutProjetDAO.putOffTransaction();
		
	}

	@Override
	public void endTransactionalConnexion() {
		statutProjetDAO.endTransactionalConnexion();
		
	}

	@Override
	public void beginTransactionalConnexion()
			throws TransactionalConnectionException {
		statutProjetDAO.beginTransactionalConnexion();
		
	}

	@Override
	public List<StatutProjetDTO> readAllStatutProjet()
			throws TransactionalConnectionException, DAOException {
		List<StatutProjetDTO> statutProjetDTO = new ArrayList<StatutProjetDTO>();
		if (caller == null){
			beginTransactionalConnexion();
		} else {
			putInTransaction(caller);
		}
		statutProjetDTO = statutProjetDAO.readAllStatutProjet();
		if (caller == null){
			endTransactionalConnexion();
		} else {
			putOffTransaction();
		}
		return statutProjetDTO;
	}

}