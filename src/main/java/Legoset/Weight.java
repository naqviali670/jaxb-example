package legoset;

import lombok.*;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Weight {
    @XmlValue
    private double value;


    @XmlAttribute
    private String unit;
}
