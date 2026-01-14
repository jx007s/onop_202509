package anno_p.phone;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = {"anno_p.comp","anno_p.bro"})
@ImportResource("di/array.xml")
public class ConfigScan {

}
