package registromedico.idit.com.detallepersonas.viewholders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import registromedico.idit.com.detallepersonas.R;


/**
 * Created by fr0zt3r on 18/10/17.
 */

public class titleParentViewHolder extends ParentViewHolder {

    public TextView _textView1;
    public ImageButton _imagenButon;

    public titleParentViewHolder(View itemView) {
        super(itemView);
        _textView1 = (TextView)itemView.findViewById(R.id.parentTitle);
        _imagenButon = (ImageButton)itemView.findViewById(R.id.expandArrow);
    }
}
