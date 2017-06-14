package com.taxback2.backend.persistence.domain.backend;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Administrator on 6/15/2017.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {

        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
