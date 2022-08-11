package be.intecbrussel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@With
@AllArgsConstructor
@NoArgsConstructor
public class LazyStudent {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
}
