package registromedico.idit.com.detallepersonas.Models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fr0zt3r on 18/10/17.
 */

public class titleCreator {

    static titleCreator _titleCreator;
    List<titleParent> _titleParents;
    // Funcion para crear los titulos "principales"
    public titleCreator(Context context) {
        _titleParents = new ArrayList<>();

        for (int i=0; i<10; i++)
        {
            titleParent title = new titleParent(String.format("Llamada %d", i));
            _titleParents.add(title);
        }
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
