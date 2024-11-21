/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author issac
 */
public class tienda {

    //Atributos
    //nombres de los productos
    private String[] productos;

    //ventas semanales de los productos
    private int[][] ventas;

    //Constructor para iniciar la matriz y vector
    public tienda(int cantidadProductos) {
        productos = new String[cantidadProductos];
        ventas = new int[7][cantidadProductos];
    }

    //metodo para asignar nombres de a los productos
    public void setNombresProductos(String[] nombres) {
        for (int i = 0; i < productos.length; i++) {
            productos[i] = nombres[i];
        }
    }

    //metodo para llenar la matriz de ventas con valores
    public void llenarVentas() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < productos.length; j++) {
                ventas[i][j] = i + j;
            }
        }
    }

    //metodo para calcular el total de ventas por producto
    public int[] calcularTotalPorProducto() {
        int[] totalPorProducto = new int[productos.length];
        for (int j = 0; j < productos.length; j++) {
            for (int i = 0; i < 7; i++) {
                totalPorProducto[j] += ventas[i][j];
            }
        }
        return totalPorProducto;
    }

    //metodo para determinar el día con mayores ventas totales
    public int diaMayoresVentas() {
        int diaMayor = 0;
        int maxVentas = 0;

        for (int i = 0; i < 7; i++) {
            int totalDia = 0;
            for (int j = 0; j < productos.length; j++) {
                totalDia += ventas[i][j];
            }
            if (totalDia > maxVentas) {
                maxVentas = totalDia;
                diaMayor = i;
            }
        }
        return diaMayor;
    }

    //metodo para saber cual es el producto más vendido
    public int productoMasVendido() {
        int[] totalPorProducto = calcularTotalPorProducto();
        int productoMayor = 0;
        int maxVentas = 0;

        for (int j = 0; j < totalPorProducto.length; j++) {
            if (totalPorProducto[j] > maxVentas) {
                maxVentas = totalPorProducto[j];
                productoMayor = j;
            }
        }
        return productoMayor;
    }

    //metodo para sacar el nombre del producto segun su indice
    public String obtenerNombreProducto(int indice) {
        return productos[indice];
    }
}
