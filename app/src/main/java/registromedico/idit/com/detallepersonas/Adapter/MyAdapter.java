package registromedico.idit.com.detallepersonas.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;


import java.util.List;

import registromedico.idit.com.detallepersonas.Models.titleChild;
import registromedico.idit.com.detallepersonas.Models.titleParent;
import registromedico.idit.com.detallepersonas.R;
import registromedico.idit.com.detallepersonas.viewholders.titleChildViewHolder;
import registromedico.idit.com.detallepersonas.viewholders.titleParentViewHolder;

/**
 * Created by fr0zt3r on 18/10/17.
 */

public class MyAdapter extends ExpandableRecyclerAdapter<titleParentViewHolder, titleChildViewHolder>{

    LayoutInflater inflater;
    int viewType = 0;
    final int ANT_PATOLOGICO = 0;
    final int HISTORIA = 1;
    final int TABACO = 2;
    final int ALCOHOL = 3;
    final int DROGAS = 4;
    final int HABITOS = 5;
    final int ANT_PERSONALES = 6;
    final int PADECIMIENTOS = 7;
    final int PADECIMIENTOS_MUJER = 8;



    public MyAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater = LayoutInflater.from(context);
    }


    @Override
    public titleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_parent,viewGroup,false);
        return new titleParentViewHolder(view);
    }

    @Override
    public titleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
       //Agregar Switch para los diferentes layouts
        View view;

        int a = viewGroup.getChildCount();
        switch (a){
            case ANT_PATOLOGICO:
                 view = inflater.inflate(R.layout.patologico_list, viewGroup, false);
                break;
            case HISTORIA:
                view = inflater.inflate(R.layout.historia_list, viewGroup, false);
                break;
            case TABACO:
                view = inflater.inflate(R.layout.tabaco_list, viewGroup, false);
                break;
            case ALCOHOL:
                view = inflater.inflate(R.layout.alcohol_list, viewGroup, false);
                break;
            case DROGAS:
                view = inflater.inflate(R.layout.drogas_list, viewGroup, false);
                break;
            case HABITOS:
                view = inflater.inflate(R.layout.habitos_list, viewGroup, false);
                break;
            case ANT_PERSONALES:
                view = inflater.inflate(R.layout.ant_personales_list, viewGroup, false);
                break;
            case PADECIMIENTOS:
                view = inflater.inflate(R.layout.padecimientos_list, viewGroup, false);
                break;
            case PADECIMIENTOS_MUJER:
                view = inflater.inflate(R.layout.padecimientos_mujer_list, viewGroup, false);
                break;
            default:
                 view = inflater.inflate(R.layout.hijo, viewGroup, false);
        }


        return new titleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(titleParentViewHolder titleParentViewHolder, int i, Object o) {
        titleParent title = (titleParent) o;
        titleParentViewHolder._textView1.setText(title.getTitle());
    }

    @Override
    public void onBindChildViewHolder(titleChildViewHolder titleChildViewHolder, int i, Object o) {
        titleChild title = (titleChild) o;

        titleChildViewHolder.option1.setText(title.getOption1());
        titleChildViewHolder.option2.setText(title.getOption2());
    }
}
