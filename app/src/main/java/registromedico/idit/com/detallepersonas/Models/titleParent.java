package registromedico.idit.com.detallepersonas.Models;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

/**
 * Created by fr0zt3r on 18/10/17.
 */

public class titleParent implements ParentObject {

    private List<Object> mChildenList;
    private UUID _id;
    private String title;

    public titleParent(String title) {
        this.title = title;
        _id = UUID.randomUUID();
    }

    public UUID getId() {
        return _id;
    }

    public void setId(UUID id) {
        this._id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildenList = list;
    }
}
