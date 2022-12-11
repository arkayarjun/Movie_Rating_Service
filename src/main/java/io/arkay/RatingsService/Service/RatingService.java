package io.arkay.RatingsService.Service;


import io.arkay.RatingsService.Entity.Rating;
import io.arkay.RatingsService.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingService {

    @Autowired
    private RatingRepository repository;
    public Optional<Rating> getRatingFromUserId(int userId) {
//        return repository.findById(userId);
        Rating rat = new Rating(1,4);
        return Optional.of(rat);
    }

    public void addARating(Rating rating) {
        repository.save(rating);
    }
}
