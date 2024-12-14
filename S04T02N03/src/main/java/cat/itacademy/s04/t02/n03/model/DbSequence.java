package cat.itacademy.s04.t02.n03.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Document(collection = "db_sequence")
public class DbSequence {

    @Id
    private String id;
    private Integer seq;

    public Integer getSeq() {
        return seq;
    }
}
