package registromedico.idit.com.detallepersonas.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    // Se cargan los Items de forma estatica
   static
   {
       addItem(new DummyItem("1", "Juan","Flores", "Masculino", "21 Enero 1990", "Ingeniero", "30 Poniente 2012", "JUFF210290DF", "JUFF210290HPLPSD"));
       addItem(new DummyItem("2", "Francisco","Ramirez", "Masculino","10 Marzo 1985", "Secretario", "Av La Paz 166", "FRRA100385SD", "FRRA100385HPLDS"));
       addItem(new DummyItem("3", "Adrian","Camacho", "Masculino", "7 Julio 1987", "Intendete", "Privada 30 Sur 9", "ADCC070787FS", "ADCC070787HPLNSD"));

   }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String nombre;
        public String apellido;
        public String sexo;
        public String nacimiento;
        public String ocupacion;
        public String direccion;
        public String rfc;
        public String curp;

        public DummyItem(String id, String nombre, String apellido, String sexo, String nacimiento, String ocupacion, String direccion, String rfc, String curp)
        {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.sexo = sexo;
            this.nacimiento = nacimiento;
            this.ocupacion = ocupacion;
            this.direccion = direccion;
            this.rfc = rfc;
            this.curp = curp;

        }
        @Override
        public String toString()
        {
            return nombre + " " + apellido;
        }

    }
}
