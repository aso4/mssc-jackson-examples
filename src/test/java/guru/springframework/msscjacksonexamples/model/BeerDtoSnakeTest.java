package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto = getDto();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
        // {"id":"6af1691d-969e-4cbf-9035-ee1739b3691f","beer_name":"BeerName","beer_style":"Ale","upc":123123123123,"price":12.99,"created_date":"2021-03-08T21:46:49.716692-05:00","last_updated_date":"2021-03-08T21:46:49.717346-05:00"}
    }
}
