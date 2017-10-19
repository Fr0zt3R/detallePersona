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
        View view = inflater.inflate(R.layout.list_child,viewGroup,false);
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
