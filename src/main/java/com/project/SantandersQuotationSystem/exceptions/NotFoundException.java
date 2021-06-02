package com.project.SantandersQuotationSystem.exceptions;

import com.project.SantandersQuotationSystem.util.MessageUtils;

public class NotFoundException extends  RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
