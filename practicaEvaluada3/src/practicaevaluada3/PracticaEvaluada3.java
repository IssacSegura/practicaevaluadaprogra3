/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author issac
 */
public class PracticaEvaluada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //creacion la tienda con 3 productos
        tienda tienda = new tienda(3);

        //ponerle nombres a los productos
        String[] nombresProductos = {"Arroz", "huevos", "Frijoles"};
        tienda.setNombresProductos(nombresProductos);

        //llenar la matriz de ventas con los valores
        tienda.llenarVentas();

        //Calcular el total de ventas por producto
        int[] totalPorProducto = tienda.calcularTotalPorProducto();
        for (int i = 0; i < totalPorProducto.length; i++) {
            System.out.println("total de ventas " + nombresProductos[i] + ": " + totalPorProducto[i]);
        }

        //el día con mayores ventas totales
        int diaMayores = tienda.diaMayoresVentas();
        String[] diasSemana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "Domingo"};
        System.out.println("El dia con mayores ventas: " + diasSemana[diaMayores]);

        //proporciona el producto más vendido
        int productoMayor = tienda.productoMasVendido();
        System.out.println("El producto mas vendido: " + nombresProductos[productoMayor]);
    }
}
