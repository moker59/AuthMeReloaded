package fr.xephi.authme.util;

import java.util.Optional;
import java.util.UUID;

/**
 * Utility class for various operations on UUID.
 */
public final class UuidUtils {

    // Utility class
    private UuidUtils() {
    }

    /**
     * Returns whether the given string as an UUID or an empty option
     *
     * @param string the uuid to parse
     * @return parsed UUID if succeed or an empty option
     */
    public static Optional<UUID> parseUuidSafely(String string) {
        try {
            return Optional.of(UUID.fromString(string));
        } catch (IllegalArgumentException | NullPointerException ex) {
            return Optional.empty();
        }
    }
}
