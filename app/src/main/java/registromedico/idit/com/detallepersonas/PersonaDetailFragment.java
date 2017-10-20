package registromedico.idit.com.detallepersonas;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import registromedico.idit.com.detallepersonas.Adapter.ExpandableListAdapter;
import registromedico.idit.com.detallepersonas.dummy.DummyContent;

/**
 * A fragment representing a single Persona detail screen.
 * This fragment is either contained in a {@link PersonaListActivity}
 * in two-pane mode (on tablets) or a {@link PersonaDetailActivity}
 * on handsets.
 */
public class PersonaDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PersonaDetailFragment() {
    }

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.persona_detail, container, false);
        //Modificar para agregar datos al View
        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.txtnombre)).setText(mItem.nombre + " " + mItem.apellido);
            ((TextView) rootView.findViewById(R.id.txtsexo)).setText(mItem.sexo);
            ((TextView)rootView.findViewById(R.id.txtnacimiento)).setText(mItem.nacimiento);
            ((TextView)rootView.findViewById(R.id.txtocupacion)).setText(mItem.ocupacion);
            ((TextView)rootView.findViewById(R.id.txtdireccion)).setText(mItem.direccion);
            ((TextView)rootView.findViewById(R.id.txtrfc)).setText(mItem.rfc);
            ((TextView)rootView.findViewById(R.id.txtcurp)).setText(mItem.curp);

        }

        // Agregamos los archivos
        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);



        return rootView;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Antecedentes Patologicos");
        listDataHeader.add("Historia Familiar");
        listDataHeader.add("Hábitos de tabaco ");
        listDataHeader.add("Hábitos de alcohol ");
        listDataHeader.add("Hábitos de droga ");
        listDataHeader.add("Hábitos alimenticios y deporte ");
        listDataHeader.add("Antecedentes personales y padecimiento actual ");
        listDataHeader.add("Padece o ha padecido: ");


        // Adding child data
        List<String> Antecedentes = new ArrayList<String>();
        Antecedentes.add("Diabetes");
        Antecedentes.add("Enfermedad Riñones");
        Antecedentes.add("Enfermedad Pulmones");
        Antecedentes.add("Presión arterial Alta");


        List<String> Historia = new ArrayList<String>();
        Historia.add("Datos del Padre");
        Historia.add(" 70 años, Saludable");
        Historia.add("Datos de la madre");
        Historia.add("65 años,  Saludable");
        Historia.add("Red 2");
        Historia.add("The Wolverine");

        List<String> tabaco = new ArrayList<String>();
        tabaco.add("No fuma Actualmente");
        tabaco.add("No ha fumado anteriormente");

        List<String> alcohol = new ArrayList<String>();
        alcohol.add("No bebe");

        List<String> droga = new ArrayList<String>();
        droga.add("10 Enero 2005 Marihuana Ocasional");
        droga.add("Ha pertenecido a un instituto de rehabilitación");

        List<String> habitos = new ArrayList<String>();
        habitos.add("Ha disminuido 5 Kg en el ultimo año");
        habitos.add("Practica Crossfit 3 dias a la semana");

        List<String> personales = new ArrayList<String>();
        personales.add("No padece actualmente una enfermedad");
        personales.add("No ha consumido medicamento en las ultimas 24 horas");


        List<String> padecimientos = new ArrayList<String>();
        padecimientos.add("Infarto");
        padecimientos.add("Ulcera en estomago");
        padecimientos.add("Ha estado hospitalizado");


        listDataChild.put(listDataHeader.get(0), Antecedentes); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Historia);
        listDataChild.put(listDataHeader.get(2), tabaco);
        listDataChild.put(listDataHeader.get(3), alcohol);
        listDataChild.put(listDataHeader.get(4), droga);
        listDataChild.put(listDataHeader.get(5), habitos);
        listDataChild.put(listDataHeader.get(6), personales);
        listDataChild.put(listDataHeader.get(7), padecimientos);


    }
}
