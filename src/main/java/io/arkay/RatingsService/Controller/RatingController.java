package io.arkay.RatingsService.Controller;

import io.arkay.RatingsService.Entity.Rating;
import io.arkay.RatingsService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/add")
    public String addRating(@RequestBody Rating rating){
        ratingService.addARating(rating);
        return "Success";
    }

    @GetMapping("/{userId}")
    public Optional<Rating> getRatingByUserId(@PathVariable int userId){
        return ratingService.getRatingFromUserId(userId);
    }
}
