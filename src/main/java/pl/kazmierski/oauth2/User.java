package pl.kazmierski.oauth2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String login;
    private String password;
}
