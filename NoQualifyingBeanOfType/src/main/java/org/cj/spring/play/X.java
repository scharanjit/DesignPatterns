package org.cj.spring.play;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {

    @Autowired
    Y y;

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }
}

//Please note that we are using Autowired annotation to inject bean y in x.