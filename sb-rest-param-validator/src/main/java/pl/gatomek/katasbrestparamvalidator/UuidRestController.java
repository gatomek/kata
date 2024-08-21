package pl.gatomek.katasbrestparamvalidator;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Validated
public class UuidRestController {

  @GetMapping( "/uuid")
  UUID getUUID( @RequestParam( name = "v", defaultValue = "4")
                @Min(value = 1, message = "Must be at least 1")
                @Max( value = 4, message = "must be at most 4")
                Integer version) {
    return UUID.randomUUID();
  }
}
