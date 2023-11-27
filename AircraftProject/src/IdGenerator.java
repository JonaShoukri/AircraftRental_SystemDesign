import java.util.UUID;
public class IdGenerator {
    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}
