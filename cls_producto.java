package Inventario_tienda;
public class cls_producto{
    private String str_codigo;
    private String str_nombre;
    private String str_descripcion;
    private int int_stock;
    private float flt_valorCompra;
    private float flt_ganancia;
    private float flt_valorVenta;

    public cls_producto(String cod,String nom,String des,int stock,float val_c,float ganancia){
        this.str_codigo = cod;
        this.str_nombre = nom;
        this.str_descripcion = des;
        this.int_stock = stock;
        this.flt_valorCompra = val_c;
        this.flt_ganancia = ganancia;

        //calcular valor venta
        this.flt_valorVenta = (flt_valorCompra * ganancia) + flt_ganancia;
    }

    //setters
    public void setNombre(String nombre) {this.str_nombre = nombre;}
    public void setDescripcion(String descripcion) {this.str_descripcion = descripcion;}
    
    //getters
    public String getCodigo() {return this.str_codigo;}
    public String getNombre() {return this.str_nombre;}
    public String getDescripcion() {return this.str_descripcion;}
    public int getStock() {return this.int_stock;}
    public float getValorCompra() {return this.flt_valorCompra;}
    public float getGanancia() {return this.flt_ganancia;}
    public float getValorVenta(){return this.flt_valorVenta;}
    
}