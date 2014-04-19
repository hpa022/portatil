package factura;

/**
 * Clase para saber dentro de una linea de factura el valor de unos determinados productos.
 * @author Hector
 * @see <a href="Factura.html"/> Mas informacion relacionada con los clientes en fichero Factura.java</a>
 */

public class LineaFactura {
	
	
	/**
	 * identifcador del producto
	 
	 */
		
	public String id_producto; 		// identificador (codigo) del producto
	/**
	* nombre del producto
	*/
	
	public String nombre_producto; 	// nombre del producto
	/**
	 * precio del producto
	 */
	
	public float precio; 			//precio por una unidad del producto
	/**
	* cantidad de unidades adquiridas*/
	 
	public float cantidad; 			//cantidad de unidades compradas
	/**
	 * descuento de la unidad
	 */
	
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/**
	 * Calcula el coste de una linea de productos por medio de una factura.
	 * @param idProducto es la id del producto que estamos facturando.
	 * @param nombreProducto es el Nombre del producto que esta en la factura.
	 * @param precio es el precio del producto que facturamos.
	 * @param cantidad es la cantidad del producto que se factura.
	 * @param descuento es el descuento que le aplicamos al producto y que queda reflejado en factura.
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	/**
	 * Creamos un metodo que hace devolver dentro de la linea de factura,la id del producto,su nombre,
	 * el precio del mismo la cantidad ofrecida asi como su descuento.
	 * @return devuelve el id del producto,el nombre,el precio, la cantidad y el descuento del producto pertenecientes a la linea de la factura.
	 */
	
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad
	 * @return total es el resultado del precio total de una linea.
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
