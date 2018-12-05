package demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/")
public class HelloController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}
