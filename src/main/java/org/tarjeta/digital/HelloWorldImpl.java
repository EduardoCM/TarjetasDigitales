
package org.tarjeta.digital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.tarjeta.digital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

