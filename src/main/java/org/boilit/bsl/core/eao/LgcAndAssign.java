package org.boilit.bsl.core.eao;

import org.boilit.bsl.ITemplate;
import org.boilit.bsl.core.AbstractAssignOperator;
import org.boilit.bsl.core.AbstractExpression;
import org.boilit.bsl.core.Operation;

/**
 * @author Boilit
 * @see
 */
public final class LgcAndAssign extends AbstractAssignOperator {
    public LgcAndAssign(final int line, final int column, final String label,
                        final AbstractExpression expression, final ITemplate template) {
        super(line, column, label, expression, template);
    }

    @Override
    protected final Object executeFragment(final Object value1, final Object value2) throws Exception {
        return Operation.doLgcAnd(value1, value2);
    }
}
