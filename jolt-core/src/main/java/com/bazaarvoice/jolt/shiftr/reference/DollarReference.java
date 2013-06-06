package com.bazaarvoice.jolt.shiftr.reference;

public class DollarReference extends BasePathAndGroupReference {

    public static final Character TOKEN = '$';

    public DollarReference( String refStr ) {
        super(refStr);
    }

    @Override
    protected char getToken() {
        return TOKEN;
    }
}