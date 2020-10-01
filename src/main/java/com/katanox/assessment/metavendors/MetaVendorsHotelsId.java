package com.katanox.assessment.metavendors;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
public class MetaVendorsHotelsId implements Serializable {

    @Column(name = "meta_vendors_id")
    private Long metaVendorsId;

    @Column(name = "hotel_id")
    private Long hotelId;


    //The @Embeddable type must override the default equals and hashCode methods based on the two Primary Key identifier values.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MetaVendorsHotelsId that = (MetaVendorsHotelsId) o;
        return Objects.equals(metaVendorsId, that.metaVendorsId) &&
                Objects.equals(hotelId, that.hotelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaVendorsId, hotelId);
    }

}
