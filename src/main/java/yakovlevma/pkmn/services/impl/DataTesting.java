package yakovlevma.pkmn.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import yakovlevma.pkmn.controllers.CardController;
import yakovlevma.pkmn.controllers.StudentController;
import yakovlevma.pkmn.entities.CardEntity;

import java.io.File;

@Component
@RequiredArgsConstructor
public class DataTesting {

    private final ObjectMapper objectMapper;

    private final CardController cardController;

    private final StudentController studentController;

    @PostConstruct
    public void init() {
        try {
            System.out.println("Post construct init");

            File jsonFile = new File("src/main/resources/cards.json");
            CardEntity card = objectMapper.readValue(jsonFile, CardEntity.class);

            ResponseEntity<CardEntity> createdCardResponse = cardController.createCard(card);
            CardEntity createdCard = createdCardResponse.getBody();
            System.out.println("Created Card: " + createdCard);

            String cardName = createdCard.getName();
            ResponseEntity<String> imageResponse = studentController.getCardImageByName(cardName);

            if (imageResponse.getStatusCode().is2xxSuccessful() && imageResponse.getBody() != null) {
                System.out.println("Image URL: " + imageResponse.getBody());
            } else {
                System.out.println("Image not found for card: " + cardName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
