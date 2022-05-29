package hueta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Role implements Serializable {

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    private Long id;


    private String name;


    private Set<Dto> users;
}