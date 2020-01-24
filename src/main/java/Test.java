import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.concordia.app.config.ApplicationConfig;
import com.concordia.app.dao.CarCatalogueDAO;
import com.concordia.app.vo.CarCatalogue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		
		CarCatalogueDAO carCatalogueDAO = applicationContext.getBean(CarCatalogueDAO.class);
		
		//carCatalogueDAO.add(new CarCatalogue(5,"SUV","ford","Tarus","2019","White","E54RG7","0"));
		
		
		CarCatalogue carCatalogue = carCatalogueDAO.findById(1);
		System.out.println(carCatalogue);

	}

}
