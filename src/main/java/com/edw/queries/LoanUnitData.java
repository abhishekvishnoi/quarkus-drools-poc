package com.edw.queries;

import com.edw.model.Loan;
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
public class LoanUnitData  implements RuleUnitData {
    private DataStore<Loan> loan;

    public LoanUnitData() {
        this(DataSource.createStore());
    }

    public LoanUnitData(DataStore<Loan> loan) {
        this.loan = loan;
    }

    public DataStore<Loan> getLoan() {
        return loan;
    }

    public void setLoan(DataStore<Loan> loan) {
        this.loan = loan;
    }
}
