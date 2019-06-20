package fr.xephi.authme.util;

import java.util.Optional;
import java.util.UUID;

/**
 * Utility class for various operations on UUID.
 */
public final class UUIDUtils {

    // Utility class
    private UUIDUtils() {
    }

    public static Optional<UUID> parseUUIDSafely(String string) {
        try {
            return Optional.of(UUID.fromString(string));
        } catch (IllegalArgumentException | NullPointerException ex) {
            return Optional.empty();
        }
    }
}
