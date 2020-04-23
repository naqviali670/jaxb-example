package legoset;

import lombok.*;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Minifig {

    @XmlAttribute
    private int count;

    @XmlValue
    private String title;
}
