package org.akaza.openclinica.designer.web.fields.validators;

import org.apache.commons.lang.math.NumberUtils;

public class IntegerValidator extends FieldValidator {

    @Override
    public String getMessagePrefix() {
        return "Incorrect";
    }

    @Override
    public String getValidatorCSSClassName() {

        return "NUMERIC";
    }

    @Override
    public boolean isValid(Object fieldValue) {
        if (fieldValue != null)
            return NumberUtils.isDigits(fieldValue.toString());
        return true;
    }

}
