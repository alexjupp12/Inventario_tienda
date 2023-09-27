package Inventario_tienda;
public class cls_facturas {
    private String str_cod_producto;
    private int int_cantidad;
    private float flt_valorVenta;
    private float flt_total;

    public cls_facturas(String codigo, int cantidad, float valor_venta){
        this.str_cod_producto = codigo;
        this.int_cantidad = cantidad;
        this.flt_valorVenta = valor_venta;
        this.flt_total = valor_venta * cantidad;
    }

    //Getters
    public String getCodigo() {return this.str_cod_producto;}
    public int getCantidad(){return this.int_cantidad;}
    public float getValorVenta(){return this.flt_valorVenta;}
    public float getTotal(){return this.flt_total;}
}
