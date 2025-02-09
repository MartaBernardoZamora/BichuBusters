package org.bichascode.bichubusters.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LevelTest {
    @Test
    @DisplayName("Test getClassLevel")
    void testGetClassLevel() {
        assertThat(Level.CLASS1.getClassLevel(), equalTo("Clase I - Manifestación menor"));
    }
}
