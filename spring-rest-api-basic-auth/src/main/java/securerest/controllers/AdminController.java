package securerest.controllers;

import com.learnshare.securerest.bean.HelloMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/admin")
@Api(value = "admin", description = "Rest API for administrative operations", tags = "Admin API")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping(value = "/greet/{name}", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Say 'Hi' to the admin user", response = HelloMessage.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
            @ApiResponse(code = 404, message = "The resource not found")
    }
    )
    public HelloMessage sayHello(@PathVariable String name) {
        System.out.println(name + " trying to login.");
        HelloMessage helloMessage = new HelloMessage(name, "Hi Admin " + name + ", Happy Learning...");
        return helloMessage;
    }


    @RequestMapping(value = "/persistHL7", method = RequestMethod.POST, produces = "text/plain", consumes = "text/plain")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
            @ApiResponse(code = 404, message = "The resource not found")
    }
    )
    @ResponseBody
    public ResponseEntity<String> persistHL7(@RequestBody String name) {
        logger.info("Post request is successful..");
        System.out.println(name);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
