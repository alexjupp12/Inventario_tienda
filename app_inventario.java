package Inventario_tienda;
import javax.swing.JOptionPane;

public class app_inventario {
    static cls_producto [] productos = new cls_producto[100];
    static int int_posicionesP = 0;
    static boolean bln_sw;
    static int int_pos;
    public static void main(String[] args){
        fnt_menuP(true);
    }


    private static void fnt_registrar(String cod, String nom, String des,int stock,float val_c,float ganancia){
        productos [int_posicionesP] = new cls_producto(cod, nom, des, stock, val_c, ganancia);
        int_posicionesP += 1;
        JOptionPane.showMessageDialog(null, "Producto Registrado","Registrar",JOptionPane.INFORMATION_MESSAGE);
    }
    private static void fnt_consultar(String codigo){
        bln_sw = false;
        int_pos = 0;
        for(int i = 0; i < int_posicionesP; i++){
            if(codigo.equals(productos[i].getCodigo())){
                bln_sw = true;
                int_pos = i;
                break;
            }
        }
        if (bln_sw == false) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningun registro");
        }else{
            JOptionPane.showMessageDialog(null, "Nombre: " + productos[int_pos].getNombre() + "\nProducto: " + productos[int_pos].getDescripcion() + "\nStock: " + productos[int_pos].getStock() + "\nValor de Compra: " + productos[int_pos].getValorCompra() + "\nGanancia" + productos[int_pos].getGanancia() + "\nValor de Venta: " + productos[int_pos].getValorVenta());
        }
    }

    private static void fnt_selector(int opcion){
        if(opcion == 1){
            String cod = JOptionPane.showInputDialog(null,"Codigo");
            String nombre = JOptionPane.showInputDialog(null,"Nombre");
            String desc = JOptionPane.showInputDialog(null,"Descripcion");
            int stock = Integer.parseInt(JOptionPane.showInputDialog(null, "Stock"));
            float vcompra = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de compra"));
            float ganancia = Float.parseFloat(JOptionPane.showInputDialog(null, "Ganancia" ));
            fnt_registrar(cod, nombre, desc, stock, vcompra, ganancia);
        }
        if(opcion == 2){
            String cod = JOptionPane.showInputDialog(null, "Ingrese el codigo");
            fnt_consultar(cod);
        }
    }
    

    private static void fnt_menuP(boolean men){
        while(men = true){
            int m = Integer.parseInt(JOptionPane.showInputDialog(null, "<<<MENU PRINCIPAL>>>\n"+
            "1. Registrar producto\n"+
            "2. Consultar Producto\n"+
            "3. Actualizar producto\n"+
            "4. Registro de compra\n"+
            "5. Reportes\n"+
            "6. Salir"));
            fnt_selector(m);

            if (m == 6){
                System.exit(0);
            }
        }
    }

}