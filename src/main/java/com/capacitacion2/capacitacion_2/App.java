package com.capacitacion2.capacitacion_2;

import com.capacitacion2.capacitacion_2.clase3.automatizacionPaginaWeb;

import clase4.ManagerDriver;
import clase4.PageObjectTourFrance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//automatizacionPaginaWeb objLanzaPagina = new automatizacionPaginaWeb();
    	//objLanzaPagina.interactuarGmail();
    	
    	String urlPagina = "https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
    	ManagerDriver objManager = new ManagerDriver("google", urlPagina);
    	objManager.navegadorAPagina();
    	PageObjectTourFrance objTour = new PageObjectTourFrance(objManager.getWebDriver());
    	objTour.seleccionListaDesplegable("Etapa 17");
    	espera(3);
    	objTour.imprimirListaCiclistas();
    	espera(5);
    	objManager.cerrarpagina();
   
    }
    
    public static void espera(int tiempo) {
    	try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
