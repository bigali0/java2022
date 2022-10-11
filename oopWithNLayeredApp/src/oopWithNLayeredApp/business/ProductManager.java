package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
//Bir islemi birden fazla alternatif ile yapabilmek yani herhangi birine bagimli kalmamak icin soyut sinif olan Interface yapilarini kullaniriz.
//Bu soyut sinifi dependency Injection yoluyla enjecte ettigimiz classta bu interface i implemnte etmis diger tum siniflar kullanabiliriz.
//Constructor blogunda Bu soyut sinifi miraz alan hangi servisi kullanacagimizi belirterek o servis uzerinden islemlerimizi yapariz
//Boylece Manager sinifi o isi yapmak icin sadece bir sinifa bagimli kalmamais oldu
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao ,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception { 
		// is kurallari 
		if(product.getUnitPrice()<10) {
			throw new Exception("Urun fiyati 10 dan kucuk olamaz");
		}
		
		//JdbcProductDao productDao = new JdbcProductDao(); hibernate ile degistirldigi varsayildi
		//ProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		for (Logger logger : loggers) { // [db,file]
			logger.log(product.getName());
			
		}
		
	}
	
	

}
