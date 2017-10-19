package registromedico.idit.com.detallepersonas.Models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fr0zt3r on 18/10/17.
 */
//Clase para crear los Titulos del RecyclerView "Padre"
public class titleCreator {

    static titleCreator _titleCreator;
    List<titleParent> _titleParents;
    // Funcion para crear los titulos "principales"
    public titleCreator(Context context) {
        _titleParents = new ArrayList<>();

        _titleParents.add(new titleParent("Antecendetes patológicos familiares"));
        _titleParents.add(new titleParent("Histora familiar"));
        _titleParents.add(new titleParent("Hábitos de tabaco"));
        _titleParents.add(new titleParent("Habitos de alcohol"));
        _titleParents.add(new titleParent("Hábitos de Drogas"));
        _titleParents.add(new titleParent("Hábitos alimenticios y deportes "));
        _titleParents.add(new titleParent("Antecedentes personales y padecimiento actual"));
        _titleParents.add(new titleParent("Padece o ha padecido de: "));
        _titleParents.add(new titleParent("En caso de ser mujer, padece o ha padecido de:"));
        /*
        for (int i=0; i<10; i++)
        {
            titleParent title = new titleParent(String.format("Llamada %d", i));
            _titleParents.add(title);
        }
        */
    }

    public static titleCreator get(Context context)
    {
        if (_titleCreator == null)
        {
            _titleCreator = new titleCreator(context);
        }
        return _titleCreator;
    }

    public List<titleParent> getAll() {
        return _titleParents;
    }
}
