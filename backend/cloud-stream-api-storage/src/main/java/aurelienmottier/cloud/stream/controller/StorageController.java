package aurelienmottier.cloud.stream.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("storage")
public class StorageController {

    @GetMapping
    public ResponseEntity<String> dummy() {
        return new ResponseEntity<>("It's working!", OK);
    }

}