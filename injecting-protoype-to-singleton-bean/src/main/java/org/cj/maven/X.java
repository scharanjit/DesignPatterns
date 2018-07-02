package org.cj.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

public class X {

    @Autowired
    Y y;

//    @Lookup  // try uncommenting and see teh output
    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }
}