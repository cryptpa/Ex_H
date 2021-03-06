package org.openpredict.exchange.beans.api;


import lombok.Builder;

@Builder
public class ApiAddUser extends ApiCommand {

    public final long uid;

    @Override
    public String toString() {
        return "[ADDUSER " + uid + "]";
    }
}
