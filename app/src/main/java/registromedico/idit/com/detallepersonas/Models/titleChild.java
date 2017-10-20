package registromedico.idit.com.detallepersonas.Models;

import android.support.v7.widget.CardView;
import android.text.Layout;

/**
 * Created by fr0zt3r on 18/10/17.
 */

public class titleChild {

    public String option1;
    public String option2;


    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    //public Layout layout;
    public int cv;

    public titleChild(String option1, String option2,int cv) {
        this.option1 = option1;
        this.option2 = option2;
        this.cv = cv;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }
}
