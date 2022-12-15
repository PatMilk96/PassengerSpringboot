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

	public static void main(String[] args) {
		SpringApplication.run(PassengerSpringApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPssengers(){
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Patryk", "123456789098", "0877653351", 20),
				new Passenger("Mr", "David", "0985324732921", "0859123809", 38),
				new Passenger("Mr", "Michel", "764214370326", "0895021084", 52));
		return myPassengers;
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		Passenger myPassenger = new Passenger("Mr", "Owen", "163467895438", "0877653351", 29);
		return myPassenger;
	}
}
