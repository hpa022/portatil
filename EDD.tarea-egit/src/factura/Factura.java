package factura;

import java.util.Arrays;

/**
 * Clase para hacer una factura de unos determinados productos a clientes.
 * @author Hector
 * @see <a href="LineaFactura.html"/> Mas informacion en fichero LineaFactura.java</a>
 * 
 */

public class Factura {
	
	/**
	 * identifcador del cliente
	 
	 */
	
	public String id_cliente;		// Identificador (codigo) del cliente
	
	/**
	 * nombre del cliente
	 
	 */
	public String nombre_cliente;	// Nombre del cliente
	
	/**
	 * lista de productos comprados
	 
	 */
	public LineaFactura lineas[];	// lista de productos comprados
		
	/**
	 * Creacion factura
	 * @param idCliente es la id del cliente que compra y para quien va la factura.
	 * @param nombreCliente es el Nombre del cliente a quien va la factura.
	 * @param lineas lista de productos comprados.
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Devuelve el precio total de la Factura, calculado a partir del precio de cada linea	
	 * @return precio es el resultado del precio de la factura
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	/**
	 * Creamos un metodo que hace devolver dentro de la factura,
	 * la id del cliente,su nombre e informacion sobre el producto o productos adquiridos, 
	 * gracias al metodo gettotal.
	 * @return devuelve los datos de id del cliente,su nombre, los productos que adquiere asi como otros datos datos de las lineas de la factura dentro 
	 * de la misma factura.
	 * @see <a href="LineaFactura.html"/> Mas informacion en fichero LineaFactura.java</a>
	 */
	
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}

	/**
	 * Metodo principal donde sea crea la factura
	 * @param args
	 */

	public static void main(String[] args){
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1 );
		
	}	
	
}
