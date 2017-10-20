package registromedico.idit.com.detallepersonas.viewholders;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import registromedico.idit.com.detallepersonas.R;


/**
 * Created by fr0zt3r on 18/10/17.
 */

public class titleChildViewHolder extends ChildViewHolder {

    public TextView option1,option2;
    public CardView cardView;
    public View view;

    public titleChildViewHolder(View itemView) {
        super(itemView);
        this.view =itemView;
        cardView = (CardView) itemView.findViewById(R.id.cardV);
        option1 = (TextView) itemView.findViewById(R.id.option1);
        option2 = (TextView) itemView.findViewById(R.id.option2);


    }



}
