package com.jimbarritt.tutorial.oo_relationships.volume;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.volume.Volume.UnitOfMeasure.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class VolumeAttributeRendererTest {

    private final Volume twentyLitres = new Volume(20, LITRES);

    @Test
    public void formatsInLitres() {
        String representation = new VolumeAttributeRenderer().toString(twentyLitres, "litres");

        assertThat(representation, containsString("20.00 litres"));
    }

    @Test
    public void formatsInLitresWithShortFormat() {
        String representation = new VolumeAttributeRenderer().toString(twentyLitres, "litres-short");

        assertThat(representation, containsString("20.00l"));
    }


    @Test
    public void convertsToCc() {
        String representation = new VolumeAttributeRenderer().toString(twentyLitres, "cc");

        assertThat(representation, containsString("20000 cubic centimetres"));
    }

    @Test
    public void formatsCcInShortFormat() {
        String representation = new VolumeAttributeRenderer().toString(twentyLitres, "cc-short");

        assertThat(representation, containsString("20000cc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failsIfFormatNotRecognised() {
        new VolumeAttributeRenderer().toString(twentyLitres, "foobar");
    }

}
