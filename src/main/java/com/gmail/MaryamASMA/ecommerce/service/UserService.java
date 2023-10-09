package com.gmail.MaryamASMA.ecommerce.service;

import com.gmail.MaryamASMA.ecommerce.domain.Perfume;
import com.gmail.MaryamASMA.ecommerce.domain.Review;
import com.gmail.MaryamASMA.ecommerce.domain.User;
import graphql.schema.DataFetcher;

import java.util.List;

public interface UserService {

    User findUserById(Long userId);

    User findUserByEmail(String email);

    DataFetcher<List<User>> getAllUsersByQuery();

    DataFetcher<User> getUserByQuery();

    List<User> findAllUsers();

    List<Perfume> getCart(List<Long> perfumeIds);

    User updateProfile(String email, User user);

    Perfume addReviewToPerfume(Review review, Long perfumeId);
}
