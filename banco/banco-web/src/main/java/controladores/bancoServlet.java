package controladores;

import java.io.IOException;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

import es.uc3m.tiw.model.daos.CuentaDAO;


/**
 * Servlet implementation class bancoServlet
 */
@WebServlet(value="/bancoServlet",loadOnStartup=1)
public class bancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="banco-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	CuentaDAO cdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bancoServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }
   public void init() throws ServletException{
	   super.init();
	   
	   cdao= new CuentaDAO(em, ut);
	   
	   
   }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
