package MovieDataBaseDTO;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import MovieDataBaseJPA.Film;

public class TestParseDTO {

	public static void main(String[] args) throws Exception{
		 
		 
		/** cree une instance de ObjectMapper */
		ObjectMapper mapper = new ObjectMapper();
		
		List<Film> films = mapper.readValue(new File("C:\\Users\\far23\\PremiersPasJava\\MovieDataBaseJPA"), Film.class);

	for(Film f: films) {
		System.out.println(f);
	}
	
	}

}
