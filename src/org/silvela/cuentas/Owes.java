package org.silvela.cuentas;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Owes {
    private final String from;
    private final String to;
    private final int amount;

    public Owes(final String f, final String t, final int a) {
        from = f;
        to = t;
        amount = a;
    }

    @Override public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getAmount() {
        return amount;
    }
}
