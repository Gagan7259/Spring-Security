package com.ratingservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ratingg {
    @Id
    private String ratingId;
    private String hotelid;
    private String userId;
    private int rating;
    private String feedback;


}
