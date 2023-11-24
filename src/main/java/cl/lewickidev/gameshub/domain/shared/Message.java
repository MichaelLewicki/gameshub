package cl.lewickidev.gameshub.domain.shared;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RegisterForReflection
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String message;

}
