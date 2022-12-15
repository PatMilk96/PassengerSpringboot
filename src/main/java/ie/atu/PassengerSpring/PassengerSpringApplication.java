package ie.atu.PassengerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@SpringBootApplication
@RequestMapping(path="/api/passenger")
public class PassengerSpringApplication {

	PassengerService myService;
	public static void main(String[] args) {
		SpringApplication.run(PassengerSpringApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPssengers(){
		return myService.getPssengers();
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		return myService.getPassenger(passengerID);
	}
}
