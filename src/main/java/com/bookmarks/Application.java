package com.bookmarks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by jfinlays on 12/28/16.
 */


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(AccountRepository accountRepository, BookmarkRepository bookmarkRepository) {
        return (e) -> Arrays.asList("asdasdasd,asdasdasd,asd,asdasda,sd,asd,asd,asdasdasd,asfq3fqr3,asd".split(",")).forEach(
                username -> {

                    System.out.print(username);
                    Account account = accountRepository.save(new Account(username, "password"));
                    bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1/" + username, "desc"));
                    bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2/" + username, "desc"));
                });
    }
}
