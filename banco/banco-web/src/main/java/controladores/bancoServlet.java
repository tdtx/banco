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
import es.uc3m.tiw.model.dominios.Cuenta;



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
	   
	 
	   
	 Cuenta cuenta1 = new Cuenta("89776546y",2000,"Ayhju9876ujki8ujkujki");  
	 Cuenta cuenta2 = new Cuenta("87698423z",1500,"Bikj7kilo098u7y6t5r4e");  
	 Cuenta cuenta3 = new Cuenta("58754123p",1000,"Bikju7865tgh645rt3ew2");  
	 Cuenta cuenta4 = new Cuenta("98712385t",5000,"Blkoi9oi87uy8ujhy6tgh");  
	 Cuenta cuenta5 = new Cuenta("90876123r",3000,"Bjkol0987ujhy6tgf4rfd");  
	 Cuenta cuenta6 = new Cuenta("98765398u",4500,"Aikjl0987ujhy5645rfgt");  
	 Cuenta cuenta7 = new Cuenta("90878653g",6000,"Akijl0987ujki6ygt54re");  
	 Cuenta cuenta8 = new Cuenta("34567890o",9000,"Ajkiu8ui9oilk9ikj7ujh");  
	 Cuenta cuenta9 = new Cuenta("98778765t",8000,"Bolkoilkoikjuujki9876");  
	 Cuenta cuenta10 = new Cuenta("54667890i",1000,"Acvbhnjmkilko98765432");  
	   
	 
	 cdao= new CuentaDAO(em, ut);
	   
	   try {
		   cdao.guardarCuenta(cuenta1);
		   cdao.guardarCuenta(cuenta2);
		   cdao.guardarCuenta(cuenta3);
		   cdao.guardarCuenta(cuenta4);
		   cdao.guardarCuenta(cuenta5);
		   cdao.guardarCuenta(cuenta6);
		   cdao.guardarCuenta(cuenta7);
		   cdao.guardarCuenta(cuenta8);
		   cdao.guardarCuenta(cuenta9);
		   cdao.guardarCuenta(cuenta10);
	 
	   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
