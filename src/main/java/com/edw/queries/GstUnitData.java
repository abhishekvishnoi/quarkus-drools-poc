package com.edw.queries;

import com.edw.model.Gst;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

/**
 * <pre>
 *     com.edw.queries.LoanUnitData
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 15 Mar 2023 10:36
 */
public class GstUnitData implements RuleUnitData {
    private DataStore<Gst> gst;

    public GstUnitData() {
        this(DataSource.createStore());
    }

    public GstUnitData(DataStore<Gst> gst) {
        this.gst = gst;
    }

    public DataStore<Gst> getGst() {
        return gst;
    }

    public void setGst(DataStore<Gst> gst) {
        this.gst = gst;
    }
}
